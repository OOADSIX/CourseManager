var thisURL = document.URL;
var getVal = thisURL.split('?')[1];
var id = getVal.split("=")[1];
console.log(id);
function send(){
    $.ajax({
        type: "post",
        url: "/course/"+id+"/class",
        data:'name='+$("#name").val()+'&description='+$("#introduction").val()+'&startTime='+$("#begintime").val()+
        '&endTime='+$("#endtime").val()+'&proportions.c='+$("#three").val()+'&proportions.b='
        +$("#four").val()+'&proportions.a='+$("#five").val()+'&report='+$("#report").val()+'&presentation='+$("#seminar").val(),
        success: function(data) {
            window.location.href="TeacherSenimarInfo?senimarId="+senimarId+"&&courseId="+courseId;
        }
    });
}