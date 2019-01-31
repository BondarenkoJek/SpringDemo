var script = document.createElement('script');
script.type = 'text/javascript';
script.src = '/resources/js/jquery-3.3.1.js';
document.head.appendChild(script);


$("#deleteDeveloper").submit(function(event){
    event.preventDefault();

    var form = $(this);
    var id = form.find('input[name="delete"]').val();
    $.ajax({
        type : 'DELETE',
        contentType: 'application/x-www-form-urlencoded',
        data : "id=" + id,
        success : function(data, status, xhr){
            $("#result").html(data);
        },
        error: function(xhr, status, error){
            alert(error);
        }
    });
});