package arraylist;

public class OverridingTest2 {

	public static void main(String[] args) {
		// 클래스 형 변환과 재정의 메서드 호출 253p
		Customer vc  = new VIPCustomer(9292, "잠만보", 2000);
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getctName() + " 님이 지불해야 할 금액" + vc.calcPrice(10000) + "입니다.");
	}
	

}
