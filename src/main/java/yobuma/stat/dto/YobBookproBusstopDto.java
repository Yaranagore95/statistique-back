package yobuma.stat.dto;

public class YobBookproBusstopDto  {
	private int id;

	private String depart;

	private String location;

	private String params;

	private double price;

	private String state;

	private String type;

	private YobBookproBustripDto yobBookproBustrip;

	public YobBookproBusstopDto() {
	}

	public int getId() {
		return id;
	}

	public String getDepart() {
		return depart;
	}

	public String getLocation() {
		return location;
	}

	public String getParams() {
		return params;
	}

	public double getPrice() {
		return price;
	}

	public String getState() {
		return state;
	}

	public String getType() {
		return type;
	}

	public YobBookproBustripDto getYobBookproBustrip() {
		return yobBookproBustrip;
	}
}