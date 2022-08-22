package abstractex;

public class AutoCar extends Car {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("차가 달린다.");
	}
	
	@Override
	public void refuel() {
		// TODO Auto-generated method stub
		System.out.println("휘발유를 주유합니다.");
	}
	
	public void load() {
		System.out.println("짐을 싣습니다.");
	}
}
