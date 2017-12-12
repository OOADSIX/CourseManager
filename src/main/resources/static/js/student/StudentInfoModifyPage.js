function load() {
    $.ajax({
        type: "get",
        url: "/me",
        success: function(data) {
            document.getElementById("username").innerHTML = data.phone;
            document.getElementById("stuffnum").value = data.school.id;
            document.getElementById("name").value = data.number;
            document.getElementById("gender").value = data.gender;
            document.getElementById("school").value = data.school.name;
            document.getElementById("job").value = data.title;
            document.getElementById("email").value = data.email;
            document.getElementById("phone").value = data.phone;

        }
    });
}

function send(){
    $.ajax({
        type: "put",
        url: "/me",
        data:'&id='+$("#username").val()+'&email='+$("#email").val()+
        '&school.id='+$("#stuffnum").val()+'&name='+$("#name").val()+'&gender='
        +$("#gender").val()+'&school.name='+$("#school").val()+'&title='+$("#job").val()+'&phone='+$("#phone").val(),
        success: function() {
            alert("修改成功");
            window.location.href="/StudentHomePage";
        }
    });
}

