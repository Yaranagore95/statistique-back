package yobuma.stat.models;

import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the yob_bookpro_order_request database table.
 * 
 */
@Entity
@Table(name="yob_bookpro_order_request")
@NamedQuery(name="YobBookproOrderRequest.findAll", query="SELECT y FROM YobBookproOrderRequest y")
public class YobBookproOrderRequest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date created;

	@Column(name="created_by")
	private int createdBy;

	@Column(name="ip_address")
	private String ipAddress;

	private String notes;

	@Column(name="order_status")
	private String orderStatus;

	@Column(name="pay_status")
	private String payStatus;

	private int status;

	private int type;

	@Column(name="user_id")
	private int userId;

	//bi-directional many-to-one association to YobBookproOrder
	@ManyToOne
	@JoinColumn(name="order_id_id")
	private YobBookproOrder yobBookproOrder;

	public YobBookproOrderRequest() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public int getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getPayStatus() {
		return this.payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public YobBookproOrder getYobBookproOrder() {
		return this.yobBookproOrder;
	}

	public void setYobBookproOrder(YobBookproOrder yobBookproOrder) {
		this.yobBookproOrder = yobBookproOrder;
	}

}