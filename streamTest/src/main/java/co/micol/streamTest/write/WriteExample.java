package co.micol.streamTest.write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	// 1.멤버변수 정의
	
	// 2.생성자 정의
	
	// 3.멤버 메소드
	
	public void run() {    //메소드를 쓰는 법을 외우기
		try {
			OutputStream os = new FileOutputStream("c:\\Temp\\test1.txt");
			byte[] array = {'a', 'b', 'c'};
			os.write(array);
			os.flush();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
