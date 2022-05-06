package co.yong.project.service;

import lombok.Data;

@Data

public class DogKindVO {

	private  String dname;
	private int dage;
	private String dcharacter;

	
	public String toString() {
		System.out.print(dname+ ":");
		System.out.println(dage+":");
		System.out.println(dcharacter+":");
		
		return null;
	
	}
	
}
