package javabook5;

public class MyData {
	private int day;
	private int month;
	private int year;
	
	public MyData(int i, int j, int k) {
		// TODO Auto-generated constructor stub
	}
	

	public void setDay(int day) { 
	if(getMonth() ==2) {
		if(day<1 || day>28) {
			System.out.println("오류입니다.");
		}else {
			this.day = day;
		}
	}

}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}

