$("#loginForm").submit(function () {
    var url = '/registration';
    var login = $('#login').val();
    var password = $('#password').val();
    var user = {
        login: login,
        password: password
    };

    $.ajax({
        url: url,
        contentType: 'application/json',
        dataType: "json",
        type: 'POST',
        data: JSON.stringify(user),
        async: true,
        success: function () {
            console.log("successfully");
        },
        error: function (xhr, status, error) {
            console.log(error);
        }
    });
});
