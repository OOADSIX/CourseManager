function getQueryString(name) {
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
	var r = window.location.search.substr(1).match(reg); //获取url中"?"符后的字符串并正则匹配
	var context = "";
	if(r != null)
		context = r[2];
	reg = null;
	r = null;
	return context == null || context == "" || context == "undefined" ? "" : context;
};
var courseId = getQueryString("courseId") != "" ? getQueryString("courseId") : 23;
var classId = getQueryString("classId") != "" ? getQueryString("classId") : 23;
$(function() {
	$.ajax({
		url: "/course/" + courseId,
		//url: "http://rap2api.taobao.org/app/mock/933/GET/course/" + courseId,
		type: "GET",
		success: function(data) {
			console.log(data);
			$(".courseName").text(data.name);
			$(".courseIntroduction").text(data.description);
		}
	})

	$.ajax({
		url: "/class/" + classId + "/classgroup",
		//url: "http://rap2api.taobao.org/app/mock/933/GET/class/23/classgroup",
		type: "GET",
		success: function(data) {
			console.log(data);
			$("[name=table1]").append("  <tr>\n" +
				"                            <td>队长</td>\n" +
				"                            <td>" + data.leaderList[0].number + "</td>\n" +
				"                            <td>" + data.leaderList[0].name + "</td>\n" +
				"                        </tr>")
			if(data.memberList.length != undefined) {
				for(var i = 0; i < data.memberList.length; i++) {
					if(i % 2 == 0) {
						$("[name=table1]").append(" <tr class=\"alt\">\n" +
							"                            <td>队员</td>\n" +
							"                            <td>" + data.memberList[i].number + "</td>\n" +
							"                            <td>" + data.memberList[i].name + "</td>\n" +
							"                            <td><img src=\"../../Img/home.png\"></td>\n" +
							"                        </tr>")
					} else {
						$("[name=table1]").append(" <tr>\n" +
							"                            <td>队员</td>\n" +
							"                            <td>" + data.memberList[i].number + "</td>\n" +
							"                            <td>" + data.memberList[i].name + "</td>\n" +
							"                            <td><img src=\"../../Img/home.png\"></td>\n" +
							"                        </tr>")
					}
				}
			}
		}
	})

	//点击了查询按钮
	$(".body").on("click", "#findStudent", function() {
		//todo

	})
	//返回上个界面
	$("#return").click(function() {
		window.location.href = "/StudentViewGroupPage";
	})
})