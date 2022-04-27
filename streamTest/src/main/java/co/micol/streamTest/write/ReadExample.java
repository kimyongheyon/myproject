package co.micol.streamTest.write;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {

	public void run() {
		try {
			InputStream is = new FileInputStream("c:\\Temp\\test1.txt");
			byte[] buffer = new byte[100];
			while (true) {
				int data = is.read(buffer);
				if (data == -1) break;
				for (int i=0; i< data ; i++) {
					System.out.println(buffer[i]);
				}

			}
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
