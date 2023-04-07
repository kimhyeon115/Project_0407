package Package_1;

public class sungJuk {
	private String sName;
	private int sKor;
	private int sEng;
	private int sMat;
	
	public sungJuk(String name, int kor, int eng, int mat) {
		super();
		sName = name;
		sKor = kor;
		sEng = eng;
		sMat = mat;
	}
	
	public void sungJukInfo() {
		int sum = sKor + sEng + sMat;
		int avg = sum / 3;
		int pp = avg / 10;
		char pg;
		
		switch(pp) {
			case 10: pg = 'A'; break;
			case 9: pg = 'A'; break;
			case 8: pg = 'B'; break;
			case 7: pg = 'C'; break;			
			case 6: pg = 'D'; break;
			default: pg = 'F';
		}
		System.out.println("학생이름 : " + sName);
		System.out.println("국어점수 : " + sKor);
		System.out.println("영어점수 : " + sEng);
		System.out.println("수학점수 : " + sMat);
		System.out.println("합계점수 : " + sum);
		System.out.println("평균점수 : " + avg);
		System.out.println("학기평점 : " + pg);
	}
}
