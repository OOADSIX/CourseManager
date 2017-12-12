$(function () {
    var Url = "/class";
    //var Url = "http://rap.taobao.org/mockjsdata/29816/get/class";
    $.get(Url, function (data) {
        console.log(data);
        if (data.length != undefined) {
            for (var i = 0; i < data.length; i++) {
                $(".content").append(" <div class=\"main_box_right_content\" id=" + data[i].id + ">\n" +
                    "            <h3 class=\"classtitle\">" + data[i].name + "\n" +
                    "                <button id='selectClass'>选择课程</button>\n" +
                    "            </h3>\n" +
                    "            <hr/>\n" +
                    "            <div class=\"classinfo\">\n" +
                    "                <span>班级：" + data[i].name + "</span><br/>\n" +
                    "                <span>学生人数：" + "60" + "人</span><br/>\n" +
                    "                <span>课程地点：" + data[i].site + "</span><br/>\n" +
                    "                <span>课程时间：" + data[i].name + "</span><br/>\n" +
                    "                <span>开始时间：1/9/2017</span><br/>\n" +
                    "                <span>结束时间：1/1/2018</span><br/>\n" +
                    "            </div>\n" +
                    "        </div>")

            }
        }
    })
    //点击选课按钮后的情况
    $(".body").on("click", "#selectClass", function () {
        if (confirm("确认选择该班级")) {
            //var classId = $(this).parent().parent().attr("id");
            var classId = 34;
            var student = {
                id: 233
            }
            console.log(classId);
            $.ajax({
                //url: "http://rap2api.taobao.org/app/mock/933/POST/class/34/student",
                 url: "/class/"+classId+"/student",
                type: "PUT",
                contentType: "application/json",
                data: JSON.stringify(student),
                success: function (data) {
                    console.log(data);
                    alert("选课成功");
                    $("#selectClass").hide();
                }
            });
        }
    })
})