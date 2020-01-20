package yobuma.stat.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name="yob_bookpro_agent")
@NamedQuery(name="YobBookproAgent.findAll", query="SELECT y FROM YobBookproAgent y")
public class YobBookproAgent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	// Ajout de address
	@Column(name = "address")
	private String adress;

	private String alias;

	@Temporal(TemporalType.TIMESTAMP)
	private Date birthday;

	private String brandname;

	private String city;

	private String company;

	@Temporal(TemporalType.TIMESTAMP)
	private Date created;

	@Lob
	// modification de descr en desc
	@Column(name = "desc")
	private String descr;

	private String email;

	private String fax;

	private String firstname;

	private String image;

	private String lastname;

	private String mobile;

	@Lob
	private String params;

	private String skype;

	private String state;

	private String states;

	private String telephone;

	// Modification de type int à Integer
	private Integer user;

	private String website;

	private String zip;

	private Integer countryId;

	//bi-directional many-to-one association to YobBookproBaggage
	@OneToMany(mappedBy="yobBookproAgent")
	@JsonIgnore
	private List<YobBookproBaggage> yobBookproBaggages;

	//bi-directional many-to-one association to YobBookproBus
	@OneToMany(mappedBy="yobBookproAgent")
	@JsonIgnore
	private List<YobBookproBus> yobBookproBuses;

	//bi-directional many-to-one association to YobBookproBustrip
	@OneToMany(mappedBy="yobBookproAgent")
	@JsonIgnore
	private List<YobBookproBustrip> yobBookproBustrips;


	public YobBookproAgent() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdress() {
		return this.adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getBrandname() {
		return this.brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
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

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
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

	public String getParams() {
		return this.params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public String getSkype() {
		return this.skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
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

	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public List<YobBookproBaggage> getYobBookproBaggages() {
		return this.yobBookproBaggages;
	}

	public void setYobBookproBaggages(List<YobBookproBaggage> yobBookproBaggages) {
		this.yobBookproBaggages = yobBookproBaggages;
	}

	public YobBookproBaggage addYobBookproBaggage(YobBookproBaggage yobBookproBaggage) {
		getYobBookproBaggages().add(yobBookproBaggage);
		yobBookproBaggage.setYobBookproAgent(this);

		return yobBookproBaggage;
	}

	public YobBookproBaggage removeYobBookproBaggage(YobBookproBaggage yobBookproBaggage) {
		getYobBookproBaggages().remove(yobBookproBaggage);
		yobBookproBaggage.setYobBookproAgent(null);

		return yobBookproBaggage;
	}

	public List<YobBookproBus> getYobBookproBuses() {
		return this.yobBookproBuses;
	}

	public void setYobBookproBuses(List<YobBookproBus> yobBookproBuses) {
		this.yobBookproBuses = yobBookproBuses;
	}

	public YobBookproBus addYobBookproBus(YobBookproBus yobBookproBus) {
		getYobBookproBuses().add(yobBookproBus);
		yobBookproBus.setYobBookproAgent(this);

		return yobBookproBus;
	}

	public YobBookproBus removeYobBookproBus(YobBookproBus yobBookproBus) {
		getYobBookproBuses().remove(yobBookproBus);
		yobBookproBus.setYobBookproAgent(null);

		return yobBookproBus;
	}

	public List<YobBookproBustrip> getYobBookproBustrips() {
		return this.yobBookproBustrips;
	}

	public void setYobBookproBustrips(List<YobBookproBustrip> yobBookproBustrips) {
		this.yobBookproBustrips = yobBookproBustrips;
	}

	public YobBookproBustrip addYobBookproBustrip(YobBookproBustrip yobBookproBustrip) {
		getYobBookproBustrips().add(yobBookproBustrip);
		yobBookproBustrip.setYobBookproAgent(this);

		return yobBookproBustrip;
	}

	public YobBookproBustrip removeYobBookproBustrip(YobBookproBustrip yobBookproBustrip) {
		getYobBookproBustrips().remove(yobBookproBustrip);
		yobBookproBustrip.setYobBookproAgent(null);

		return yobBookproBustrip;
	}

	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
}