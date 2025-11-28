<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="model.FichePaie" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Fiches de paie</title>
</head>
<body>
<h1>Fiches de paie</h1>

<table border="1" cellpadding="5">
    <tr>
        <th>ID</th>
        <th>Employé</th>
        <th>Mois</th>
        <th>Salaire de base</th>
        <th>Prime</th>
        <th>Déduction</th>
        <th>Salaire net</th>
    </tr>

    <%
        List<FichePaie> liste = (List<FichePaie>) request.getAttribute("listeFichesPaie");
        if (liste != null) {
            for (FichePaie f : liste) {
    %>
    <tr>
        <td><%= f.getId() %></td>
        <td><%= f.getEmploye().getNom() %> <%= f.getEmploye().getPrenom() %></td>
        <td><%= f.getMois() %></td>
        <td><%= f.getSalaireBase() %> €</td>
        <td><%= f.getPrime() %> €</td>
        <td><%= f.getDeduction() %> €</td>
        <td><%= f.getSalaireNet() %> €</td>
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
