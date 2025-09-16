package utilisateurs;

import java.time.LocalDate;

public abstract class Utilisateur {
    protected int idUtilisateur;
    protected String nom;
    protected String prenom;
    protected String email;
    protected String telephone;
    protected String adresse;
    protected LocalDate dateInscription;

    // Constructeur
    public Utilisateur(int idUtilisateur, String nom, String prenom, String email, String telephone) {
        this.idUtilisateur = idUtilisateur;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.dateInscription = LocalDate.now();
    }

    // Getters et Setters
    public int getIdUtilisateur() { return idUtilisateur; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }

    @Override
    public String toString() {
        return nom + " " + prenom + " (" + email + ")";
    }
}