package javabook4;

public class ForTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =1 ;i<=2;i++) {
			System.out.print("i="+i+" j=");
			for(int j=1;j<=3;j++) {
				System.out.print(j);
				if(j>2) break;
				System.out.print(",");
			}
		System.out.println();
		}
			
		}

}

	
	

