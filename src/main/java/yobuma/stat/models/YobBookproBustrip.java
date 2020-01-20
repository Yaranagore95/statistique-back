package yobuma.stat.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the yob_bookpro_bustrip database table.
 * 
 */
@Entity
@Table(name="yob_bookpro_bustrip")
@NamedQuery(name="YobBookproBustrip.findAll", query="SELECT y FROM YobBookproBustrip y")
public class YobBookproBustrip implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int access;

	private String code;

	@Column(name="created_by")
	private int createdBy;

	// Modification de String en int
	private int door;

	@Column(name="driver_id")
	private int driverId;

	// Modification de type String en int
	@Column(name="drop_door")
	private int dropDoor;

	private String duration;

	@Column(name="end_time")
	private Time endTime;

	private int level;

	private int lft;

	@Column(name="modified_by")
	private int modifiedBy;

	private int ordering;

	// Modification de from_id à from
	@Column(name = "from")
	private int from;

	// Modification de to_id à to
	@Column(name = "to")
	private int to;

	@Lob
	private String params;

	@Column(name="parent_id")
	private int parentId;

	private String path;

	@Lob
	private String policy;

	@Temporal(TemporalType.DATE)
	@Column(name="publish_date")
	private Date publishDate;

	// Modification de String en in
	private int rgt;

	private String route;

	private String seats;

	@Column(name="start_time")
	private Time startTime;

	// Modification de String en int
	private int state;

	private String title;

	@Temporal(TemporalType.DATE)
	@Column(name="unpublish_date")
	private Date unpublishDate;

	//bi-directional many-to-one association to YobBookproBusstop
	@OneToMany(mappedBy="yobBookproBustrip")
	@JsonIgnore
	private List<YobBookproBusstop> yobBookproBusstops;

	//bi-directional many-to-one association to YobBookproBus
	@ManyToOne
	@JoinColumn(name="bus_id")
	private YobBookproBus yobBookproBus;

	//bi-directional many-to-one association to YobBookproAgent
	@ManyToOne
	@JoinColumn(name="agent_id")
	@JsonIgnore
	private YobBookproAgent yobBookproAgent;


	//bi-directional many-to-one association to YobBookproOrder
	@OneToMany(mappedBy="yobBookproBustrip")
    @JsonIgnore
	private List<YobBookproOrder> yobBookproOrders;

	//bi-directional many-to-one association to YobBookproPassenger
	@OneToMany(mappedBy="yobBookproBustrip")
	@JsonIgnore
	private List<YobBookproPassenger> yobBookproPassengers;

	public YobBookproBustrip() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAccess() {
		return this.access;
	}

	public void setAccess(int access) {
		this.access = access;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public int getDriverId() {
		return this.driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public int getDropDoor() {
		return dropDoor;
	}

	public void setDropDoor(int dropDoor) {
		this.dropDoor = dropDoor;
	}

	public String getDuration() {
		return this.duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Time getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getLft() {
		return this.lft;
	}

	public void setLft(int lft) {
		this.lft = lft;
	}

	public int getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(int modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public int getOrdering() {
		return this.ordering;
	}

	public void setOrdering(int ordering) {
		this.ordering = ordering;
	}

	public String getParams() {
		return this.params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public int getParentId() {
		return this.parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getPolicy() {
		return this.policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
	}

	public Date getPublishDate() {
		return this.publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}


	public String getRoute() {
		return this.route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public String getSeats() {
		return this.seats;
	}

	public void setSeats(String seats) {
		this.seats = seats;
	}

	public Time getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public int getRgt() {
		return rgt;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getUnpublishDate() {
		return this.unpublishDate;
	}

	public void setUnpublishDate(Date unpublishDate) {
		this.unpublishDate = unpublishDate;
	}

	public List<YobBookproBusstop> getYobBookproBusstops() {
		return this.yobBookproBusstops;
	}

	public void setYobBookproBusstops(List<YobBookproBusstop> yobBookproBusstops) {
		this.yobBookproBusstops = yobBookproBusstops;
	}

	public YobBookproBusstop addYobBookproBusstop(YobBookproBusstop yobBookproBusstop) {
		getYobBookproBusstops().add(yobBookproBusstop);
		yobBookproBusstop.setYobBookproBustrip(this);

		return yobBookproBusstop;
	}

	public YobBookproBusstop removeYobBookproBusstop(YobBookproBusstop yobBookproBusstop) {
		getYobBookproBusstops().remove(yobBookproBusstop);
		yobBookproBusstop.setYobBookproBustrip(null);

		return yobBookproBusstop;
	}

	public YobBookproBus getYobBookproBus() {
		return this.yobBookproBus;
	}

	public void setYobBookproBus(YobBookproBus yobBookproBus) {
		this.yobBookproBus = yobBookproBus;
	}

	public YobBookproAgent getYobBookproAgent() {
		return this.yobBookproAgent;
	}

	public void setYobBookproAgent(YobBookproAgent yobBookproAgent) {
		this.yobBookproAgent = yobBookproAgent;
	}

	public List<YobBookproOrder> getYobBookproOrders() {
		return this.yobBookproOrders;
	}

	public void setYobBookproOrders(List<YobBookproOrder> yobBookproOrders) {
		this.yobBookproOrders = yobBookproOrders;
	}

	public YobBookproOrder addYobBookproOrder(YobBookproOrder yobBookproOrder) {
		getYobBookproOrders().add(yobBookproOrder);
		yobBookproOrder.setYobBookproBustrip(this);

		return yobBookproOrder;
	}

	public YobBookproOrder removeYobBookproOrder(YobBookproOrder yobBookproOrder) {
		getYobBookproOrders().remove(yobBookproOrder);
		yobBookproOrder.setYobBookproBustrip(null);

		return yobBookproOrder;
	}

	public List<YobBookproPassenger> getYobBookproPassengers() {
		return this.yobBookproPassengers;
	}

	public void setYobBookproPassengers(List<YobBookproPassenger> yobBookproPassengers) {
		this.yobBookproPassengers = yobBookproPassengers;
	}

	public YobBookproPassenger addYobBookproPassenger(YobBookproPassenger yobBookproPassenger) {
		getYobBookproPassengers().add(yobBookproPassenger);
		yobBookproPassenger.setYobBookproBustrip(this);

		return yobBookproPassenger;
	}

	public YobBookproPassenger removeYobBookproPassenger(YobBookproPassenger yobBookproPassenger) {
		getYobBookproPassengers().remove(yobBookproPassenger);
		yobBookproPassenger.setYobBookproBustrip(null);

		return yobBookproPassenger;
	}

	public int getFrom() {
		return from;
	}

	public void setFrom(int from) {
		this.from = from;
	}

	public int getTo() {
		return to;
	}

	public void setTo(int to) {
		this.to = to;
	}

	public void setRgt(int rgt) {
		this.rgt = rgt;
	}
}