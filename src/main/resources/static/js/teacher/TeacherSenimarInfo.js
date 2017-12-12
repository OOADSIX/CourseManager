var thisURL = document.URL;
var getVal = thisURL.split('?')[1];
var id = getVal.split("&&")[0].split("=")[1];

var courseId=getVal.split("&&")[1].split("=")[1];

$.ajax({
    type: "get",
    url: "/seminar/"+id+"/topic",
    success: function(data) {
        //alert(data[0].numStudent);
        var content=document.getElementById("topic");
        content.empty;
        var str="";
        for(var i=0;i<data.length;i++)
        {
            //console.log(data.name);
            var num = data[i].id;
            str+="<div class='topicBlock' onclick='findTopic("+num+")'><div class='topicBlockFont'>"+data[i].name+"</div></div>";
        }
        str+="<div class='topicBlock'>"+
            "<img class='addImg' src='Img/add.png' alt='添加' onclick='addTopic()'>"+
            "</div>";
        content.innerHTML=str;

    }
});

function addTopic() {
    window.location.href="/TeacherCreateTopic?senimarId="+id+"&&courseId="+courseId;
}

function updateTopic() {
    window.location.href="/TeacherUpdateSenimar?senimarId="+id+"&&courseId="+courseId;
}

function score() {
    window.location.href="/TeacherScoreHome?senimarId="+id+"&&courseId="+courseId;
}

function findTopic(topicId) {
    window.location.href="/TeacherTopicCheckBefore?senimarId="+id+"&&courseId="+courseId+"&&topicId="+topicId;
}