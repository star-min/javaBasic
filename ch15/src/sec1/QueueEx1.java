package sec1;

import java.util.LinkedList;
import java.util.Queue;
//FIFO 구조 : Queue(가장 처음 값이 가장 처음 출력되거나 제거됨) - offer(값추가), poll(값제거)
public class QueueEx1 {
	public static void main(String[] args) {
		Queue<Integer> que = new LinkedList<>();
		que.add(20); //값 추가
		que.add(50);
		que.offer(30);
		que.offer(40);
		System.out.println("가장 처음에 입력된 값 : "+que.peek());
		System.out.println("큐의 사이즈 : "+que.size());
		que.remove();	//가장 처음의 값 제거
		System.out.println("값 제거 후 큐의 사이즈1 : "+que.size());
		System.out.println("가장 처음에 입력된 값 : "+que.peek());
		que.poll();
		System.out.println("값 제거 후 큐의 사이즈2 : "+que.size());
		que.clear();
		System.out.println("모든 값 제거 후 큐의 사이즈3 : "+que.size());
		
	}
}