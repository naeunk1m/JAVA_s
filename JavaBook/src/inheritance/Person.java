package inheritance;

public class Person { // Object ���̺귯���� �⺻������ extends �޾ƿ´�.
	String name;
	long sn;
	
	public Person () {
		System.out.println("Person������1");
	}
	
	public Person(String name, long sn) {
		super();
		this.name = name;
		this.sn = sn;
		System.out.println("Person������2");
	}
		
	public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public long getSn() {
			return sn;
		}

		public void setSn(long sn) {
			this.sn = sn;
		}
		void showInfo() {
			System.out.println();
		}
		

	}
	



