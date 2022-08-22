package javabook12;

import java.util.Objects;

public class Member implements Comparable<Member> {
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(memberId);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Member other = (Member) obj;
//		return memberId == other.memberId;
//	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return memberName + "회원님의 아이디는" + memberId +"입니다.";
	}
	
	
	@Override
	public int compareTo(Member o) {
		// TODO Auto-generated method stub
		return (this.memberName.compareTo(o.memberName))*-1;
	}
	
	
	
}
