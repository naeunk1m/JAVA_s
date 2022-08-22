package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		Student studentKim = new Student("Kim", 3000);
		
		Bus bus100 = new Bus (100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		
		Bus bus200 = new Bus (200);
		studentKim.takeBus(bus200);
		studentKim.showInfo();
		bus200.showInfo();
		
		Subway subwayGreen = new Subway("2호선");
		
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();
		subwayGreen.showInfo();
		
		Student studentEdward = new Student("Edward", 30000);
		Taxi taxi = new Taxi("카카오택시");
		studentEdward.takeTaxi(taxi);  //Edward가 택시를 탐
		studentEdward.showInfo(); 
		taxi.showInfo();
		
		

	}

}
