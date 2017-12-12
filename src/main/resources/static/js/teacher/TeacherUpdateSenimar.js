var thisURL = document.URL;
var getVal = thisURL.split('?')[1];
var getVal1 = getVal.split('&&')[0];
var courseId = getVal1.split("=")[1];

var senimarId=getVal.split('&&')[1].split("=")[1];

function send(){
    window.location.href="/TeacherSenimarInfo?senimarId="+senimarId+"&&courseId="+courseId;
    $.ajax({
        type: "put",
        url: "/course/"+id+"/seminar",
        data:'name='+$("#name").val()+'&description='+$("#introduction").val()+'&startTime='+$("#begintime").val()+
        '&endTime='+$("#endtime").val()+'&proportions.c='+$("#three").val()+'&proportions.b='
        +$("#four").val()+'&proportions.a='+$("#five").val()+'&report='+$("#report").val()+'&presentation='+$("#seminar").val()+'&groupingMethod='+$("#groupingMethod").val(),
        success: function(data) {
            window.location.href="/TeacherCourseInformation?courseId="+courseId;
        }
    });
}