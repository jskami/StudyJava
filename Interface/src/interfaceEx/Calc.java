package interfaceEx;

// 314p
public interface Calc {
	// 인터페이스에서 선언한 변수는 컴파일 과정에서 상수로 변환됨
	double PI = 3.14;
	int Error = -999999999;
	
	// 인터페이스에서 선언한 메서드는 컴파일 과정에서 추상메서드로 변환됨
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	// 인터페이스에서 디폴트 메서드 구현하기 : 메서드 자료형 앞에 default 예약어 작성
	default void description() {
		System.out.println("정수 계산기를 구현합니다.(디폴트 메서드, 인터페이스에서 만들었지만 인터페이스를 구현한 클래스가 있는 경우 디폴트 메서드는 클래스에서 사용된다.)");
	}
	
}
