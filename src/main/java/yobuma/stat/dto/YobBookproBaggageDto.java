package yobuma.stat.dto;

public class YobBookproBaggageDto {
	private int id;

	private float price;

	private int qty;

	private int state;

	private int weight;

	private YobBookproAgentDto yobBookproAgent;

	public YobBookproBaggageDto() {
	}

	public int getId() {
		return id;
	}

	public float getPrice() {
		return price;
	}

	public int getQty() {
		return qty;
	}

	public int getState() {
		return state;
	}

	public int getWeight() {
		return weight;
	}

	public YobBookproAgentDto getYobBookproAgent() {
		return yobBookproAgent;
	}
}