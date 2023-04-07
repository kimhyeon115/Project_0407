package Package_1;

import java.util.Scanner;

public class sungJukMain {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("이름 입력>");
		String name = scn.nextLine();
		System.out.println("이름 입력>");
		int kor = scn.nextInt();
		System.out.println("이름 입력>");
		int eng = scn.nextInt();
		System.out.println("이름 입력>");
		int mat = scn.nextInt();
		
		sungJuk sj = new sungJuk(name,kor,eng,mat);
		sj.sungJukInfo();
		scn.close();
	}
}
