package Package_1;

public class CalcMain {

	public static void main(String[] args) {
//		Calc cc =  new Calc();
//		System.out.println(cc.add(9, 4));
//		System.out.printf("A + B = %d", cc.add(9, 4));
		
		CalcMain cm = new CalcMain();
		System.out.println(cm.add(9, 4));
		System.out.printf("A + B = %d", cm.add(9, 4));
	}
	public int add(int a, int b) {
		return a + b;
	}
}
