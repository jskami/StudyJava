package arraylist;

public class OverridingTest3 {

	public static void main(String[] args) {
		// 클래스형에 기반하여 지불 금액 계산하기 257p
		int price = 10000;
		
		// customer 인스턴스 생성
		Customer ctLee = new Customer(1001, "이씨");
		System.out.println(ctLee.getctName() + " 님이 지불해야 할 금액은 " + ctLee.calcPrice(price) + "원 입니다.");
		
		System.out.println("=========================");
		
		// vipcustomer 인스턴스 생성
		VIPCustomer ctPark = new VIPCustomer(1002, "박씨", 001);
		System.out.println(ctPark.getctName() + " 님이 지불해야 할 금액은 " + ctPark.calcPrice(price) + "원 입니다.");
		
		System.out.println("=========================");
		
		// vipcustomer 인스턴스를 customer형으로 변환
		Customer ctJam = new VIPCustomer(1003, "잠만보", 002);
		System.out.println(ctJam.getctName() + " 님이 지불해야 할 금액은 " + ctJam.calcPrice(price) + "원 입니다.");
		// 가상메서드 방식에 의해 vip고객 인스턴스 메서드가 호출되었다.
		
		
		
	}

}
