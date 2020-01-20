package yobuma.stat.models;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the yob_bookpro_baggage database table.
 * 
 */
@Entity
@Table(name="yob_bookpro_baggage")
@NamedQuery(name="YobBookproBaggage.findAll", query="SELECT y FROM YobBookproBaggage y")
public class YobBookproBaggage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	// Modification de double en price
	private float price;

	// Modification de int à Integer
	private Integer qty;

	private int state;

	private int weight;

	//bi-directional many-to-one association to YobBookproAgent
	@ManyToOne
	@JoinColumn(name="agent_id")
	private YobBookproAgent yobBookproAgent;

	public YobBookproBaggage() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public int getState() {
		return this.state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getWeight() {
		return this.weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public YobBookproAgent getYobBookproAgent() {
		return this.yobBookproAgent;
	}

	public void setYobBookproAgent(YobBookproAgent yobBookproAgent) {
		this.yobBookproAgent = yobBookproAgent;
	}

}