package yobuma.stat.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the yob_bookpro_orders_log database table.
 * 
 */
@Entity
@Table(name="yob_bookpro_orders_log")
@NamedQuery(name="YobBookproOrdersLog.findAll", query="SELECT y FROM YobBookproOrdersLog y")
public class YobBookproOrdersLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int category;

	@Temporal(TemporalType.TIMESTAMP)
	private Date created;

	@Column(name="created_by")
	private int createdBy;

	@Column(name="ip_address")
	private String ipAddress;

	private String notes;

	@Column(name="user_id")
	private int userId;

	//bi-directional many-to-one association to YobBookproOrder
	@ManyToOne
	@JoinColumn(name="order_id_id")
	private YobBookproOrder yobBookproOrder;

	public YobBookproOrdersLog() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategory() {
		return this.category;
	}

	public void setCategory(int category) {
		this.category = category;
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