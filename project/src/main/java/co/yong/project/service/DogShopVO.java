package co.yong.project.service;

import lombok.Data;

@Data
public class DogShopVO {
	
	private String name;
	private String ability;
	private int count;
	private long price;
	
	
	public DogShopVO() {
		super();
	}
	
	
	public DogShopVO(String name) {
		super();
		this.name = name;
	}
	
	
	public String toString() {
		System.out.println();
		System.out.print("                     이름: "+name);
		System.out.print(", 능력: "+ability+", ");
		System.out.print("수량: "+count+", ");
		System.out.println("가격: "+price);
		
		return null;
	}




	
	
	
}
