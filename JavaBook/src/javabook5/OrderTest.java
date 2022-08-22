package javabook5;

public class OrderTest {

	public static void main(String[] args) {
		Order order = new Order();
		
		order.setOrderid(2018031200);
		//201803120001
		order.setCustomerid("abc123");
		order.setOrderdate("2018년 3월 12일");
		order.setCustomername("홍길순");
		order.setProductnumber("PD0345-12");
		order.setAddress("서울시 영등포구 여의도동 20번지");
		
		System.out.println("주문번호: "+order.getOrderid());
		System.out.println("주문자 아이디: "+order.getCustomerid());
		System.out.println("주문일자: "+order.getOrderdate());
		System.out.println("주문자: "+order.getCustomername());
		System.out.println("상품 번호: "+order.getProductnumber());
		System.out.println("배송 주소: "+order.getAddress());
		
		
	}

}
