package javabook11;

public class StudentEx {
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof StudentEx) {
			StudentEx std = (StudentEx)obj;
			if(this.studentId == std.studentId)
			return true;
			else return false;
		}
	return false;
	}
		int studentId;
		String studentName;
		
		public StudentEx(int studentId, String studentName) {
			this.studentId = studentId;
			this.studentName = studentName;
		}
		
		public String toString() {
			return studentId +"," +studentName;
		}
		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return studentId;
		}
	}



