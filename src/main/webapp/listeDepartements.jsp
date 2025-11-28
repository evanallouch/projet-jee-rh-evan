<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="model.Departement" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Liste des départements</title>
</head>
<body>
<h1>Liste des départements</h1>

<table border="1" cellpadding="5">
    <tr>
        <th>ID</th>
        <th>Nom</th>
    </tr>

    <%
        List<Departement> liste = (List<Departement>) request.getAttribute("listeDepartements");
        if (liste != null) {
            for (Departement d : liste) {
    %>
    <tr>
        <td><%= d.getId() %></td>
        <td><%= d.getNom() %></td>
    </tr>
    <%
            }
        }
    %>
</table>

<p>
    <a href="index.jsp">Retour à l'accueil</a>
</p>

</body>
</html>
