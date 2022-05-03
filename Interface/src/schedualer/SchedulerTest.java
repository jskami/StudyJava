package schedualer;

import java.io.IOException;

public class SchedulerTest {
	public static void main(String[] args) throws IOException {
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R : 한 명씩 차례로 할당");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P : 우선순위가 높은 고객 먼저 할당");
		System.out.println("A : 상담원 본인이 필요할 때 전화를 가져온다.");
		
		int ch = System.in.read();	// 문자를 입력받는 메서드를 사용하려면 IOException을 사용.
		Scheduler scheduler = null;
		
		
		// 입력값을 받아 일치하면 해당 클래스 생성
		if(ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		}
		else if(ch == 'L' || ch == 'l') {
			scheduler = new LeastJob();
		}
		else if(ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		}
		else if(ch == 'A' || ch == 'a') {
			scheduler = new AgentGetCall();
		}
		else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		
		// 어떤 정책인가와 상관없이 인터페이스에 선언한 메서드 호출
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
		
	}
}
