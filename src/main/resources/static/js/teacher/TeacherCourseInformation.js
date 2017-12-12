/**
 * Created by pro on 2017/12/3.
 */

var thisURL = document.URL;
var getVal = thisURL.split('?')[1];
var id = getVal.split("=")[1];

$(document).ready(function(){
    show();
    load();
});

function show() {
    // console.log("in");
    var thisURL = document.URL;
    var getVal = thisURL.split('?')[1];
    var id = getVal.split("=")[1];
    //var id=
    //var id='<%=request.getAttribute("courseId")%>';
    console.log(id);
    $.ajax({
        type: "get",
        url: "/course/"+id+"/class",
        success: function(data) {
            //alert(data[0].numStudent);
            var content=document.getElementById("course");
            content.empty;
            var str="";
            for(var i=0;i<data.length;i++)
            {
                console.log(data[i].name);
                str=str+"<div class='block'>"+"<div class='blockFont' onclick=getClass("+data[i].id+")>"+data[i].name+"</div>"+"</div>";
            }
            str+="<div class='block' onclick=\"addClass()\">\n" +
                "\t\t\t\t<img class=\"addcourse\" src=\"Img/add.png\">\n" +
                "\t\t\t\t\n" +
                "\t\t    </div>";
            content.innerHTML=str;

        }
    });
}

function getClass(classid) {
    window.location.href="/TeacherClassInfo?classId="+classid+"&&courseId="+id;
}

function getSenimar(senimarid) {
    window.location.href="/TeacherSenimarInfo?senimarId="+senimarid+"&&courseId="+id;
}

function load() {

    //var id=
    //var id='<%=request.getAttribute("courseId")%>';
    console.log(id);
    $.ajax({
        type: "get",
        url: "/course/"+id+"/seminar",
        success: function(data) {
            //alert(data[0].numStudent);
            var content=document.getElementById("senimar");
            content.empty;
            var str="";
            for(var i=0;i<data.length;i++)
            {
                console.log(data[i].name+data[i].id);
                str=str+"<div class='block'>"+"<div class='blockFont' onclick=getSenimar("+data[i].id+")>"+data[i].name+"</div>"+"</div>";
            }
            str+="<div class='block' onclick=\"addSenimar()\">\n" +
                "\t\t\t\t<img class=\"addcourse\" src=\"Img/add.png\">\n" +
                "\t\t\t\t\n" +
                "\t\t    </div>";
            content.innerHTML=str;

        }
    });
}

function addClass() {
    window.location.href="/TeacherCreateClass?courseId="+id;
}

function addSenimar() {
    window.location.href="/TeacherCreateSeminar?courseId="+id;
}