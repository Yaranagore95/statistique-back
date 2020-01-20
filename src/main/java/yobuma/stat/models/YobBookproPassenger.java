package yobuma.stat.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Value;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="yob_bookpro_passenger")
@NamedQuery(name="YobBookproPassenger.findAll", query="SELECT y FROM YobBookproPassenger y")
public class YobBookproPassenger implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String age;

	@Column(name="bag_qty")
	private int bagQty;

	@Temporal(TemporalType.TIMESTAMP)
	private Date birthday;

	private String email;

	private String firstname;

	private String gender;

	@Column(name="group_id")
	private int groupId;

	private String lastname;

	private String notes;

	@Column(name="notes_yb")
	private String notesYb;

	@Lob
	private String params;

	private String passport;

	private String phone;

	private String pnr;

	@Temporal(TemporalType.TIMESTAMP)
	private Date ppvalid;

	private double price;

	@Column(name="price_bag")
	private double priceBag;

	@Column(name="return_bag_qty")
	private int returnBagQty;

	@Column(name="return_price")
	private double returnPrice;

	@Column(name="return_price_bag")
	private double returnPriceBag;

	@Column(name="return_route_id")
	private int returnRouteId;

	@Column(name="return_seat")
	private String returnSeat;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="return_start")
	@Value("0000-00-00 00:00:00")
	private Date returnStart;

	private String seat;

	@Column(name="short_phone")
	private String shortPhone;

	@Temporal(TemporalType.TIMESTAMP)
	private Date start;

	private int state;

	private String title;

	@JoinColumn(name="country_id")
	private int countryId;

	@ManyToOne
	@JoinColumn(name="route_id")
	private YobBookproBustrip yobBookproBustrip;

	//bi-directional many-to-one association to YobBookproOrder
	@ManyToOne
	@JoinColumn(name="order_id")
	@JsonIgnore
	private YobBookproOrder yobBookproOrder;

	public YobBookproPassenger() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAge() {
		return this.age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public int getBagQty() {
		return this.bagQty;
	}

	public void setBagQty(int bagQty) {
		this.bagQty = bagQty;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getNotesYb() {
		return this.notesYb;
	}

	public void setNotesYb(String notesYb) {
		this.notesYb = notesYb;
	}

	public String getParams() {
		return this.params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public String getPassport() {
		return this.passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPnr() {
		return this.pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public Date getPpvalid() {
		return this.ppvalid;
	}

	public void setPpvalid(Date ppvalid) {
		this.ppvalid = ppvalid;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPriceBag() {
		return this.priceBag;
	}

	public void setPriceBag(double priceBag) {
		this.priceBag = priceBag;
	}

	public int getReturnBagQty() {
		return this.returnBagQty;
	}

	public void setReturnBagQty(int returnBagQty) {
		this.returnBagQty = returnBagQty;
	}

	public double getReturnPrice() {
		return this.returnPrice;
	}

	public void setReturnPrice(double returnPrice) {
		this.returnPrice = returnPrice;
	}

	public double getReturnPriceBag() {
		return this.returnPriceBag;
	}

	public void setReturnPriceBag(double returnPriceBag) {
		this.returnPriceBag = returnPriceBag;
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

	public String getShortPhone() {
		return this.shortPhone;
	}

	public void setShortPhone(String shortPhone) {
		this.shortPhone = shortPhone;
	}

	public Date getStart() {
		return this.start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public int getState() {
		return this.state;
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

	public YobBookproBustrip getYobBookproBustrip() {
		return this.yobBookproBustrip;
	}

	public void setYobBookproBustrip(YobBookproBustrip yobBookproBustrip) {
		this.yobBookproBustrip = yobBookproBustrip;
	}

	public YobBookproOrder getYobBookproOrder() {
		return this.yobBookproOrder;
	}

	public void setYobBookproOrder(YobBookproOrder yobBookproOrder) {
		this.yobBookproOrder = yobBookproOrder;
	}

}