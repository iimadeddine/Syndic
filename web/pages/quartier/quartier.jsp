<%@page import="service.VilleService"%>
<%@page import="beans.Ville"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Quartier</title>

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
                        <legend style="margin-left: 2%">Gestion des Quartier</legend> 
                        <div class="row col-md-12">
                            <div class="form-group col-md-3">
                                <label>Nom :</label>
                                <input class="form-control" type="text" name="nomQuartier" id="nomQuartier"/>
                            </div>
                            <div class="row col-md-12">
                                <div class="form-group col-md-3" style="margin-left: 40%">
                                    <input type="button" value="Ajouter" id="saveVille" name="saveVille" onclick="addVille()" class="btn btn-success"/>
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
                                        <th>Nom</th>
                                        <th>Modifer</th>
                                        <th>Suprimer</th>
                                    </tr>
                                </thead>
                                <tbody id="villeTable">
                                    <%VilleService vs = new VilleService();
                                        for (Ville v : vs.findAll()) {%>
                                    <tr>
                                        <td><%= v.getId()%></td>
                                        <td><%= v.getNom()%></td>
                                        <td><button class="btn btn-warning" onclick="updateVille(<%=v.getId()%>,'<%= v.getNom() %>')"> Modifier</button></td>
                                        <td><button class="btn btn-danger" onclick="deleteVille(<%=v.getId()%>)">Suprimer</button></td>
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
        <script src="script/ville.js" type="text/javascript"></script>
    </body>

</html>
