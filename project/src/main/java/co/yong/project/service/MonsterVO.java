package co.yong.project.service;

import lombok.Data;

@Data
public class MonsterVO {

	private int monster_num; 
	private String monster_name;
	private int monster_bravery;
	private long monster_drop_money;
	
	
	
	
	public String toString() {
		System.out.println(monster_name);
        System.out.println(" ,현상금: "+monster_drop_money);		
		
		
		return null;
	}
	
	
}
