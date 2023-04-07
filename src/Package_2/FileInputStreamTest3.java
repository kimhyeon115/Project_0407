package Package_2;

import java.io.IOException;
import java.nio.Buffer;
import java.io.FileInputStream;

public class FileInputStreamTest3 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		int i = 0;
		try {
			fis = new FileInputStream("./Data/indata.txt");
			byte[] bs = new byte[10];						//버퍼
			
			while((i = fis.read(bs)) != -1) {
				for(byte b : bs) {
					System.out.print((char)b);
				}
				System.out.println();
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
