function send(){
    $.ajax({
        type: "post",
        url: "/course",
        data:'name='+$("#name").val()+'&description='+$("#introduction").val()+'&startTime='+$("#begintime").val()+
        '&endTime='+$("#endtime").val()+'&proportions.c='+$("#three").val()+'&proportions.b='
        +$("#four").val()+'&proportions.a='+$("#five").val()+'&report='+$("#report").val()+'&presentation='+$("#seminar").val(),
        success: function(data) {
            window.location.href="TeacherCourseHomePage";
        }
    });
}