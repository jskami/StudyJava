package abstractEx;

public class ComputerTest {
	public static void main(String[] args) {
//		Computer c1 = new Computer();
		Computer c2 = new DeskTop();
//		Computer c3 = new NoteBook();
		Computer c4 = new MyNoteBook();
		// 추상클래스는 인스턴스를 만들 수 없다.
		// 추상클래스는 형변환을 사용할 수는 있다.
	}
}
