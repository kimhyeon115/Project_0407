package Package_2;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileReader;

public class FileInputStreamTest2 {
	public static void main(String[] args) {
		FileReader fis = null;
		int i = 0;
		try {
			fis = new FileReader("./Data/indata.txt");
			
			while((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
		} catch(IOException e) {
			System.out.println(e);
		} finally {
			try {
				fis.close();
				System.out.println("off");
			} catch (IOException e) {
				System.out.println(e);
			}
		}
		System.out.println("end");
	}
}
