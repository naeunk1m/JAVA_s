package javabook6;

public class CarFactory {

		private static CarFactory instance = new CarFactory();
		
		private CarFactory() {}
		
		public static CarFactory getInstance() {
			
			return instance;
		}
		
		Car createCar() {
			return new Car();
		}

	}

