var thisURL = document.URL;
var getVal = thisURL.split('?')[1];
var getVal1 = getVal.split('&&')[0];
var courseId = getVal1.split("=")[1];

var senimarId=getVal.split('&&')[1].split("=")[1];
var topicId=getVal.split('&&')[2].split("=")[1];

function updateTopic(){
    $.ajax({
        type: "get",
        url: "/topic/"+topicId,
        success: function(data) {

            var str;
            str=str+"<div class='item'>"+
            "<label class='itemName'>"+"题   目 :"+"</label>"+
            "<label class='itemName' id='name'>"+data.name+"</label>"+
                "</div>"+
                "<div class='item' style='height:40%;'>"+
                "<div class='item'>"+"说   明 :"+"</label>"+
            "<label class='itemName' id='introduction'>"+data.description+"</label>"+
                "</div>"+
            "<div class='item'>"+
                "<label class='itemName'>"+"组数限制:"+" </label>"+
            "<label class='itemName' id='num'>"+data.groupLimit+" </label>"+
                "</div>"+
            "<div class='item'>"+
                "<label class='itemName'>"+"组内人数上限:"+ "</label> "+
            "<label class='itemName' id='max'>"+data.groupMemberLimit+" </label>"+
                "</div>"+
                "<div class='item'>"+
                "<label class='itemName'>"+"已选小组: "+"</label>"+
            "<label class='itemName' id='already'>"+ data.groupLeft+"</label>"+
            "</div>"
        }
    });
}


function topicCheck(){
    window.location.href="TeacherUpdateTopic?senimarId="+senimarId+"&&courseId="+courseId;
}
