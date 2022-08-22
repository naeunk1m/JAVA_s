package classpart;

public class TC {

	void add(int su1, int su2){ 
		int su3 = su1 + su2;
		System.out.println(su1+"+"+su2+"="+su3);
	}
	void sub(int su1, int su2){
		int su3 = su1 - su2;
		System.out.println(su1+"-"+su2+"="+su3);
	}
	int mul(int su1, int su2){
		int su3 = su1 * su2;
		System.out.println(su1+"*"+su2+"="+su3);
		return su3;		
	}
	int div(int su1, int su2){
		int su3 = su1 / su2;
		System.out.println(su1+"/"+su2+"="+su3);
		return su3;
	}
	
}
 
