package yobuma.stat.dto;

import java.util.Date;

public class YobBookproOrdersLogDto {

    private int id;

    private int category;

    private Date created;

    private int createdBy;

    private String ipAddress;

    private String notes;

    private int userId;

    private YobBookproOrderDto yobBookproOrder;

    public YobBookproOrdersLogDto() {
    }

    public int getId() {
        return id;
    }

    public int getCategory() {
        return category;
    }

    public Date getCreated() {
        return created;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getNotes() {
        return notes;
    }

    public int getUserId() {
        return userId;
    }

    public YobBookproOrderDto getYobBookproOrder() {
        return yobBookproOrder;
    }
}