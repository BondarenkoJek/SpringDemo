//getAll
$.ajax({
    type: 'GET',
    url: '/developers/',
    success: function (resp) {
        console.log("get all developers" + resp)
        drawDevelopers(resp);
    },
    error: function (error) {
        console.log("get all developers" + error);
    },
    dataType: 'json'
});

function drawDevelopers(developers) {
    for (var i = 0; i < developers.length; i++) {
        var result = $("<tr>"
            + "<td>" + developers[i].name + "</td>"
            + "<td><button type='button' class='info', value='"+ developers[i].id + "'>Info</button></td>"
            + "<td><button type='button' class='edit', value='"+ developers[i].id + "'>Edit</button></td>"
            + "<td><button type='button' class='delete', value='"+ developers[i].id + "'>Delete</button></td>"
            + "</tr>");
        $(".table_developers").append(result);
    }
}

$(".delete").click(function (event) {
    event.preventDefault();
    alert("delete");
    var button = $(this);
    var id = button.val();
    var url = '/developers/' + id;
    var line = button.parent('td').parent('tr');
    $.ajax({
        type: 'DELETE',
        url: url,
        contentType: 'application/x-www-form-urlencoded',
        data: "id=" + id,
        success: function () {
            line.remove();
        },
        error: function (xhr, status, error) {
            alert(error);
        }
    });
});

$(".info").click(function (event) {
    event.preventDefault();
    alert("info");
});

$(".edit").click(function (event) {
    event.preventDefault();
    alert("edit");
});