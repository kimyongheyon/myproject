package co.edu.yong.database.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class StudentVO { //보호객체   Dto  멤버변수와 getter, setter로만 이루어진 것

	private String student_id;
	private String name;
	private Date birthday;
	private String major;
	private String address;
	private String tel;
	
	
	
	
	@Override
		public String toString() {
		System.out.print(student_id + " : ");
		System.out.print(name + " : ");
		System.out.print(birthday + " : ");
		System.out.print(major + " : ");
		System.out.print(address + " : ");
		System.out.println(tel + " : ");
			return  null;
		}
	
}
