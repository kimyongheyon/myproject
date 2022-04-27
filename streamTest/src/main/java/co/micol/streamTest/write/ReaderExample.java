package co.micol.streamTest.write;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample {

	
	
	public void run() {
		try {
			Reader reader = new FileReader("c:\\Temp\\test1.txt");
			
			while (true) {
				int data = reader.read();
				if(data == -1 ) break;
				System.out.println((char)data);  //형변환 방법 (type)멤버변수
					
			}
			reader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
