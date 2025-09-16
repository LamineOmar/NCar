package Voiture;

import java.util.Date;

public class Repartition {
    private String repId;
    private Date repDate;
    private String voitureId;
    private String mecaniqueId;

    // Constructor
    public Repartition(String repId, Date repDate, String voitureId, String mecaniqueId) {
        this.repId = repId;
        this.repDate = repDate;
        this.voitureId = voitureId;
        this.mecaniqueId = mecaniqueId;
    }

    // Getters
    public String getRepId() {
        return repId;
    }

    public Date getRepDate() {
        return repDate;
    }

    public String getVoitureId() {
        return voitureId;
    }

    public String getMecaniqueId() {
        return mecaniqueId;
    }


    // For printing
    @Override
    public String toString() {
        return "Repartition [RepID=" + repId +
               ", Date=" + repDate +
               ", VoitureID=" + voitureId +
               ", MecaniqueID=" + mecaniqueId + "]";
    }
}
