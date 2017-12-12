var thisURL = document.URL;
var getVal = thisURL.split('?')[1];
var getVal1 = getVal.split('&&')[0];
var courseId = getVal1.split("=")[1];

var senimarId=getVal.split('&&')[1].split("=")[1];
var topicId=getVal.split('&&')[2].split("=")[1];

function updateTopic(){
    $.ajax({
        type: "put",
        url: "/course/"+id,
        data:'name='+$("#name").val()+'&description='+$("#introduction").val()+'&groupLimit='+$("#num").val()+
        '&groupMemberLimit='+$("#max").val()+'&groupLeft='+$("#already").val(),
        success: function(data) {
            alert("success");

        }
    });
}

function returnTopic(){
    window.location.href="TeacherSenimarInfo?senimarId="+courseId+"&&courseId="+courseId;
}