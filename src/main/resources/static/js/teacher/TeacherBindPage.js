function send(){
    $.ajax({
        type: "post",
        url: '/me',
        data:'avatar='+$("#photo").val()+'&id='+$("#username").val()+'&email='+$("#email").val()+
        '&school.id='+$("#stuffnum").val()+'&name='+$("#name").val()+'&gender='
        +$("#gender").val()+'&school.name='+$("#school").val()+'&title='+$("#job").val()+'&phone='+$("#phone").val(),
        success: function(data) {
            alert(data.id);
            document.getElementById("photo").innerHTML = data.avatar;
            document.getElementById("username").innerHTML = data.id;
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