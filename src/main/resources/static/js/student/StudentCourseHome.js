var classId = 23;

function disapear(id){
    if (confirm("确认退选该班级？")) {
        //var classId = $(this).parent().parent().attr("id");
        classId = 34;
        var student = {
            id: 233
        }
        console.log(classId);
        //todo
        //删除课程的ajax
        alert("成功退选课程");
        $("#"+id).hide();
    }
}


$(function () {
    var Url = "/class";
    //var Url = "http://rap.taobao.org/mockjsdata/29816/get/class";
    $.get(Url, function (data) {
        console.log(data);
        if (data.length != undefined) {
            for (var i = 0; i < data.length; i++) {
                $(".content").append("<div class=\"main_box_right_content\" id=" + i + ">\n" +
                    "            <h3 class=\"classtitle\">" + data[i].name + "\n" +
                    "                <button id='dropClass' onclick='disapear(" + i + ")'>退选课程</button>\n" +
                    "            </h3>\n" +
                    "            <hr/>\n" +
                    "            <div class=\"classinfo\" id=" + data[i].id + ">\n" +
                    "                <span class=\"info\">班级：" + data[i].name + "</span><br/>\n" +
                    "                <span class=\"info\">学生人数：" + "60" + "人</span><br/>\n" +
                    "                <span class=\"info\">课程地点：" + data[i].site + "</span><br/>\n" +
                    "                <span class=\"info\">课程时间：" + data[i].name + "</span><br/>\n" +
                    "                <span class=\"info\">开始时间：1/9/2017</span><br/>\n" +
                    "                <span class=\"info\">结束时间：1/1/2018</span><br/>\n" +
                    "            </div>\n" +
                    "        </div>")

            }
        }
    })


    ////点击退选按钮
    //$(".body").on("click","#dropClass",function () {
    //    if (confirm("确认退选该班级？")) {
    //        //var classId = $(this).parent().parent().attr("id");
    //        classId = 34;
    //        var student = {
    //            id: 233
    //        }
    //        console.log(classId);
    //        //todo
    //        //删除课程的ajax
    //        alert("成功退选课程");
    //        $(".main_box_right_content").hide();
    //    }
    //})
    //点击课程框，跳转到学生课程首页
    $(".body").on("click",".classinfo",function () {
        var courseId = $(this).parent().attr("id");
        var classId = $(this).attr("id");
        window.location.href = "/StudentCourseInformation?courseId="+courseId+"&classId="+classId;
    })
})
