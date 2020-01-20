package yobuma.stat.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Value;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the yob_bookpro_customer database table.
 * 
 */
@Entity
@Table(name="yob_bookpro_customer")
@NamedQuery(name="YobBookproCustomer.findAll", query="SELECT y FROM YobBookproCustomer y")
public class YobBookproCustomer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String address;

	@Lob
	@Column(name="billing_address")
	private String billingAddress;

	@Temporal(TemporalType.TIMESTAMP)
	@Value("0000-00-00 00:00:00")
	private Date birthday;

	private String cardholder;

	@Column(name="checked_out")
	private int checkedOut;

	@Temporal(TemporalType.DATE)
	@Column(name="checked_out_time")
	@Value("0000-00-00 00:00:00")
	private Date checkedOutTime;

	private String city;

	@Temporal(TemporalType.TIMESTAMP)
	private Date created;

	private String email;

	private String fax;

	private String firstname;

	// On met le type de gender à Integer pour eviter l'erreur
	// Null value was assigned to a property [class yobuma.stat.models.YobBookproCustomer.gender] of primitive type setter of yobuma.stat.models.YobBookproCustomer.gender
	private Integer gender;

	private String lang;

	private String lastname;

	private String mobile;

	private String orther;

	@Lob
	private String params;

	private String passport;

	// Modification de refferral_id à referral_id
	@Column(name="referral_id")
	private Integer referralId;

	@Column(name="op_id")
	private int opId;

	private int state;

	private String states;

	private String telephone;

	// On met le type à Integer pour eviter l'erreur
	// Null value was assigned to a property [class yobuma.stat.models.YobBookproCustomer.user] of primitive type setter of yobuma.stat.models.YobBookproCustomer.user
	private Integer user;

	private String zip;

	// Modification de cgroup_id cgroup_id
	@Column(name="cgroup_id")
	private int cGroupId;

	@Column(name="country_id")
	private int countryId;

	//bi-directional one-to-many association to YobBookproOrders
	@OneToMany(mappedBy = "yobBookproCustomer")
	@JsonIgnore
	private List<YobBookproOrder> yobBookproOrders;


	public YobBookproCustomer() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBillingAddress() {
		return this.billingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getCardholder() {
		return this.cardholder;
	}

	public void setCardholder(String cardholder) {
		this.cardholder = cardholder;
	}

	public int getCheckedOut() {
		return this.checkedOut;
	}

	public void setCheckedOut(int checkedOut) {
		this.checkedOut = checkedOut;
	}

	public Date getCheckedOutTime() {
		return this.checkedOutTime;
	}

	public void setCheckedOutTime(Date checkedOutTime) {
		this.checkedOutTime = checkedOutTime;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOrther() {
		return this.orther;
	}

	public void setOrther(String orther) {
		this.orther = orther;
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

	public Integer getReferralId() {
		return referralId;
	}

	public void setReferralId(Integer referralId) {
		this.referralId = referralId;
	}

	public int getState() {
		return this.state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getStates() {
		return this.states;
	}

	public void setStates(String states) {
		this.states = states;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Integer getUser() {
		return user;
	}

	public void setUser(Integer user) {
		this.user = user;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public int getOpId() {
		return opId;
	}

	public void setOpId(int opId) {
		this.opId = opId;
	}

	public List<YobBookproOrder> getYobBookproOrders() {
		return yobBookproOrders;
	}

	public void setYobBookproOrders(List<YobBookproOrder> yobBookproOrders) {
		this.yobBookproOrders = yobBookproOrders;
	}

	public int getcGroupId() {
		return cGroupId;
	}

	public YobBookproCustomer setcGroupId(int cGroupId) {
		this.cGroupId = cGroupId;
		return this;
	}

	public int getCountryId() {
		return countryId;
	}

	public YobBookproCustomer setCountryId(int countryId) {
		this.countryId = countryId;
		return this;
	}
}