package yobuma.stat.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the yob_bookpro_bus database table.
 * 
 */
@Entity
@Table(name="yob_bookpro_bus")
@NamedQuery(name="YobBookproBus.findAll", query="SELECT y FROM YobBookproBus y")
public class YobBookproBus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="bus_type")
	private int busType;

	private String code;

	@Column(name="created_by")
	private int createdBy;

	@Lob
	// Modification de descr à desc
	@Column(name = "desc")
	private String descr;

	private String image;

	@Lob
	private String images;

	@Column(name="modified_by")
	private int modifiedBy;

	@Lob
	private String params;

	private int seat;

	private int state;

	private String title;

	// Modification de upper_seattemplate_id à upperseattemplate_id
	@Column(name="upperseattemplate_id")
	private int upperSeattemplateId;

	//bi-directional many-to-one association to YobBookproBusSeattemplate
	@ManyToOne
	// Modification de bus_seattemplate_id à seattemplate_id
	@JoinColumn(name="seattemplate_id")
	@JsonIgnore
	private YobBookproBusSeattemplate yobBookproBusSeattemplate;

	//bi-directional many-to-one association to YobBookproAgent
	@ManyToOne
	@JoinColumn(name="agent_id")
	@JsonIgnore
	private YobBookproAgent yobBookproAgent;

	//bi-directional many-to-one association to YobBookproBustrip
	@OneToMany(mappedBy="yobBookproBus")
	@JsonIgnore
	private List<YobBookproBustrip> yobBookproBustrips;

	public YobBookproBus() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBusType() {
		return this.busType;
	}

	public void setBusType(int busType) {
		this.busType = busType;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
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

	public int getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(int modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getParams() {
		return this.params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public int getSeat() {
		return this.seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
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

	public int getUpperSeattemplateId() {
		return this.upperSeattemplateId;
	}

	public void setUpperSeattemplateId(int upperSeattemplateId) {
		this.upperSeattemplateId = upperSeattemplateId;
	}

	public YobBookproBusSeattemplate getYobBookproBusSeattemplate() {
		return this.yobBookproBusSeattemplate;
	}

	public void setYobBookproBusSeattemplate(YobBookproBusSeattemplate yobBookproBusSeattemplate) {
		this.yobBookproBusSeattemplate = yobBookproBusSeattemplate;
	}

	public YobBookproAgent getYobBookproAgent() {
		return this.yobBookproAgent;
	}

	public void setYobBookproAgent(YobBookproAgent yobBookproAgent) {
		this.yobBookproAgent = yobBookproAgent;
	}

	public List<YobBookproBustrip> getYobBookproBustrips() {
		return this.yobBookproBustrips;
	}

	public void setYobBookproBustrips(List<YobBookproBustrip> yobBookproBustrips) {
		this.yobBookproBustrips = yobBookproBustrips;
	}

	public YobBookproBustrip addYobBookproBustrip(YobBookproBustrip yobBookproBustrip) {
		getYobBookproBustrips().add(yobBookproBustrip);
		yobBookproBustrip.setYobBookproBus(this);

		return yobBookproBustrip;
	}

	public YobBookproBustrip removeYobBookproBustrip(YobBookproBustrip yobBookproBustrip) {
		getYobBookproBustrips().remove(yobBookproBustrip);
		yobBookproBustrip.setYobBookproBus(null);

		return yobBookproBustrip;
	}

}