package co.yong.project.service;

import lombok.Data;

@Data
public class DogSabiltyVO {

	private String dname;
	private int happy;
	private int stress;
	private int health;
	private int full;
	private int cleanliness;
	
	public DogSabiltyVO(){}
	
	public DogSabiltyVO(String dname){
		this.dname =dname;
	}
	
	public String toString() {
		System.out.println();
		System.out.print("                      이름:"+ dname);
		System.out.print(","+"행복지수:"+happy);
		System.out.print(","+"스트레스:"+stress);
		System.out.print(","+"건강지수:"+health);
		System.out.print(","+"포만감:"+full);
		System.out.println(","+"청결지수:"+cleanliness);
		
		return null;
	}
	
}
