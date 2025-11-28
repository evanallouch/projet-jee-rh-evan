package dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import model.Employe;

public class EmployeDaoMemoire implements EmployeDao {

    private static List<Employe> employes = new ArrayList<>();

    static {
        employes.add(new Employe(1, "Dupont", "Jean", "Développeur", 2500, "Informatique"));
        employes.add(new Employe(2, "Martin", "Sophie", "Chef de projet", 3200, "Informatique"));
        employes.add(new Employe(3, "Durand", "Paul", "RH", 2800, "Ressources Humaines"));
    }

    @Override
    public List<Employe> findAll() {
        return employes;
    }

    @Override
    public void add(Employe employe) {
        int newId = 1;
        if (!employes.isEmpty()) {
            newId = employes.get(employes.size() - 1).getId() + 1;
        }

        Employe e = new Employe(
                newId,
                employe.getNom(),
                employe.getPrenom(),
                employe.getPoste(),
                employe.getSalaireBase(),
                employe.getDepartement()
        );

        employes.add(e);
    }

    @Override
    public void deleteById(int id) {
        Iterator<Employe> it = employes.iterator();
        while (it.hasNext()) {
            Employe e = it.next();
            if (e.getId() == id) {
                it.remove();
                break;
            }
        }
    }
}
