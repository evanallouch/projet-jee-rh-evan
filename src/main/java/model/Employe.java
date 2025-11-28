package model;

public class Employe {
    private int id;
    private String nom;
    private String prenom;
    private String poste;
    private double salaireBase;
    private String departement; // nouveau

    public Employe(int id, String nom, String prenom, String poste, double salaireBase, String departement) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.poste = poste;
        this.salaireBase = salaireBase;
        this.departement = departement;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getPoste() {
        return poste;
    }

    public double getSalaireBase() {
        return salaireBase;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }
}
