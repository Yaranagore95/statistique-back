package yobuma.stat.models;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the yob_bookpro_dest database table.
 * 
 */
@Entity
@Table(name="yob_bookpro_dest")
@NamedQuery(name="YobBookproDest.findAll", query="SELECT y FROM YobBookproDest y")
public class YobBookproDest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int access;

	// Modification de type int à Integer
	private Integer air;

	private String alias;

	// Modification de type int à Integer
	private Integer bus;

	private String code;

	@Lob
	// Modification de descr en desc
	@Column(name = "desc")
	private String descr;

	private String image;

	@Lob
	private String images;

	@Lob
	private String intro;

	// Modification de double en float
	private float latitude;

	private int level;

	private int lft;

	// Modification de double en float
	private float longitude;

	@Lob
	private String metadesc;

	@Lob
	private String metakey;

	private int ordering;

	@Column(name="parent_id")
	private int parentId;

	private String path;

	// Modification de int en Integer
	private Integer province;

	private int rgt;

	private int state;

	@Column(name="state_id")
	private Integer stateId;

	private String title;

	private String value;

	@JoinColumn(name="country_id")
	private int countryId;

	public YobBookproDest() {
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

	public Integer getAir() {
		return air;
	}

	public void setAir(Integer air) {
		this.air = air;
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Integer getBus() {
		return bus;
	}

	public void setBus(Integer bus) {
		this.bus = bus;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getImages() {
		return this.images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public String getIntro() {
		return this.intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
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

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public String getMetadesc() {
		return this.metadesc;
	}

	public void setMetadesc(String metadesc) {
		this.metadesc = metadesc;
	}

	public String getMetakey() {
		return this.metakey;
	}

	public void setMetakey(String metakey) {
		this.metakey = metakey;
	}

	public int getOrdering() {
		return this.ordering;
	}

	public void setOrdering(int ordering) {
		this.ordering = ordering;
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

	public Integer getProvince() {
		return province;
	}

	public void setProvince(Integer province) {
		this.province = province;
	}

	public int getRgt() {
		return this.rgt;
	}

	public void setRgt(int rgt) {
		this.rgt = rgt;
	}

	public int getState() {
		return this.state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public Integer getStateId() {
		return stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}