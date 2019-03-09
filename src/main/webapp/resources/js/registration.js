$("#registrationForm").submit(function (event) {
    event.preventDefault();
    var url = '/registration';
    var login = $('#login').val();
    var email = $('#email').val();
    var password = $('#password').val();
    var user = {
        login: login,
        email: email,
        password: password
    };

    $.ajax({
        type: 'POST',
        url: url,
        contentType: 'application/json',
        dataType: "json",
        data: JSON.stringify(user),
        success: function () {
            console.log("successfully");
            top.location.href = '/login';
        },
        error: function (error) {
            console.log(error);
        }
    });
});
