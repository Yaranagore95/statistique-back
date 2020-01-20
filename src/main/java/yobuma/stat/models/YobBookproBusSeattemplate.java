package yobuma.stat.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the yob_bookpro_bus_seattemplate database table.
 * 
 */
@Entity
@Table(name="yob_bookpro_bus_seattemplate")
@NamedQuery(name="YobBookproBusSeattemplate.findAll", query="SELECT y FROM YobBookproBusSeattemplate y")
public class YobBookproBusSeattemplate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Lob
	@Column(name="block_layout")
	private String blockLayout;

	private String title;

	//bi-directional many-to-one association to YobBookproBus
	@OneToMany(mappedBy="yobBookproBusSeattemplate")
	@JsonIgnore
	private List<YobBookproBus> yobBookproBuses;

	public YobBookproBusSeattemplate() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBlockLayout() {
		return this.blockLayout;
	}

	public void setBlockLayout(String blockLayout) {
		this.blockLayout = blockLayout;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<YobBookproBus> getYobBookproBuses() {
		return this.yobBookproBuses;
	}

	public void setYobBookproBuses(List<YobBookproBus> yobBookproBuses) {
		this.yobBookproBuses = yobBookproBuses;
	}

	public YobBookproBus addYobBookproBus(YobBookproBus yobBookproBus) {
		getYobBookproBuses().add(yobBookproBus);
		yobBookproBus.setYobBookproBusSeattemplate(this);

		return yobBookproBus;
	}

	public YobBookproBus removeYobBookproBus(YobBookproBus yobBookproBus) {
		getYobBookproBuses().remove(yobBookproBus);
		yobBookproBus.setYobBookproBusSeattemplate(null);

		return yobBookproBus;
	}

}