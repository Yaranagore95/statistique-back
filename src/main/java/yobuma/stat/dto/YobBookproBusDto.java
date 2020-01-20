package yobuma.stat.dto;

import java.util.List;


public class YobBookproBusDto {
	private int id;

	private int busType;

	private String code;

	private int createdBy;

	private String descr;

	private String image;

	private String images;

	private int modifiedBy;

	private String params;

	private int seat;

	private int state;

	private String title;

	private int upperSeattemplateId;

	private YobBookproBusSeattemplateDto yobBookproBusSeattemplate;

	private YobBookproAgentDto yobBookproAgent;

	private List<YobBookproBustripDto> yobBookproBustrips;

	public YobBookproBusDto() {
	}

	public int getId() {
		return id;
	}

	public int getBusType() {
		return busType;
	}

	public String getCode() {
		return code;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public String getDescr() {
		return descr;
	}

	public String getImage() {
		return image;
	}

	public String getImages() {
		return images;
	}

	public int getModifiedBy() {
		return modifiedBy;
	}

	public String getParams() {
		return params;
	}

	public int getSeat() {
		return seat;
	}

	public int getState() {
		return state;
	}

	public String getTitle() {
		return title;
	}

	public int getUpperSeattemplateId() {
		return upperSeattemplateId;
	}

	public YobBookproBusSeattemplateDto getYobBookproBusSeattemplate() {
		return yobBookproBusSeattemplate;
	}

	public YobBookproAgentDto getYobBookproAgent() {
		return yobBookproAgent;
	}

	public List<YobBookproBustripDto> getYobBookproBustrips() {
		return yobBookproBustrips;
	}
}


