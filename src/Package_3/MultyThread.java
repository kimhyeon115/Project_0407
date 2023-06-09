package Package_3;

public class MultyThread {

	public static void main(String[] args) {
		ThreadEx threadex = new ThreadEx();
		ThreadEx threadex2 = new ThreadEx();
		Thread thread1 = new Thread(threadex,"A");
		Thread thread2 = new Thread(threadex2,"B");
		thread1.start();
		thread2.start();
		Thread.currentThread().getName();
	}
}
class ThreadEx implements Runnable {
	int TestNum = 0;
	@Override
	public void run() {				// *synchronized 하나가 끝나야 실행됨
		for(int i=0; i<10; i++) {
			if(Thread.currentThread().getName().equals("A")) {
				System.out.println("=================");
				TestNum++;
			}
			System.out.println("ThreadName = " + Thread.currentThread().getName() + "TestNum = " + TestNum);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}