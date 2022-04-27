package co.micol.fileCopy.Eaxm;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class CopyExample {

	public void run() {
	   try {
		   char[] cha = new char[100];
		   
		Reader reader = new FileReader("c:\\temp\\source.txt");
		Writer writer = new FileWriter("c:\\temp\\Object");
		while (true) {
			
			int data = reader.read();
			if(data == -1) break;

			writer.append((char)data);
		}
		reader.close();
		writer.flush();
		writer.close();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	   	
	   		
	}
	
	
	
}
