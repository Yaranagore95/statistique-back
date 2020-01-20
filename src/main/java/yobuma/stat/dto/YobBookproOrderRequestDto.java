package yobuma.stat.dto;

import java.util.Date;


public class YobBookproOrderRequestDto  {
    private int id;

    private Date created;

    private int createdBy;

    private String ipAddress;

    private String notes;

    private String orderStatus;

    private String payStatus;

    private int status;

    private int type;

    private int userId;

    private YobBookproOrderDto yobBookproOrder;

    public YobBookproOrderRequestDto() {
    }

    public int getId() {
        return id;
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

    public String getOrderStatus() {
        return orderStatus;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public int getStatus() {
        return status;
    }

    public int getType() {
        return type;
    }

    public int getUserId() {
        return userId;
    }

    public YobBookproOrderDto getYobBookproOrder() {
        return yobBookproOrder;
    }
}