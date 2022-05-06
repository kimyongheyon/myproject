package co.yong.project.service;

import lombok.Data;

@Data
public class DogShopVO {
	
	private String name;
	private String ability;
	private int count;
	private long price;
	
	
	public String toString() {
		System.out.print(name + ":");
		System.out.print(ability+":");
		System.out.print(count +":");
		System.out.println(price+":");
		
		return null;
	}
	
	
	
}
