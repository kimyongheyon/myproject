package com.yedam.app;

import java.util.List;

import com.yedam.forecast.service.ForecastService;
import com.yedam.movie.VO.MovieInfo;
import com.yedam.movie.service.MovieService;
import com.yedam.openAplforecast.WeatherInfo;

public class App {

	public static void main(String[] args) {

		
	
	List<MovieInfo>	list =  MovieService.getDailyBoxOfficeResult();
		for(MovieInfo info : list) {
			System.out.println(info);
		
		}
//		ForecastService.getWeatherForecast();
		//}
		List<WeatherInfo>list1 = ForecastService.getWeatherForecast();
		for(WeatherInfo info : list1) {
			System.out.println(info);
		}
		
		
	
	}
}
