function show() {
    $.ajax({
        type: "get",
        url: "/me",
        success: function(data) {
            //alert(data.id);
            document.getElementById("photo").innerHTML = data.avatar;
            document.getElementById("username").innerHTML = data.id;
            document.getElementById("stuffnum").innerHTML = data.school.id;
            document.getElementById("name").innerHTML = data.number;
            document.getElementById("gender").innerHTML = data.gender;
            document.getElementById("school").innerHTML = data.school.name;
            document.getElementById("job").innerHTML = data.title;
            document.getElementById("email").innerHTML = data.email;
            document.getElementById("phone").innerHTML = data.phone;

        }
    });
}