function send(){
    $.ajax({
        type: "post",
        url: "/school",
        data:'name='+$("#name").val()+'&province='+$("#pro").val()+'&city='+$("#city").val(),
        success: function(data) {
            alert("success");

        }
    });
}

function load(){
    $.ajax({
        type: "get",
        url: "/school",
        success: function(data) {
            alert("success");

        }
    });
}