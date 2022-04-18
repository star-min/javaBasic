package sec1;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx1 {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<>();
		deque.addFirst("kim");
		deque.addFirst("lee");
		deque.addLast("park");
		deque.addLast("kang");
		deque.add("gill");
		System.out.println("데크의 값 출력 : "+deque);
		deque.offerLast("lim");
		deque.offerFirst("shin");
		System.out.println("데크의 사이즈 : "+deque.size());
		System.out.println("데크의 값 출력 : "+deque);
		deque.poll();
		System.out.println("데크의 값 출력 : "+deque);
		deque.pop();
		System.out.println("데크의 값 출력 : "+deque);
	}

}
