<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Ajouter un employé</title>
</head>
<body>
<h1>Ajouter un employé</h1>

<form action="ajout-employe" method="post">
    <p>
        <label>Nom :</label>
        <input type="text" name="nom" required>
    </p>
    <p>
        <label>Prénom :</label>
        <input type="text" name="prenom" required>
    </p>
    <p>
        <label>Poste :</label>
        <input type="text" name="poste" required>
    </p>
    <p>
        <label>Salaire de base :</label>
        <input type="number" step="0.01" name="salaireBase" required>
    </p>
    <p>
        <button type="submit">Enregistrer</button>
    </p>
</form>

<p>
    <a href="employes">Retour à la liste des employés</a>
</p>

</body>
</html>
