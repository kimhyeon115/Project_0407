package Package_2;

import java.io.IOException;
import java.io.FileInputStream;

public class FileInputStreamTest {
	public static void main(String[] args) {
		FileInputStream fis = null;
		int i = 0;
		try {
			fis = new FileInputStream("./Data/indata.txt");
			
			while((i = fis.read()) != -1) {
				System.out.printf("문자 %s ",(char)i);
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
