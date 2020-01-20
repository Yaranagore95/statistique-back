package yobuma.stat.StatConstants;

public class StatMonthWithHub {
    private int month;
    private int year;
    private int agentId;
    private int hubId;

    public StatMonthWithHub() {
    }

    public StatMonthWithHub(int month, int year, int agentId, int hubId) {
        this.month = month;
        this.year = year;
        this.agentId = agentId;
        this.hubId = hubId;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

    public int getHubId() {
        return hubId;
    }

    public void setHubId(int hubId) {
        this.hubId = hubId;
    }
}
