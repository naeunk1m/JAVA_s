package threadex;

public class ThreadEx3 {

	public static void main(String[] args) {
		Thread t1 = new Thread(()-> {
				for(int i=0; i<10; i++) {
					System.out.println("GO !");
					try {
						Thread.sleep(500);
					} catch(InterruptedException e) {
						e.printStackTrace();
					}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<10; i++) {
					System.out.println("COME !");
					try {
						Thread.sleep(500);
					} catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		});
		t1.start();
		t2.start();
		
	}

}

class MyRunnable implements Runnable {
	@Override
	public void run() {
		
	}
}

class MyRunnnable2 implements Runnable {
	@Override
	public void run() {
		
	}
}