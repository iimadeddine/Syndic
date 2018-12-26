$("#menu-toggle").click(function (e) {
    e.preventDefault();
    $("#wrapper").toggleClass("toggled");
});
function  addVille() {
    var nom = $("#nomVille").val();
    var add = $("#saveVille").val();
    var id = $("#ville").val();
    console.log(""+id);
    $.ajax({
        url: "../../VilleController",
        data: {id:id,'nom': nom, 'fonc':add},
        type: 'POST',
        dataType: 'json',
        success: function (data) {
            console.log(data);
            loadTable(data);
            $("#saveVille").val("Ajouter");
        }, error: function (jqXHR, textStatus, errorThrown) {

        }
    })
}


function deleteVille(id) {
    var deletee="deletee";
    $.ajax({
        url: "../../VilleController",
        data: {'id': id, 'fonc':deletee},
        type: 'POST',
        dataType: 'json',
        success: function (data) {
            console.log("supprime");
            loadTable(data);
        }, error: function (jqXHR, textStatus, errorThrown) {
            console.log("rien suprimer");
        }
    })
}

function updateVille(id,nom) {
    var nomVille = $("#nomVille");
    nomVille.val(nom);
    $("#ville").val(""+id);
    $("#saveVille").val("Modifier");
}

function  loadTable(data) {
    var row = "";
    for (var i = 0; i < data.length; i++)
    {
        row += "<tr>";
        row += "<td>" + data.id + "</td>"
        row += "<td>" + data.nom + "</td>"
        row += '<td><button class = "btn btn-warning">Modifier</button></td >'
        row += '<td><button class = "btn btn-danger">Suprimer</button></td >'
        row += '</tr>';
    }
    $("#villeTable").empty();
    $("#villeTable").html(row);
}


