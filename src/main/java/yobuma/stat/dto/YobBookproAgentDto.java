package yobuma.stat.dto;

import java.util.Date;
import java.util.List;


public class YobBookproAgentDto {
	private int id;

	private String adress;

	private String alias;

	private Date birthday;

	private String brandname;

	private String city;

	private String company;

	private Date created;

	private String descr;

	private String email;

	private String fax;

	private String firstname;

	private String image;

	private String lastname;

	private String mobile;

	private String params;

	private String skype;

	private String state;

	private String states;

	private String telephone;

	private int user;

	private String website;

	private String zip;

	private int countryId;

	private List<YobBookproBaggageDto> yobBookproBaggages;

	private List<YobBookproBusDto> yobBookproBuses;

	private List<YobBookproBustripDto> yobBookproBustrips;

	public YobBookproAgentDto() {
	}

	public int getId() {
		return id;
	}

	public String getAdress() {
		return adress;
	}

	public String getAlias() {
		return alias;
	}

	public Date getBirthday() {
		return birthday;
	}

	public String getBrandname() {
		return brandname;
	}

	public String getCity() {
		return city;
	}

	public String getCompany() {
		return company;
	}

	public Date getCreated() {
		return created;
	}

	public String getDescr() {
		return descr;
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

	public String getImage() {
		return image;
	}

	public String getLastname() {
		return lastname;
	}

	public String getMobile() {
		return mobile;
	}

	public String getParams() {
		return params;
	}

	public String getSkype() {
		return skype;
	}

	public String getState() {
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

	public String getWebsite() {
		return website;
	}

	public String getZip() {
		return zip;
	}

	public int getCountryId() {
		return countryId;
	}

	public List<YobBookproBaggageDto> getYobBookproBaggages() {
		return yobBookproBaggages;
	}

	public List<YobBookproBusDto> getYobBookproBuses() {
		return yobBookproBuses;
	}

	public List<YobBookproBustripDto> getYobBookproBustrips() {
		return yobBookproBustrips;
	}
}