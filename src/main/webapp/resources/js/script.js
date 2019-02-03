//getAll
$.ajax({
    type: 'GET',
    url: '/developer/all',
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
        // var result = $("<h3>" + developers[i].name + "</h3>");
        var result = $("<tr>"
            + "<td>" + developers[i].id + "</td>"
            + "<td>" + developers[i].name + "</td>"
            + "<td>" + developers[i].age + "</td>"
            + "<td>" + developers[i].salary + "</td>"
            + "</tr>");
        $("#allDevelopers").append(result);
    }
}

//delete
$(".deleteForm").submit(function (event) {
    event.preventDefault();
    var form = $(this);
    var id = form.find('button[name="delete"]').val();
    var url = '/developer/' + id;
    var line = form.parent('td').parent('tr');
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


