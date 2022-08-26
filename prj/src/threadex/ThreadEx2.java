package threadex;

public class ThreadEx2 {

	public static void main(String[] args) {
		
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		
		t1.setDaemon(true);
		t2.setDaemon(true);
		
		t1.start();
		t2.start();
		
		System.out.println("메인 종료");
	}

}

class MyThread1 extends Thread {
	
//	MyThread1(){
//		this.setDaemon(true);
//	}
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("GO !");
			try {
				Thread.sleep(500);
				System.out.println(i);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread2 extends Thread {
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("COME !");
			try {
				Thread.sleep(500);
				System.out.println(i);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
