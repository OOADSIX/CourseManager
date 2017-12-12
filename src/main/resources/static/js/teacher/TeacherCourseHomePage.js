function show() {
	$.ajax({
		type: "get",
		url: "/course",
		success: function(data) {
			//alert(data[0].numStudent);
			var content=document.getElementById("container");
			content.empty;
			var str="";
			for(var i=0;i<data.length;i++)
			{
				var num=data[i].id;
				console.log(num);
				str=str+ "<div class='main_box_right_content'>"+
				"<a class='classtitle'>"+"<a href=/TeacherCourseInformation?courseId="+num+">"+data[i].name+"</a>"+
				"<button onclick=deleteCourse("+ num +");>"+"删除课程"+"</button>"+ "<div id='light' class='white_content'>"
				+"<div class='top'>"+"修改课程"+"</div>"
				+"<form id='courseinfo'>"+
				"<div>"
				+"<ul>"
				+"<li>"+"<p>"+"课程名称:" + "<input id='coursename'/>"+" </p>"+"</li>"+
			    "<li>"+"<p>"+"开始时间："+"<input type='date' id='begintimeTwo'/>"+"</p>"+"</li>"+
				"<li>"+"<p>"+"结束时间："+"<input type='date' id='endtimeTwo'/>"+"</p>"+"</li>"+
				'<li>'+"<p>"+"讨论课分数占比:"+"<input type='text' name='seminarscore' id='seminar'/>"+"</p>"+"</li>"+
				"<li>"+"<p>"+"报告分数占比："+"<input type='text' name='reportscore' id='report'/>"+"</p>"+"</li>"+
				"<li>"+"<p>"+"五分占比:"+"<input type='text' name='five' id='five'/>"+"</p>"+"</li>"+
				"<li>"+"<p>"+"四分占比 ："+"<input type='ext' name='four' id='four'/>"+"</p>"+"</li>"+
				"<li>"+"<p>"+"三分占比 "+"<input type='text' name='three' id='three'/>"+"</p>"+"</li>"+
				"<li>"+"<p>"+"课程介绍: "+"<textarea  cols='30' rows='9' id='description'>"+"</textarea>"+"</p>"+"</li>"+
				"<br />"+
				"</ul>"+
				"</div>"+
				"</form>"+
				"<div>"+
				"<input type='button' class='submit' value='提交' onclick = updateCourse("+ num +");>"+
				"<input type='reset' value='重置'  onclick='formReset()'/>"+
				"<script type='text/javascript'>"+
				"</script>"+
				"</div>"+
				"</div>"+
				"<div id='fade' class='black_overlay'>"+"</div>"+

				"<div id='ight' class='white_content'>"+"This is a ceng"+

			"<a href = 'javascript:void(0)'  onclick ='b();'>"+"click here to close"+"</a>"+
			"</div>"+
			"<div id='fade' class='black_overlay'>"+"</div>"+
				"<a href='TeacherCreateCourse'>"+


				"<a href = 'javascript:void(0)' onclick = 'c();'>"+"<button>"+"修改课程"+"</button>"+"</a>"+
				"</a>"
				+ "</h3>"+
				"<hr/>"+
				"<div  class='classinfo'>"+
				"<table class='table'>"+
				"<tr>"+
				"<td class='tabletext'>"+"班级数："+data[i].numClass+"</td>"+"<td class='tabletext'>"+"学生人数："+data[i].numStudent+"</td>"+
			"</tr>"+
			"<tr>"+
			"<td class='tabletext'>"+"开始时间：" +data[i].StartTime+"</td>" + "<td class='tabletext'>"+"结束时间:"+data[i].endTime+"</td>"+
			"</tr>"+
			"</table>"+
			"</div>"+
			"</div>"
			}
			content.innerHTML=str;

		}
	});
}



function deleteCourse(id) {
	$.ajax({
		type: "get",
		url: "/course/"+id,
		success: function(data) {
			if(data=='204')
			{
				alert("删除成功");
			}
		}
	});
}

function toCourseInfo(id){
	window.location.href="/TeacherCourseInformation/"+id;
}

function addCourse() {
	window.location.href="/TeacherCreateCoursePage";
}


function updateCourse(id){
	document.getElementById('light').style.display="none";
	document.getElementById('fade').style.display="none";
	$.ajax({
		type: "post",
		url: "/course/"+id,
		data:'name='+$("#coursename").val()+'&description='+$("#description").val()+'&startTime='+$("#begintimeTwo").val()+
		'&endTime='+$("#endtimeTwo").val()+'&proportions.c='+$("#three").val()+'&proportions.b='
		+$("#four").val()+'&proportions.a='+$("#five").val()+'&report='+$("#report").val()+'&presentation='+$("#seminar").val(),
		success: function(data) {
			alert("success");
		}
	});
}

function c(){
	document.getElementById('light').style.display='block';
	document.getElementById('fade').style.display='block';
}

function b(){
	document.getElementById("light").style.display="none";
	document.getElementById("fade").style.display="none";
}

function formReset()
{
	document.getElementById("courseinfo").reset()
}