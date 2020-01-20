package yobuma.stat.dto;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class YobBookproBustripDto {
    private int id;

    private int access;

    private String code;

    private int createdBy;

    private String door;

    private int driverId;

    private String dropDoor;

    private String duration;

    private Time endTime;

    private int level;

    private int lft;

    private int modifiedBy;

    private int ordering;

    private int from;

    private int to;

    private String params;

    private int parentId;

    private String path;

    private String policy;

    private Date publishDate;

    private String rgt;

    private String route;

    private String seats;

    private Time startTime;

    private String state;

    private String title;

    private Date unpublishDate;

    private List<YobBookproBusstopDto> yobBookproBusstops;

    private YobBookproBusDto yobBookproBus;

    private YobBookproAgentDto yobBookproAgent;

    private List<YobBookproOrderDto> yobBookproOrders;


    private List<YobBookproPassengerDto> yobBookproPassengers;

    public YobBookproBustripDto() {
    }

    public int getId() {
        return id;
    }

    public int getAccess() {
        return access;
    }

    public String getCode() {
        return code;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public String getDoor() {
        return door;
    }

    public int getDriverId() {
        return driverId;
    }

    public String getDropDoor() {
        return dropDoor;
    }

    public String getDuration() {
        return duration;
    }

    public Time getEndTime() {
        return endTime;
    }

    public int getLevel() {
        return level;
    }

    public int getLft() {
        return lft;
    }

    public int getModifiedBy() {
        return modifiedBy;
    }

    public int getOrdering() {
        return ordering;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    public String getParams() {
        return params;
    }

    public int getParentId() {
        return parentId;
    }

    public String getPath() {
        return path;
    }

    public String getPolicy() {
        return policy;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public String getRgt() {
        return rgt;
    }

    public String getRoute() {
        return route;
    }

    public String getSeats() {
        return seats;
    }

    public Time getStartTime() {
        return startTime;
    }

    public String getState() {
        return state;
    }

    public String getTitle() {
        return title;
    }

    public Date getUnpublishDate() {
        return unpublishDate;
    }

    public List<YobBookproBusstopDto> getYobBookproBusstops() {
        return yobBookproBusstops;
    }

    public YobBookproBusDto getYobBookproBus() {
        return yobBookproBus;
    }

    public YobBookproAgentDto getYobBookproAgent() {
        return yobBookproAgent;
    }

    public List<YobBookproOrderDto> getYobBookproOrders() {
        return yobBookproOrders;
    }

    public List<YobBookproPassengerDto> getYobBookproPassengers() {
        return yobBookproPassengers;
    }
}