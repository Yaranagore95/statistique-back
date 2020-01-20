package yobuma.stat.StatConstants;

public class StatDateWithAgentId {
    private int hubId;
    private String dateInf;
    private String dateSup;
    private int agentId;

    public StatDateWithAgentId() {
    }

    public int getHubId() {
        return hubId;
    }

    public void setHubId(int hubId) {
        this.hubId = hubId;
    }

    public String getDateInf() {
        return dateInf;
    }

    public void setDateInf(String dateInf) {
        this.dateInf = dateInf;
    }

    public String getDateSup() {
        return dateSup;
    }

    public void setDateSup(String dateSup) {
        this.dateSup = dateSup;
    }

    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }
}
