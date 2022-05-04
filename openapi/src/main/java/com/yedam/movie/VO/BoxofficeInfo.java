package com.yedam.movie.VO;

import java.util.List;

import lombok.Data;

@Data
public class BoxofficeInfo {

	private String boxofficeType;
	private String showRange;
	private List<MovieInfo> dailyBoxOfficeList;

}
