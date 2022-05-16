package co.yong.project.service;

import lombok.Data;

@Data
public class DogSabiltyVO {
	
		
		private int random1 = (int)(Math.random()*8)+1;
		private int random2 = (int)(Math.random()*8)+1;
		private int random3= (int)(Math.random()*8)+1;
		private int random4 = (int)(Math.random()*8)+1;
		private int random5 = (int)(Math.random()*8)+1;
		private int random6 = (int)(Math.random()*5)+1;
		
		
	private String dname;
	private int happy =random1;
	private int stress = random2;
	private int health=random3;
	private int full =random4;
	private int cleanliness = random5;
	private String user_name;
	private int bravery= random6;
	
	
	
	public DogSabiltyVO(){}
	
	public DogSabiltyVO(String dname){
		this.dname =dname;
	}
	
	public String toString() {
		System.out.println();
		System.out.print("                                                   이름:"+ dname);
		System.out.print(","+" 행복지수:"+happy);
		System.out.print(","+" 스트레스:"+stress);
		System.out.print(","+" 건강지수:"+health);
		System.out.print(","+" 포만감:"+full);
		System.out.print(","+" 청결지수:"+cleanliness);
		System.out.println(","+"용감지수:"+bravery);
		System.out.println("\n \n \n");
		
		return null;
	}
	
}
