package javabook6;

public class Car {
	
	static int Carcount = 10000; //187
	int carID;
	public Car() {
		Carcount++;
		carID = Carcount;
		
	}
	
	int getCarNum() {
		return carID;
	}
}
