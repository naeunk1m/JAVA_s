package p0530;

public class Test6 {
	//scope

	public static void main(String[] args) {
		// 1~10�� ���� ����� 
		int sum = 0; //�ݵ�� �ʱⰪ�� 0����
		int i;
		for( i=1; i<=10; i++) { // (i+""+sum) ������ ��ġ�� �޸������ ��. 
			sum=sum+i;
		}
		System.out.println(i+" "+sum);   // (i+""+sum) ������ ��ġ�� �޸������ ��.
		
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