package utilisateurs;

import java.time.LocalDate;
import java.util.ArrayList;

public class Mecanicien extends Utilisateur {
    private String specialite;
    private int niveauExperience; // en années
    private double salaire;
    private LocalDate dateEmbauche;
    private boolean disponible;
    private List<Reparation> reparationsEffectuees;

    // Constructeur
    public Mecanicien(int idUtilisateur, String nom, String prenom, String email,
                      String telephone, String specialite, int niveauExperience) {
        super(idUtilisateur, nom, prenom, email, telephone);
        this.specialite = specialite;
        this.niveauExperience = niveauExperience;
        this.disponible = true;
        this.dateEmbauche = LocalDate.now();
        this.reparationsEffectuees = new ArrayList<>();
    }

    public void assignerReparation(Reparation reparation) {
        if (this.disponible) {
            this.reparationsEffectuees.add(reparation);
            reparation.setMecanicien(this);
            this.disponible = false;
            System.out.println("Réparation assignée au mécanicien " + this.nom);
        } else {
            System.out.println("Mécanicien " + this.nom + " n'est pas disponible");
        }
    }

    public void terminerReparation(Reparation reparation) {
        reparation.setStatut("TERMINEE"); // CORRIGÉ: setStatut au lieu de setStatus
        this.disponible = true;
        System.out.println("Réparation terminée par " + this.nom);
    }

    public int getNombreReparationsEffectuees(){
        return reparationsEffectuees.size();
    }

    // Getters et Setters
    public String getSpecialite() { return specialite; }
    public void setSpecialite(String specialite) { this.specialite = specialite; }
    public int getNiveauExperience() { return niveauExperience; }
    public void setNiveauExperience(int niveauExperience) { this.niveauExperience = niveauExperience; }
    public double getSalaire() { return salaire; }
    public void setSalaire(double salaire) { this.salaire = salaire; }
    public LocalDate getDateEmbauche() { return dateEmbauche; }
    public void setDateEmbauche(LocalDate dateEmbauche) { this.dateEmbauche = dateEmbauche; }
    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }
    public List<Reparation> getReparationsEffectuees() { return reparationsEffectuees; }
    public void setReparationsEffectuees(List<Reparation> reparationsEffectuees) { this.reparationsEffectuees = reparationsEffectuees; }

    // CORRIGÉ: toString() pour affichage correct
    @Override
    public String toString() {
        return super.toString() + " - Mécanicien " + specialite +
                " (" + niveauExperience + " ans d'expérience)";
    }
}