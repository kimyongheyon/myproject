package com.yedam.commen;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class PropertiesPari {
	
	private String key;
	private String value;
	
	public static String getQuery(List<PropertiesPari>params) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		boolean isFirst = true;
		
		for(PropertiesPari param : params ) {
			if(isFirst) {
				isFirst = false;
			}
			else {
				sb.append("&");
			}
			sb.append(URLEncoder.encode(param.getKey(),"UTF-8"));
			sb.append("=");
			sb.append(URLEncoder.encode(param.getValue(),"UTF-8"));
		}
		return sb.toString();
	}
	
	
}
