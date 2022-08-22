package classpart;

public class TestGoods {

	public static void main(String[] args) {
		Goods gd = new Goods();
		
		gd.setCode(123);
		gd.setName("삼성카메라");
		gd.setSoldNum(10);
		gd.setStockNum(3);
		
		Goods gd2 = new Goods();
		gd2.setCode(456);
		gd2.setName("아이패드");
		gd2.setSoldNum(5);
		gd2.setStockNum(2);

		System.out.println(gd.getName()+gd.getCode()+" 팔린개수 : "+gd.getSoldNum()+" 재고개수 : "+gd.getStockNum());
		System.out.println(gd2.getName()+gd2.getCode()+" 팔린개수 : "+gd2.getSoldNum()+" 재고개수 : "+gd2.getStockNum());
	}

}
