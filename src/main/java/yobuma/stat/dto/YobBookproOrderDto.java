package yobuma.stat.dto;

import java.util.Date;
import java.util.List;

public class YobBookproOrderDto{

	private int id;

	private Date created;


	private String currency;

	private Double deposit;

	private Double discount;

	private String ipAddress;

	private String notes;

	private String notesYb;

	private String orderNumber;

	private String orderStatus;

	private String params;

	private String payMethod;

	private String payStatus;

	private Double refundAmount;

	private Date refundDate;

	private int returnRouteId;

	private String returnSeat;

	private Date returnStart;

	private String seat;

	private String serviceFee;

	private Date start;

	private int state;

	private Double subtotal;

	private String tax;

	private Double total;

	private Double totalBag;

	private int txId;

	private String type;

	private YobBookproCustomerDto yobBookproCustomer;

	private List<YobBookproOrderRequestDto> yobBookproOrderRequests;

	private int couponId;

	private int currencyId;

	private YobBookproBustripDto yobBookproBustrip;

	private List<YobBookproOrdersLogDto> yobBookproOrdersLogs;

	private List<YobBookproPassengerDto> yobBookproPassengers;

	private int createdBy;

	public YobBookproOrderDto() {
	}

	public int getId() {
		return id;
	}

	public Date getCreated() {
		return created;
	}

	public String getCurrency() {
		return currency;
	}

	public Double getDeposit() {
		return deposit;
	}

	public Double getDiscount() {
		return discount;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public String getNotes() {
		return notes;
	}

	public String getNotesYb() {
		return notesYb;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public String getParams() {
		return params;
	}

	public String getPayMethod() {
		return payMethod;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public Double getRefundAmount() {
		return refundAmount;
	}

	public Date getRefundDate() {
		return refundDate;
	}

	public int getReturnRouteId() {
		return returnRouteId;
	}

	public String getReturnSeat() {
		return returnSeat;
	}

	public Date getReturnStart() {
		return returnStart;
	}

	public String getSeat() {
		return seat;
	}

	public String getServiceFee() {
		return serviceFee;
	}

	public Date getStart() {
		return start;
	}

	public int getState() {
		return state;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public String getTax() {
		return tax;
	}

	public Double getTotal() {
		return total;
	}

	public Double getTotalBag() {
		return totalBag;
	}

	public int getTxId() {
		return txId;
	}

	public String getType() {
		return type;
	}

	public YobBookproCustomerDto getYobBookproCustomer() {
		return yobBookproCustomer;
	}

	public List<YobBookproOrderRequestDto> getYobBookproOrderRequests() {
		return yobBookproOrderRequests;
	}

	public int getCouponId() {
		return couponId;
	}

	public int getCurrencyId() {
		return currencyId;
	}

	public YobBookproBustripDto getYobBookproBustrip() {
		return yobBookproBustrip;
	}

	public List<YobBookproOrdersLogDto> getYobBookproOrdersLogs() {
		return yobBookproOrdersLogs;
	}

	public List<YobBookproPassengerDto> getYobBookproPassengers() {
		return yobBookproPassengers;
	}

	public int getCreatedBy() {
		return createdBy;
	}
}