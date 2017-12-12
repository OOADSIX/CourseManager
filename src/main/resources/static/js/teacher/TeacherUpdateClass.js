var thisURL = document.URL;
var getVal = thisURL.split('?')[1];
var getVal1 = getVal.split('&&')[0];
var id = getVal1.split("=")[1];
console.log(id);

var courseId=getVal.split('&&')[1].split("=")[1];

function updateClass(){
    $.ajax({
        type: "put",
        url: "/course/"+id,
        data:'name='+$("#name").val()+'&description='+$("#introduction").val()+'&startTime='+$("#begintime").val()+
        '&endTime='+$("#endtime").val()+'&proportions.c='+$("#three").val()+'&proportions.b='
        +$("#four").val()+'&proportions.a='+$("#five").val()+'&report='+$("#report").val()+'&presentation='+$("#seminar").val(),
        success: function(data) {
            window.location.href="TeacherCourseInformation?courseId="+courseId;

        }
    });
}