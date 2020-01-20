package yobuma.stat.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Value;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the yob_bookpro_orders database table.
 * 
 */
@Entity
@Table(name="yob_bookpro_orders")
@NamedQuery(name="YobBookproOrder.findAll", query="SELECT y FROM YobBookproOrder y")
public class YobBookproOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date created;

	private String currency;

	@JsonIgnore
	// Modification on remet la valeur Double pour eviter l'erreur
	// Null value was assigned to a property [class yobuma.stat.models.YobBookproOrder.deposit] of primitive type setter of yobuma.stat.models.YobBookproOrder.deposit
	private Double deposit;

	private Double discount;

	@Column(name="ip_address")
	private String ipAddress;

	private String notes;

	@Column(name="notes_yb")
	private String notesYb;

	@Column(name="order_number")
	private String orderNumber;

	@Column(name="order_status")
	private String orderStatus;

	@Lob
	private String params;

	@Column(name="pay_method")
	private String payMethod;

	@Column(name="pay_status")
	private String payStatus;

	// Modification de double en float
	@Column(name="refund_amount")
	private float refundAmount;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="refund_date")
	private Date refundDate;

	@Column(name="return_route_id")
	private int returnRouteId;

	@Column(name="return_seat")
	private String returnSeat;

	@Temporal(TemporalType.DATE)
	@Column(name="return_start")
	@Value("0000-00-00 00:00:00")
	private Date returnStart;

	private String seat;

	@Column(name="service_fee")
	private String serviceFee;

	@Temporal(TemporalType.DATE)
	private Date start;

	// On met state a Integer pour eviter l'erreur
	// Null value was assigned to a property [class yobuma.stat.models.YobBookproOrder.state] of primitive type setter of yobuma.stat.models.YobBookproOrder.state

	private Integer state;

	private Double subtotal;

	private String tax;

	private Double total;

	@Column(name="total_bag")
	private Double totalBag;

	@Column(name="tx_id")
	// Modification de int à String
	private String txId;

	private String type;

	//bi-directional many-to-one association to YobBookproCustomer
	@ManyToOne
	@JoinColumn(name="user_id")
	private YobBookproCustomer yobBookproCustomer;

	//bi-directional many-to-one association to YobBookproOrderRequest
	@OneToMany(mappedBy="yobBookproOrder")
	@JsonIgnore
	private List<YobBookproOrderRequest> yobBookproOrderRequests;

	@JoinColumn(name="coupon_id")
	private int couponId;

	@JoinColumn(name="currency_id")
	private int currencyId;

	//bi-directional many-to-one association to YobBookproBustrip
	@ManyToOne
	@JoinColumn(name="route_id")
	private YobBookproBustrip yobBookproBustrip;

	//bi-directional many-to-one association to YobBookproOrdersLog
	@OneToMany(mappedBy="yobBookproOrder")
	@JsonIgnore
	private List<YobBookproOrdersLog> yobBookproOrdersLogs;

	//bi-directional many-to-one association to YobBookproPassenger
	@OneToMany(mappedBy="yobBookproOrder", fetch = FetchType.EAGER)
	private List<YobBookproPassenger> yobBookproPassengers;

	//bi-directionnel one-to-may association to YobBookproAgent
	//@ManyToOne
	//@JoinColumn(name = "created_by")
	// private YobBookproAgent yobBookproAgent;

    @Column(name = "created_by")
    private int createdBy;

	public YobBookproOrder() {
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


	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Double getDeposit() {
		return deposit;
	}

	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
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

	public String getNotesYb() {
		return notesYb;
	}

	public void setNotesYb(String notesYb) {
		this.notesYb = notesYb;
	}

	public String getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getParams() {
		return this.params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public String getPayMethod() {
		return this.payMethod;
	}

	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}

	public String getPayStatus() {
		return this.payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public float getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(float refundAmount) {
		this.refundAmount = refundAmount;
	}

	public Date getRefundDate() {
		return this.refundDate;
	}

	public void setRefundDate(Date refundDate) {
		this.refundDate = refundDate;
	}

	public int getReturnRouteId() {
		return this.returnRouteId;
	}

	public void setReturnRouteId(int returnRouteId) {
		this.returnRouteId = returnRouteId;
	}

	public String getReturnSeat() {
		return this.returnSeat;
	}

	public void setReturnSeat(String returnSeat) {
		this.returnSeat = returnSeat;
	}

	public Date getReturnStart() {
		return this.returnStart;
	}

	public void setReturnStart(Date returnStart) {
		this.returnStart = returnStart;
	}

	public String getSeat() {
		return this.seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	public String getServiceFee() {
		return this.serviceFee;
	}

	public void setServiceFee(String serviceFee) {
		this.serviceFee = serviceFee;
	}

	public Date getStart() {
		return this.start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getTax() {
		return this.tax;
	}

	public void setTax(String tax) {
		this.tax = tax;
	}

	public String getTxId() {
		return txId;
	}

	public void setTxId(String txId) {
		this.txId = txId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public YobBookproCustomer getYobBookproCustomer() {
		return yobBookproCustomer;
	}

	public void setYobBookproCustomer(YobBookproCustomer yobBookproCustomer) {
		this.yobBookproCustomer = yobBookproCustomer;
	}

	public List<YobBookproOrderRequest> getYobBookproOrderRequests() {
		return this.yobBookproOrderRequests;
	}

	public void setYobBookproOrderRequests(List<YobBookproOrderRequest> yobBookproOrderRequests) {
		this.yobBookproOrderRequests = yobBookproOrderRequests;
	}

	public YobBookproOrderRequest addYobBookproOrderRequest(YobBookproOrderRequest yobBookproOrderRequest) {
		getYobBookproOrderRequests().add(yobBookproOrderRequest);
		yobBookproOrderRequest.setYobBookproOrder(this);

		return yobBookproOrderRequest;
	}

	public YobBookproOrderRequest removeYobBookproOrderRequest(YobBookproOrderRequest yobBookproOrderRequest) {
		getYobBookproOrderRequests().remove(yobBookproOrderRequest);
		yobBookproOrderRequest.setYobBookproOrder(null);

		return yobBookproOrderRequest;
	}


	public YobBookproBustrip getYobBookproBustrip() {
		return this.yobBookproBustrip;
	}

	public void setYobBookproBustrip(YobBookproBustrip yobBookproBustrip) {
		this.yobBookproBustrip = yobBookproBustrip;
	}

	public List<YobBookproOrdersLog> getYobBookproOrdersLogs() {
		return this.yobBookproOrdersLogs;
	}

	public void setYobBookproOrdersLogs(List<YobBookproOrdersLog> yobBookproOrdersLogs) {
		this.yobBookproOrdersLogs = yobBookproOrdersLogs;
	}

	public YobBookproOrdersLog addYobBookproOrdersLog(YobBookproOrdersLog yobBookproOrdersLog) {
		getYobBookproOrdersLogs().add(yobBookproOrdersLog);
		yobBookproOrdersLog.setYobBookproOrder(this);

		return yobBookproOrdersLog;
	}

	public YobBookproOrdersLog removeYobBookproOrdersLog(YobBookproOrdersLog yobBookproOrdersLog) {
		getYobBookproOrdersLogs().remove(yobBookproOrdersLog);
		yobBookproOrdersLog.setYobBookproOrder(null);

		return yobBookproOrdersLog;
	}

	public List<YobBookproPassenger> getYobBookproPassengers() {
		return this.yobBookproPassengers;
	}

	public void setYobBookproPassengers(List<YobBookproPassenger> yobBookproPassengers) {
		this.yobBookproPassengers = yobBookproPassengers;
	}

	public YobBookproPassenger addYobBookproPassenger(YobBookproPassenger yobBookproPassenger) {
		getYobBookproPassengers().add(yobBookproPassenger);
		yobBookproPassenger.setYobBookproOrder(this);

		return yobBookproPassenger;
	}

	public YobBookproPassenger removeYobBookproPassenger(YobBookproPassenger yobBookproPassenger) {
		getYobBookproPassengers().remove(yobBookproPassenger);
		yobBookproPassenger.setYobBookproOrder(null);

		return yobBookproPassenger;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Double getTotalBag() {
		return totalBag;
	}

	public void setTotalBag(Double totalBag) {
		this.totalBag = totalBag;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public int getCouponId() {
		return couponId;
	}

	public void setCouponId(int couponId) {
		this.couponId = couponId;
	}

	public int getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(int currencyId) {
		this.currencyId = currencyId;
	}

	//	public YobBookproAgent getYobBookproAgent() {
//		return yobBookproAgent;
//	}
//
//	public void setYobBookproAgent(YobBookproAgent yobBookproAgent) {
//		this.yobBookproAgent = yobBookproAgent;
//	}
}