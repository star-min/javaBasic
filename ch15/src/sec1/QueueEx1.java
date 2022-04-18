package sec1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx1 {

	public static void main(String[] args) {
		Queue<Integer> que = new LinkedList<>();
		que.add(20);
		que.add(50);
		que.offer(30);
		que.offer(40);
	}

}
