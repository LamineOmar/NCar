package Voiture;

import java.util.ArrayList;

public class Voiture {
    private String matricule;
    private String modele;
    private Integer annee;
    private ArrayList<String> ownerIds;

    // Constructor
    public Voiture(String matricule, String modele, Integer annee, String ownerId) {
        this.matricule = matricule;
        this.modele = modele;
        this.annee = annee;
        this.ownerIds = new ArrayList<>();
        ownerIds.add(ownerId);
    }

    // Add a new owner
    public void addOwner(String ownerId) {
        ownerIds.add(ownerId);
    }

    // Get all owners
    public ArrayList<String> getOwnerIds() {
        return ownerIds;
    }

    // Get current owner (last one in list)
    public String getCurrentOwner() {
        if (ownerIds.isEmpty()) return null;
        return ownerIds.get(ownerIds.size() - 1);
    }

    // Getters
    public String getMatricule() {
        return matricule;
    }

    public String getModele() {
        return modele;
    }

    public Integer getAnnee() {
        return annee;
    }

    // For printing
    @Override
    public String toString() {
        return "Voiture [Matricule=" + matricule +
               ", Modele=" + modele +
               ", Annee=" + annee +
               ", CurrentOwner=" + getCurrentOwner() +
               ", OwnersHistory=" + ownerIds + "]";
    }
}
