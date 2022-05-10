package co.yong.project.service;

import lombok.Data;

@Data
public class InventoryVO {

	private int item_num;
	private String item_name;
	private String item_ability;
	private int item_count;
	
	public InventoryVO() {}
	
	
	public InventoryVO( String item_name, String item_ability, int item_count) {
		super();
		this.item_name = item_name;
		this.item_ability = item_ability;
		this.item_count = item_count;
	}
	
	public String toString () {
		System.out.print("이름: "+item_name+", ");
		System.out.print("능력: "+item_ability+", ");
		System.out.println("수량: "+item_count);
		
		
		return null;
	}
	
	
}
