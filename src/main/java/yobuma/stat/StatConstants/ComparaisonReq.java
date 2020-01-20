package yobuma.stat.StatConstants;

public class ComparaisonReq {
    private String dateInf1;
    private String dateSup1;
    private String dateInf2;
    private String dateSup2;
    private int agentId;
    private int hubId;

    public ComparaisonReq() {
    }

    public String getDateInf1() {
        return dateInf1;
    }

    public void setDateInf1(String dateInf1) {
        this.dateInf1 = dateInf1;
    }

    public String getDateSup1() {
        return dateSup1;
    }

    public void setDateSup1(String dateSup1) {
        this.dateSup1 = dateSup1;
    }

    public String getDateInf2() {
        return dateInf2;
    }

    public void setDateInf2(String dateInf2) {
        this.dateInf2 = dateInf2;
    }

    public String getDateSup2() {
        return dateSup2;
    }

    public void setDateSup2(String dateSup2) {
        this.dateSup2 = dateSup2;
    }

    public int getAgentId() {
        return agentId;
    }

    public int getHubId() {
        return hubId;
    }
}
