package classpart;

public class Car {
	
//	Car() {
//		System.out.println("Car 생성자");
//		} // 생성자

//	Car(String number, String owner, String kind, int year){
//		this.number = number;
//		this.owner = owner;
//		this.kind = kind;
//		this.year = year;
//		
//	}
	
// Source - Generate Constructor Using Fields - Generate  자동생성 !
	String number;
	public Car(String number, String owner, String kind, int year) {
	super(); //이후 상속 부분에서 배울 예정
	this.number = number;
	this.owner = owner;
	this.kind = kind;
	this.year = year;
}



	String owner;
	String kind;
	int year;
	
	// 자동으로 디폴트 생성자를 만듦

	public String getNumber() {
		return number;
	}



	public void setNumber(String number) {
		this.number = number;
	}



	public String getOwner() {
		return owner;
	}



	public void setOwner(String owner) {
		this.owner = owner;
	}



	public String getKind() {
		return kind;
	}



	public void setKind(String kind) {
		this.kind = kind;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}




}
