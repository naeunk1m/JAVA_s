package classpart;

public class TestGoods {

	public static void main(String[] args) {
		Goods gd = new Goods();
		
		gd.setCode(123);
		gd.setName("�Ｚī�޶�");
		gd.setSoldNum(10);
		gd.setStockNum(3);
		
		Goods gd2 = new Goods();
		gd2.setCode(456);
		gd2.setName("�����е�");
		gd2.setSoldNum(5);
		gd2.setStockNum(2);

		System.out.println(gd.getName()+gd.getCode()+" �ȸ����� : "+gd.getSoldNum()+" ����� : "+gd.getStockNum());
		System.out.println(gd2.getName()+gd2.getCode()+" �ȸ����� : "+gd2.getSoldNum()+" ����� : "+gd2.getStockNum());
	}

}
