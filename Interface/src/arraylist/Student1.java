package arraylist;

import java.util.ArrayList;

public class Student1 {
	// 배열 응용 Student 클래스 구현 227p
	// 학생 성적 출력 프로그램 구현
	// + Subject 클래스 / + Student1Test 클래스 

	// 멤버변수
	int stuID;
	String stuName;
	ArrayList<Subject> subjectList; // subject클래스는 참조 자료형이니까 ArrayList로 활용

	// 생성자
	public Student1(int stuID, String stuName) {
		this.stuID = stuID;
		this.stuName = stuName;
		subjectList = new ArrayList<Subject>();
	}

	// 수강하는 과목을 subjectList 배열에 추가하는 메서드
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}

	// 배열 요소 값 출력
	public void showStudentInfo() {
		int total = 0;
		for (Subject s : subjectList) {
			total += s.getScorePoint(); // 총점 더하기
			System.out.println("학생 " + stuName + "의 " + s.getName() + 
								" 과목 성적은 " + s.getScorePoint() + "입니다.");
		}
		System.out.println("학생 " + stuName + "의 총점은 " + total + "입니다.");
	}

}
