package com.yedam.movie.service;

import java.awt.image.DataBufferDouble;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.yedam.commen.PropertiesPari;
import com.yedam.movie.VO.BoxofficeInfo;
import com.yedam.movie.VO.BoxofficeResult;
import com.yedam.movie.VO.MovieInfo;

public class MovieService {
	private static final String key = "b00dc28c267a509d9607412dde965836";

	
	// 일별 박스오피스
	public static List<MovieInfo> getDailyBoxOfficeResult() {
		String serviceURL = "http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?";

		List<PropertiesPari> params = new ArrayList<PropertiesPari>();
		params.add(new PropertiesPari("key", key));
		params.add(new PropertiesPari("targetDt","20220503"));
		
		
		


		StringBuilder sb = new StringBuilder();

		try {
			String paramURL = PropertiesPari.getQuery(params);
			String requestURL = serviceURL + paramURL;
			URL url = new URL(requestURL);
			HttpURLConnection con = (HttpURLConnection) url.openConnection(); // 강제형변환이 필요// 서버와 연결

			if (con.getResponseCode() == HttpURLConnection.HTTP_OK) {
				BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8")); // 데이터 부르는
																												// 거
				String line;
				while ((line = br.readLine()) != null) {
					sb.append(line);
				}
				br.close();
			} else {
				System.out.println(con.getResponseMessage());
			}

			con.disconnect();
		} catch (Exception e) {

			e.printStackTrace();
		}
		String jsonResult = sb.toString();
		
	 BoxofficeResult result = new Gson().fromJson(jsonResult, BoxofficeResult.class);
		
		return result.getBoxOfficeResult().getDailyBoxOfficeList();
	}

}
