function addImmeuble(){
    var adresse=$("#adresseMeuble").val();;
    var nom=$("#nomMeuble").val();;
    var codePsotale=$("#codePsotaleMeuble").val();;
    var num=$("#numMeuble").val();;
    var etage=$("#etageMeuble").val();;
    var Quartier=$("#quartierMeuble").val();;
    var fonc=$("#saveImmeuble").val();
    $.ajax({
        url: "../../ImmeubleController",
        data: {'fonc':fonc,'nom':nom,'adresse':adresse,'codePostale':codePsotale,'num':num,'etage':etage,'quartier':Quartier},
        type: 'POST',
        success: function (data, textStatus, jqXHR) {
            console.log(data);
            
        },
        error: function (jqXHR, textStatus, errorThrown) {
             
        }
    });
}
//function deleteImmeuble();
//function updateImmeuble();














$("#menu-toggle").click(function (e) {
    e.preventDefault();
    $("#wrapper").toggleClass("toggled");
});