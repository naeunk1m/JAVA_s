package classpart;

public class Car {
	
//	Car() {
//		System.out.println("Car ������");
//		} // ������

//	Car(String number, String owner, String kind, int year){
//		this.number = number;
//		this.owner = owner;
//		this.kind = kind;
//		this.year = year;
//		
//	}
	
// Source - Generate Constructor Using Fields - Generate  �ڵ����� !
	String number;
	public Car(String number, String owner, String kind, int year) {
	super(); //���� ��� �κп��� ��� ����
	this.number = number;
	this.owner = owner;
	this.kind = kind;
	this.year = year;
}



	String owner;
	String kind;
	int year;
	
	// �ڵ����� ����Ʈ �����ڸ� ����

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
