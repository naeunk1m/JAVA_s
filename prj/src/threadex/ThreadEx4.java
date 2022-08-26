package threadex;

public class ThreadEx4 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=100;i<=110;i++) {
					System.out.println(Thread.currentThread().getName()+ " : "+i);
					try {
						Thread.sleep(500);
					} catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		t1.start();
		try{
			t1.join();
		} catch (Exception e) {}
		
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+ " : "+i);
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
