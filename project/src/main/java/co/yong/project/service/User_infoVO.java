package co.yong.project.service;

import lombok.Data;

@Data
public class User_infoVO {

	String user_name;
	long user_money;
	
	public User_infoVO() {}
	
	
	public User_infoVO(String user_name) {
		super();
		this.user_name = user_name;
	}
	
	
	
	
	
	public String  toString() {
		
		System.out.println("돈: "+user_money);
		
		return null;
	}


	public User_infoVO(long user_money) {
		super();
		this.user_money = user_money;
	}



	
}