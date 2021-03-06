package arraylist;

// 고객 클래스 구현 234p
public class Customer {
	// 고객 멤버 변수
	protected int ctID;
	protected String ctName;
	protected String ctGrade;
	int bonusPoint;
	double bonusRatio;
	
	// 디폴트 생성자
//	public Customer() {
//		ctGrade = "Silver";
//		bonusRatio = 0.01;
//		System.out.println("Customer() 생성자호출");
//	}	// 아래에 고객정보 두 개를 함께 호출하는 메서드를 구현했기 때문에 주석처리 함
	
	public Customer() {		// ++++++++++++++++ 다형성을 위해 만든 고객등급, 보너스포인트, 적립률 지정 메서드 262p
		initCustomer();
	}
	
	// customer클래스에 새로운 생성자 추가하기 245p
	// 고객ID와 이름을 반드시 지정한다는 조건의 메서드
	public Customer(int ctID, String ctName) {
		this.ctID = ctID;
		this.ctName = ctName;
		ctGrade = "Silver";
		bonusRatio = 0.01;
		initCustomer();		// ++++++++++++++++ 위에서 만든 메서드 호출
//		System.out.println("Customer(int, String) 생성자 호출");
	}
	
	private void initCustomer() {	// ++++++++ 생성자에서만 호출하는 메서드이니까 private으로 선언
		ctGrade = "Silver";		// 멤버변수 초기화
		bonusRatio = 0.01;		// 멤버변수 초기화
	}
	
	
	// 보너스 포인트 적립, 지불 가격 계산 메서드
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return ctName + " 님의 등급은 " + ctGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
	
	// protected 멤버변수들의 get, set 메서드, 외부에서 사용하도록 함 
	public int getctID() {
		return ctID;
	}
	
	public void setctID(int ctID) {
		this.ctID = ctID;
	}
	
	public String getctName() {
		return ctName;
	}
	
	public void setctName(String ctName) {
		this.ctName = ctName;
	}
	
	public String getctGrade() {
		return ctGrade;
	}
	
	public void setctGrade(String ctGrade) {
		this.ctGrade = ctGrade;
	}

	
}
