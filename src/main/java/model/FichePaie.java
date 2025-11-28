package model;

public class FichePaie {
    private int id;
    private Employe employe;
    private String mois;
    private double salaireBase;
    private double prime;
    private double deduction;

    public FichePaie(int id, Employe employe, String mois, double salaireBase, double prime, double deduction) {
        this.id = id;
        this.employe = employe;
        this.mois = mois;
        this.salaireBase = salaireBase;
        this.prime = prime;
        this.deduction = deduction;
    }

    public int getId() {
        return id;
    }

    public Employe getEmploye() {
        return employe;
    }

    public String getMois() {
        return mois;
    }

    public double getSalaireBase() {
        return salaireBase;
    }

    public double getPrime() {
        return prime;
    }

    public double getDeduction() {
        return deduction;
    }

    public double getSalaireNet() {
        return salaireBase + prime - deduction;
    }
}
