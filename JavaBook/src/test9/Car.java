package test9;

public abstract class Car {
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnoff();
	public void washcar() {
		System.out.println("������ �մϴ�.");
	}
	
	public void run() {
		start();
		drive();
		stop();
		turnoff();
		washcar();
	}
}

