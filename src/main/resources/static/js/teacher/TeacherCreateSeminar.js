var thisURL = document.URL;
var getVal = thisURL.split('?')[1];
var id = getVal.split("=")[1];

function send(){
    $.ajax({
        type: "post",
        url: "/course/"+id+"/seminar",
        data:'name='+$("#name").val()+'&description='+$("#introduction").val()+'&startTime='+$("#begintime").val()+
        '&endTime='+$("#endtime").val()+'&proportions.c='+$("#three").val()+'&proportions.b='
        +$("#four").val()+'&proportions.a='+$("#five").val()+'&report='+$("#report").val()+'&presentation='+$("#seminar").val()+'&groupingMethod='+$("#groupingMethod").val(),
        success: function(data) {
            window.location.href="/TeacherSenimarInfo?courseId="+id;
        }
    });
}