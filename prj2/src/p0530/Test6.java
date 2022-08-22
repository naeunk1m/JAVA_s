package p0530;

public class Test6 {
	//scope

	public static void main(String[] args) {
		// 1~10을 더한 결과는 
		int sum = 0; //반드시 초기값을 0으로
		int i;
		for( i=1; i<=10; i++) { // (i+""+sum) 선언의 위치를 달리해줘야 함. 
			sum=sum+i;
		}
		System.out.println(i+" "+sum);   // (i+""+sum) 선언의 위치를 달리해줘야 함.
		
		// i = 1, sum = sum + i = 0+1 = 1
		// i = 2, sum = sum + i = (0+1)+2 = 3
		// i = 3, sum = sum + i = (0+1+2)+3 = 6
		
		// i = 10, sum = sum + i = (0+1+2+...+9)+10
		
		int prod = 1;
		for(i=1; i<=10; i++) {
			prod=prod*i;
		}
		System.out.println(prod);
			
		
		
		
		
		
		for(i=1; i<=10; i++){
			if(i%2==0) {
				System.out.println(i +": hello");
				}
		}
	}
}