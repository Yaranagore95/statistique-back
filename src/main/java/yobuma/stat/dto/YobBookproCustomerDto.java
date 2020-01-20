package yobuma.stat.dto;


import java.util.Date;
import java.util.List;

public class YobBookproCustomerDto {
	private int id;

	private String address;


	private String billingAddress;

	private Date birthday;

	private String cardholder;

	private int checkedOut;

	private Date checkedOutTime;

	private String city;

	private Date created;

	private String email;

	private String fax;

	private String firstname;

	private int gender;

	private String lang;

	private String lastname;

	private String mobile;

	private String orther;

	private String params;

	private String passport;

	private int referralId;

	private int opId;

	private int state;

	private String states;

	private String telephone;

	private int user;

	private String zip;

	private int cGroupId;

	private int countryId;

	private List<YobBookproOrderDto> yobBookproOrders;

	public YobBookproCustomerDto() {
	}

	public int getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	public String getBillingAddress() {
		return billingAddress;
	}

	public Date getBirthday() {
		return birthday;
	}

	public String getCardholder() {
		return cardholder;
	}

	public int getCheckedOut() {
		return checkedOut;
	}

	public Date getCheckedOutTime() {
		return checkedOutTime;
	}

	public String getCity() {
		return city;
	}

	public Date getCreated() {
		return created;
	}

	public String getEmail() {
		return email;
	}

	public String getFax() {
		return fax;
	}

	public String getFirstname() {
		return firstname;
	}

	public int getGender() {
		return gender;
	}

	public String getLang() {
		return lang;
	}

	public String getLastname() {
		return lastname;
	}

	public String getMobile() {
		return mobile;
	}

	public String getOrther() {
		return orther;
	}

	public String getParams() {
		return params;
	}

	public String getPassport() {
		return passport;
	}

	public int getReferralId() {
		return referralId;
	}

	public int getOpId() {
		return opId;
	}

	public int getState() {
		return state;
	}

	public String getStates() {
		return states;
	}

	public String getTelephone() {
		return telephone;
	}

	public int getUser() {
		return user;
	}

	public String getZip() {
		return zip;
	}

	public int getcGroupId() {
		return cGroupId;
	}

	public int getCountryId() {
		return countryId;
	}

	public List<YobBookproOrderDto> getYobBookproOrders() {
		return yobBookproOrders;
	}
}