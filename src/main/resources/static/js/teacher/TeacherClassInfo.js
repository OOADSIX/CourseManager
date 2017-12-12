var thisURL = document.URL;
var getVal = thisURL.split('?')[1];
var getVal1 = getVal.split('&&')[0];
var id = getVal1.split("=")[1];
console.log(id);

var courseId=getVal.split('&&')[1].split("=")[1];
$.ajax({
    type: "get",
    url: "/course/"+id,
    success: function(data) {
        var content=document.getElementById("content");
        console.log(content)
        content.empty;
        var str="";

        str=str+"<div class='item'>"+
            "<label class='itemName'>"+"班级名称:"+"</label>"+
        "<label class='itemName' id='name'>"+data.name+"</label>"+
        "</div>"+

        "<div class='item'>"+
            "<label class='itemName'>"+"上课地点:"+"</label>"+
        "<label class='itemName' id='place'>"+data.site+"</label>"+
            "</div>"+

            "<div class='item'>"+
            "<label class='itemName'>"+"上课时间:"+"</label>"+
        "<label class='itemName' id='time'>"+data.time+ "</label>"+
            // "<label class='itemName'>"+"周三12节"+"</label>"+
            +"</div>"+

            "<div class=item'>"+
            "<label class='itemName'>"+"评分规则:"+"</label>"+
        "<label class='itemName'>"+"讨论课分数占比"+"</label>"+
            "<label class='itemName' id='senimar'>"+data.presentation+" </label>"+
            "<label class='itemName'>"+ "报告分数占比"+"</label>"+
            "<label class='itemName' id='report'>"+data.report+"</label>"+
            "</div>"+

            "<div class='item' style='margin-left: 25%'>"+
            "<label class='smallItemName'>"+"5分占比"+"</label>"+
        "<label type='text' name='seminarGrade' class='smallInput'>"+data.a+"</label>"+
            "<label class='smallItemName'>"+"4分占比"+"</label>"+
            "<label type='text' name='seminarGrade' class='smallInput'>"+data.b+"</label>"+
            "<label class='smallItemName'>"+"3分占比"+"</label>"+
            "<label type='text' name='seminarGrade' class='smallInput'>"+data.c+"</label>"+
            "</div>"+

        //     "<div class='item'>"+
        //     "<label class='itemName'>"+"开始时间:"+"</label>"+
        // "<label class='itemName' id='begintime'>"+"2017/11/11"+"</label>"+
        //     "<label class='itemName'>"+"开始时间"+"</label>"+
        //     "<input class='timeStyle' value='2017/11/14' id='endtime'>"+
        //     "</div>"
            +
            "<div class='item'>"+
            "<label class='itemName'>"+"导入学生名单:"+"</label>"+
        "<button class='selectFile'>"+"下载文件"+"</button>"+
            "</div>"+

            "<div class='item'>"+
            "<button class='submit' onclick=updateClass("+id+")>"+"修改"+"</button>"+
            "<button class='reset'>"+"删除班级"+"</button>"+
            "<div class='clear'>"+"</div>"+
            "</div>"+

            "<div class='item'>"+
            "<div class='clear'></div>"+
            "</div>"

        ;

        content.innerHTML=str;

    }
});

function updateClass(id) {
    console.log(id);
    window.location.href="/TeacherUpdateClass?classId="+id+"&&courseId="+courseId;
}

function returnClassHomePage()
{
    window.location.href="/TeacherCourseInformation?courseId="+courseId;
}
