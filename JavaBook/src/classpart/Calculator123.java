package classpart;

public class Calculator123 {
	int x=10;
	int y=5;
	
	void add(int x, int y){ 
		int z = x + y;
		System.out.println(x+"+"+y+"="+z);
	}
	void sub(int x, int y){ 
		int z = x - y;
		System.out.println(x+"-"+y+"="+z);
	}
	int mul(int x, int y){ 
		int z = x * y;
		System.out.println(x+"*"+y+"="+z);
		return z;
	}
	int div(int x, int y){ 
		int z = x / y;
		System.out.println(x+"/"+y+"="+z);
		return z;
	}
}
