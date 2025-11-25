package model;

public class Employe {
    private int id;
    private String nom;
    private String prenom;
    private String poste;
    private double salaireBase;

    public Employe(int id, String nom, String prenom, String poste, double salaireBase) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.poste = poste;
        this.salaireBase = salaireBase;
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
}
