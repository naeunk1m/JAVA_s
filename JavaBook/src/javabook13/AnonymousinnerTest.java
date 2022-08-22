package javabook13;

class Outer2{
	Runnable getRunnable(int i) {
		int num = 100;
		
		return new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
			System.out.println(i);
			System.out.println(num);
			}
		};
	}
	Runnable runner = new Runnable() {
		public void run() {
			System.out.println("Runnable이 구현된 익명 클래스 변수");
		}
	};
}
public class AnonymousinnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer2 out = new Outer2();
		Runnable runnerble = out.getRunnable(10);
		runnerble.run();
		out.runner.run();
	}

}
