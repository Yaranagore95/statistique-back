package yobuma.stat.dto;

import java.util.List;


public class YobBookproBusSeattemplateDto {

	private int id;

	private String blockLayout;

	private String title;

	private List<YobBookproBusDto> yobBookproBuses;

	public YobBookproBusSeattemplateDto() {
	}

	public int getId() {
		return id;
	}

	public String getBlockLayout() {
		return blockLayout;
	}

	public String getTitle() {
		return title;
	}

	public List<YobBookproBusDto> getYobBookproBuses() {
		return yobBookproBuses;
	}
}