package sec1;

import java.util.Stack;
//LIFO 구조 -> Stack의 운영방법 , push(추가), pop(제거)
public class StackEx1 {
	public static void main(String[] args) {
		Stack<Integer> stack1 = new Stack<>();
		stack1.push(20);	//값 입력
		stack1.push(50);
		stack1.push(30);
		stack1.push(40);
		stack1.add(10);
		System.out.println("스택의 크기 : "+stack1.size());
		System.out.println("스택에서 값 찾기(스택에 20이 있는지 여부) : "+stack1.contains(20));
		System.out.println("스택에 비어 있는 저장소가 있는지 여부 : "+stack1.empty());
		System.out.println("스택의 가장 마지막(최상단) 값 출력 : "+stack1.peek());
		stack1.pop(); //가장 마지막에 입력한 값 제거됨
		System.out.println("맨 마지막의 값 제거 후 스택의 크기 : "+stack1.size());
		System.out.println("스택의 가장 마지막(최상단) 값 출력 : "+stack1.peek());
		stack1.clear();	//스택의 메모리를 모두 비우기
		System.out.println("모두 비운 후의 스택의 크기 : "+stack1.size());
	}
}