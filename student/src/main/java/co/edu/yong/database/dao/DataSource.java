package co.edu.yong.database.dao;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataSource {

	// 싱글툰 클래스에 대표적인 패턴!!
    private static DataSource dataSource =new DataSource(); // 자기 자신을 인스턴스하고

	private DataSource() {}; // 자신을 외부에서 생성하지 못하도록 생성자를 만들고


	
	private  Connection conn; //db랑 연결하는 거
	private  String driver;
	private  String url; 
	private String user ; 
	private  String password ;
	
	public static DataSource getInstance() { //나에 인스턴스를 던저준다.
		                                    //static을 쓰면 공유영역 ,  class를 쓰면 참조영역
		return dataSource;
	}
			
			
	public  Connection getConnection() {
		dbconfiguration();
		try {
			Class.forName(driver); //dbms에서 사용할 driver(자바에서 제공함)
			conn= DriverManager.getConnection(url, user, password);
			System.out.println("DB연결 성공");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("DB 연결실패");
		}

		return conn;
	}
	private void dbconfiguration() {
		Properties properties = new Properties();
		String resource = getClass().getResource("/db.properties").getPath();
		
		try {
		properties.load(new FileReader(resource));
		driver = properties.getProperty("driver");
		url = properties.getProperty("url");
		user = properties.getProperty("user");
		password = properties.getProperty("password");
		
	}catch(IOException e) {
		e.printStackTrace();
	}
	}
}
