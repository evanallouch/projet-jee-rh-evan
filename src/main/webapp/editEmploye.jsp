<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ page import="model.Employe" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Modifier un employé</title>
</head>
<body>
<h1>Modifier un employé</h1>

<%
    Employe e = (Employe) request.getAttribute("employe");
    if (e == null) {
%>
    <p>Employé introuvable.</p>
    <p><a href="employes">Retour à la liste</a></p>
<%
    } else {
%>

<form action="update-employe" method="post">
    <input type="hidden" name="id" value="<%= e.getId() %>"/>

    <p>
        <label>Nom :</label>
        <input type="text" name="nom" value="<%= e.getNom() %>" required>
    </p>
    <p>
        <label>Prénom :</label>
        <input type="text" name="prenom" value="<%= e.getPrenom() %>" required>
    </p>
    <p>
        <label>Poste :</label>
        <input type="text" name="poste" value="<%= e.getPoste() %>" required>
    </p>
    <p>
        <label>Salaire de base :</label>
        <input type="number" step="0.01" name="salaireBase" value="<%= e.getSalaireBase() %>" required>
    </p>
    <p>
        <label>Département :</label>
        <input type="text" name="departement" value="<%= e.getDepartement() %>" required>
    </p>
    <p>
        <button type="submit">Enregistrer</button>
    </p>
</form>

<p><a href="employes">Annuler et retourner à la liste</a></p>

<%
    }
%>

</body>
</html>
