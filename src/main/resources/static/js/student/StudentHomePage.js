$(function () {
    $.ajax({
        url: "/me",
        type: "get",
        success: function (data) {
            $("#userTitle").text(data.phone);
            $("#number").text(data.number);
            $("#name").text(data.name);
            if (data.gender == "male") {
                $("#gender").text("男");
            }
            else {
                $("#gender").text("女");
            }
            $("#school").text(data.school.name);
            $("#title").text(data.title);
            $("#email").text(data.email);
            $("#phone").text(data.phone);
        }
    })

    //修改按钮
    $(".button").click(function () {
        window.location.href = "/StudentInfoModifyPage";
    })
})