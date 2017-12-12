var thisURL = document.URL;
var getVal = thisURL.split('?')[1];
var getVal1 = getVal.split('&&')[0];
var courseId = getVal1.split("=")[1];

var senimarId=getVal.split('&&')[1].split("=")[1];


function updateTopic(){
    $.ajax({
        type: "put",
        url: "/course/"+id,
        data:'name='+$("#name").val()+'&description='+$("#introduction").val()+'&groupLimit='+$("#num").val()+
        '&groupMemberLimit='+$("#max").val()+'&groupLeft='+$("#already").val(),
        success: function(data) {
            //window.location.href="TeacherSenimarInfo?senimarId="+senimarId+"&&courseId=1="+courseId;
            alert("成功");
        }
    });
}

function sure()
{
    window.location.href="TeacherSenimarInfo?senimarId="+senimarId+"&&courseId=1="+courseId;
}