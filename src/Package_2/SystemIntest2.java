package Package_2;

import java.io.IOException;

public class SystemIntest2 {

	public static void main(String[] args) {
		System.out.println("알파벳 여러개를 쓰고 엔터를 누르세요");
		int i = 0;
		try {
			while((i = System.in.read()) !='\n') {
				System.out.print((char)i + " ");
				System.out.print(i + " ");
			};
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
