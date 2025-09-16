package utilisateurs;

import java.util.ArrayList;

public class Client extends Utilisateur{
    private int pointsFidelite;
    private double creditAutorise;
    private boolean estEntreprise;
    private List<Voiture> voituresPossedees; // CORRIGÉ: nom de l'attribut

    public Client(int idUtilisateur, String nom, String prenom, String email, String telephone , boolean estEntreprise) {
        super(idUtilisateur, nom, prenom, email, telephone);
        this.estEntreprise = estEntreprise;
        this.pointsFidelite = 0;
        this.creditAutorise = estEntreprise ? 5000 : 1000;
        this.voituresPossedees = new ArrayList<>();
    }

    public void ajouterVoiture(Voiture voiture){
        this.voituresPossedees.add(voiture);
        voiture.setProprietaire(this);
        System.out.println("Voiture " + voiture.getImmatriculation() + " ajoutée au client " + this.nom); // CORRIGÉ: "Voiture" avec majuscule
    }

    public void demanderReparation(Voiture voiture , String description){
        if(this.voituresPossedees.contains(voiture)){
            Reparation reparation = new Reparation(description , voiture);
            voiture.ajouterReparation(reparation);
            System.out.println("Demande de réparation créée pour " + voiture.getImmatriculation());
        }else{
            System.out.println("Cette voiture ne vous appartient pas!");
        }
    }

    public void ajouterPointsFidelite(int points) {
        this.pointsFidelite += points;
    }

    public int getPointsFidelite() { return pointsFidelite; }
    public double getCreditAutorise() { return creditAutorise; }
    public boolean isEstEntreprise() { return estEntreprise; }
    public List<Voiture> getVoituresPossedees() { return voituresPossedees; }

    @Override
    public String toString() {
        return super.toString() + " - Client " + (estEntreprise ? "Entreprise" : "Particulier") +
                " (" + pointsFidelite + " points)";
    }
}

