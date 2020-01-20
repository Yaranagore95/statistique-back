package yobuma.stat.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the yob_bookpro_busstop database table.
 * 
 */
@Entity
@Table(name="yob_bookpro_busstop")
@NamedQuery(name="YobBookproBusstop.findAll", query="SELECT y FROM YobBookproBusstop y")
public class YobBookproBusstop implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String depart;

	private String location;

	@Lob
	private String params;

	// Modification de double en float
	private float price;

	// Modification de String en int
	private int state;

	// Modification de String en int
	private int type;

	//bi-directional many-to-one association to YobBookproBustrip
	@ManyToOne
	@JoinColumn(name="bustrip_id")
	@JsonIgnore
	private YobBookproBustrip yobBookproBustrip;

	public YobBookproBusstop() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepart() {
		return this.depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getParams() {
		return this.params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public YobBookproBustrip getYobBookproBustrip() {
		return this.yobBookproBustrip;
	}

	public void setYobBookproBustrip(YobBookproBustrip yobBookproBustrip) {
		this.yobBookproBustrip = yobBookproBustrip;
	}

}