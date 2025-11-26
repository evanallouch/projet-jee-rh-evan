package dao;

import java.util.ArrayList;
import java.util.List;

import model.Employe;

public class EmployeDaoMemoire implements EmployeDao {

    private static List<Employe> employes = new ArrayList<>();

    static {
        employes.add(new Employe(1, "Dupont", "Jean", "Développeur", 2500));
        employes.add(new Employe(2, "Martin", "Sophie", "Chef de projet", 3200));
        employes.add(new Employe(3, "Durand", "Paul", "RH", 2800));
    }

    @Override
    public List<Employe> findAll() {
        return employes;
    }

    @Override
    public void add(Employe employe) {
        // on calcule un nouvel id : dernier id + 1
        int newId = 1;
        if (!employes.isEmpty()) {
            newId = employes.get(employes.size() - 1).getId() + 1;
        }

        // on recrée un employé avec ce nouvel id
        Employe e = new Employe(
                newId,
                employe.getNom(),
                employe.getPrenom(),
                employe.getPoste(),
                employe.getSalaireBase()
        );

        employes.add(e);
    }
}
