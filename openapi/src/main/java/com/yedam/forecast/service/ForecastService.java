package com.yedam.forecast.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.yedam.commen.PropertiesPari;
import com.yedam.openAplforecast.WeatherInfo;

public class ForecastService {

	// 동네예보 - 육상예보조회

	public static List<WeatherInfo> getWeatherForecast() {
		String key = "Epr2D1yrRShKQXqMgzqHIO3ucNlP2tFO4/A4mVviIScm5pG8s5bVmXwZ7F3f4xXMklQB2w8mkd/ynxWUqovh7g==";

		String serviceURL = "http://apis.data.go.kr/1360000/VilageFcstMsgService/getLandFcst?";

		List<PropertiesPari> params = new ArrayList<PropertiesPari>();

		params.add(new PropertiesPari("ServiceKey", key));
		params.add(new PropertiesPari("pageNo", "1"));
		params.add(new PropertiesPari("numOfRows", "10"));
		params.add(new PropertiesPari("dataType", "JSON"));
		params.add(new PropertiesPari("regId", "11A00101"));

		StringBuilder sb = new StringBuilder();
		try {

			String paramURL = PropertiesPari.getQuery(params);

			String requestURL = serviceURL + paramURL;
			URL url = new URL(requestURL);

			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Content-type", "application/json"); // content-type은 받는 쪽이 무슨 타입인지 알 수 있도록 해주는 거

			if (con.getResponseCode() == HttpURLConnection.HTTP_OK) {
				BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
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
		String jsonReult = sb.toString();

		return getWeatherData(jsonReult);
	}

	private static List<WeatherInfo> getWeatherData(String jsonData) {
		List<WeatherInfo> list = new ArrayList<WeatherInfo>();
		try {
			JSONParser parser = new JSONParser();
			JSONObject forecastData = (JSONObject) parser.parse(jsonData);
			JSONObject response = (JSONObject) forecastData.get("response");
			JSONObject body = (JSONObject) response.get("body");
			JSONObject items = (JSONObject) body.get("items");
			JSONArray item = (JSONArray) items.get("item");
			
			for(int i=0; i< item.size(); i++) {
			JSONObject data = (JSONObject)item.get(i);
			WeatherInfo  info = new WeatherInfo();
			
			info.setAnnounceTime((long)data.get("announceTime"));
			
			info.setNumEf((data.get("numEf")  == null) ? 0 : (long)data.get("numEf"));
			
			info.setRegId((String)data.get("regId"));
			
			info.setRnSt((data.get("rnSt")== null ) ? 0 : (long)data.get("rnSt"));
			
			info.setRnYn((long)data.get("rnYn"));
			
			info.setTa((data.get("ta") == null) ? "" : (String)data.get("ta"));
			
			info.setWf((String)data.get("wf"));
			
			info.setWfCd((String)data.get("wfCd"));
			
			info.setWsIt((String)data.get("wsIt"));
			
			list.add(info);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
