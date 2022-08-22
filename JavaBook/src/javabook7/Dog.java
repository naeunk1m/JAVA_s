package javabook7;

public class Dog {
	private String name;
	private String type;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	private Dog() {
		super();
		// TODO Auto-generated constructor stub
	}


	Dog(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}


	public String showDogInfo() {
		return name +","+type;
	}
	
	

}
