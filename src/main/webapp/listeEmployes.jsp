<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="model.Employe" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Liste des employés</title>
</head>
<body>

<h1>Liste des employés</h1>

<p>
    <a href="ajoutEmploye.jsp">Ajouter un employé</a>
</p>


<table border="1" cellpadding="5">
    <tr>
        <th>ID</th>
        <th>Nom</th>
        <th>Prénom</th>
        <th>Poste</th>
        <th>Salaire de base</th>
        <th>Actions</th>
    </tr>

    <%
        List<Employe> liste = (List<Employe>) request.getAttribute("listeEmployes");
        if (liste != null) {
            for (Employe e : liste) {
    %>
    <tr>
        <td><%= e.getId() %></td>
        <td><%= e.getNom() %></td>
        <td><%= e.getPrenom() %></td>
        <td><%= e.getPoste() %></td>
        <td><%= e.getSalaireBase() %> €</td>
        <td>
            <a href="supprimer-employe?id=<%= e.getId() %>">Supprimer</a>
        </td>
    </tr>

    <%
            }
        }
    %>
</table>

</body>
</html>
