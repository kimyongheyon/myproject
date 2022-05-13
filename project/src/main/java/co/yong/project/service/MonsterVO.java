package co.yong.project.service;

import lombok.Data;

@Data
public class MonsterVO {

	private int monster_num; 
	private String monster_name;
	private int monster_bravery;
	private long monster_drop_money;
	
	
	
	
	public String toString() {
		System.out.print(monster_name+", ");
		System.out.print("전투력: "+monster_bravery);
        System.out.println(" ,현상금: "+monster_drop_money);		
		
		
		return null;
	}




	public MonsterVO(int monster_num) {
		super();
		this.monster_num = monster_num;
	}




	public MonsterVO() {
		super();
	}
	
	
}
