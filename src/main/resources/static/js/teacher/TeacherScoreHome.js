var thisURL = document.URL;
var getVal = thisURL.split('?')[1];
var id = getVal.split("&&")[0].split("=")[1];

var courseId=getVal.split("&&")[1].split("=")[1];

$(document).ready(function(){
    get();
});

function get() {
    var str="";
    $("#content").html("");
    $.ajax({
        type: "get",
        url: "/seminar/"+id+"/group",
        success: function(data) {
            for(var i=0;i<data.length;i++){
                console.log(data[i].id);
                str+=getById(data[i].id);
            }
            $("#content").append(str);
        }
    });
}

function getById(id) {
    var body="";
    $.ajax({
        type: "get",
        url: "/group/"+id,
        success: function(data) {
            for(var i=0;i<data.length;i++){
                console.log("in");
                body+="<tr>" +
                    "                    <td>"+data[i].id+"</td>" +
                    "                    <td>"+data[i].name+"</td>" +
                    "                    <td>xxx</td>" +
                    "                    <td>5</td>" +
                    "                    <td>已提交</td>" +
                    "                    <td>5</td>" +
                    "                    <td>5</td>" +
                    "                    <td>" +
                    "                        <img src=\"Img/view.png\" alt=\"预览\">" +
                    "                        <img src=\"Img/download.png\" alt=\"下载\">" +
                    "                    </td>" +
                    "                </tr>";
            }
        }
    });
    console.log(body);
    return body;
}