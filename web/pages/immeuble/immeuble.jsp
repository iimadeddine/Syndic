<%@page import="beans.Quartier"%>
<%@page import="service.QuartierService"%>
<%@page import="beans.Immeuble"%>
<%@page import="service.ImmeubleService"%>
<%@page import="service.VilleService"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Gestion Immeuble</title>

        <!-- Bootstrap core CSS -->
        <link href="../../vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="../../css/simple-sidebar.css" rel="stylesheet">

    </head>

    <body>

        <div id="wrapper">

            <!-- Sidebar -->
            <div id="sidebar-wrapper">
                <ul class="sidebar-nav">
                    <li class="sidebar-brand">
                        <a href="#">
                            Start Bootstrap
                        </a>
                    </li>
                    <li>
                        <a href="#">Dashboard</a>
                    </li>
                    <li>
                        <a href="../../pages/Ville/ville.jsp">Villes</a>
                    </li>
                    <li>
                        <a href="../../pages/immeuble/immeuble.jsp">Immeuble</a>
                    </li>
                    <li>
                        <a href="../quartier/quartier.jsp">Quartier</a>
                    </li>
                    <li>
                        <a href="#">Appartement</a>
                    </li>
                </ul>
            </div>
            <!-- /#sidebar-wrapper -->

            <!-- Page Content -->
            <div id="page-content-wrapper">
                <div class="container-fluid">
                    <a href="#menu-toggle" class="btn btn-secondary" id="menu-toggle">Menu</a>
                </div>
                <div>
                    <fieldset >
                        <legend style="margin-left: 2%">Gestion des immeubles</legend> 
                        <div class="row col-md-12">
                            <div class="form-group col-md-3">
                                <label>Adresse :</label>
                                <input class="form-control" type="text" name="adresseMeuble" id="adresseMeuble"/>
                            </div>
                            <div class="form-group col-md-3">
                                <label>Nom :</label>
                                <input class="form-control" type="text" name="nomMeuble" id="nomMeuble"/>
                            </div>
                        </div>
                        <div class="row col-md-12">
                            <div class="form-group col-md-3">
                                <label>Code Postale :</label>
                                <input class="form-control" type="text" name="codePsotaleMeuble" id="codePsotaleMeuble"/>
                            </div>
                            <div class="form-group col-md-3">
                                <label>Num :</label>
                                <input class="form-control" type="text" name="numMeuble" id="numMeuble"/>
                            </div>
                        </div>
                        <div class="row col-md-12">
                            <div class="form-group col-md-3">
                                <label>Etage :</label>
                                <input class="form-control" type="text" name="etageMeuble" id="etageMeuble"/>
                            </div>
                            <div class="form-group col-md-3">
                                <label>Quartier :</label>
                                <select class="custom-select custom-select-sm" name="quartierMeuble" id="quartierMeuble">
                                <option selected>Choisix une Quartier</option>
                                <%QuartierService qs=new QuartierService();
                                for(Quartier q:qs.findAll())
                                {
                                %>
                                <option value="1"><%=q.getNom()%></option>
                                <%}%>
                            </select>
                             </div>

                        </div>
                        <div class="row col-md-12">
                            <div class="form-group col-md-3" style="margin-left: 40%">
                                <input type="button" value="Ajouter" id="saveImmeuble" name="saveImmeuble" onclick="addImmeuble()" class="btn btn-success"/>
                                <input type="hidden" name="ville" id="ville" value="">
                            </div>
                        </div>
                    </fieldset>
                </div>
                <div>
                    <div class="panel-body">
                        <div class="table-responsive">
                            <table class="table table-striped table-bordered table-hover" id="tableVille" name="tableVille">
                                <thead>
                                    <tr>
                                        <th>Id</th>
                                        <th>Adresse</th>
                                        <th>Code Postale</th>
                                        <th>Etage</th>
                                        <th>Nom</th>
                                        <th>Num</th>
                                        <th>Quartier</th>
                                        <th>Modifer</th>
                                        <th>Suprimer</th>
                                    </tr>
                                </thead>
                                <tbody id="villeTable">
                                    <% ImmeubleService ims = new ImmeubleService();
                                        for (Immeuble im : ims.findAll()) {

                                    %>
                                    <tr>
                                        <td><%=im.getId()%></td>
                                        <td><%=im.getAdresse()%></td>
                                        <td><%=im.getCodePostale()%></td>
                                        <td><%=im.getEtage()%></td>
                                        <td><%=im.getNom()%></td>
                                        <td><%=im.getNum()%></td>
                                        <td><%=im.getQuartier().getNom()%></td>
                                        <td><button class="btn btn-warning" onclick="updateVille()"> Modifier</button></td>
                                        <td><button class="btn btn-danger" onclick="deleteVille()">Suprimer</button></td>
                                    </tr>
                                    <%}%>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
            <!-- /#page-content-wrapper -->

        </div>
        <!-- /#wrapper -->

        <!-- Bootstrap core JavaScript -->
        <script src="../../vendor/jquery/jquery.min.js"></script>
        <script src="../../vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Menu Toggle Script -->
        <script src="script/immeuble.js" type="text/javascript"></script>

    </body>

</html>
