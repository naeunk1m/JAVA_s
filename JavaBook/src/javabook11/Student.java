package javabook11;

import java.util.Objects;

public class Student {
	String name;
	String sn;
	
	Student(String name, String sn){
		this.name = name;
		this.sn = sn;
	}
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Student) {
//		Student s = (Student)obj;
//		if(this.name.equals(s.name)&& this.sn.equals(s.sn)) {
//			return true;
//		}
//		}
//		return false;
//	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, sn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && Objects.equals(sn, other.sn);
	}
}
