package sec1;
import java.awt.Toolkit;

class BeepTask implements Runnable {
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		String[] names= {"이순신","파가니니","모짜르트","김성민","베토벤","길가메시"};
		for(int i=0;i<10;i++) {
			System.out.println(names[i]);
			if(names[i].equals("김성민")) {
				System.out.println("**** 주인공 발견 ****");
				toolkit.beep();
				continue;
			} else {
				System.out.println("정상적 위인");
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadEx2 {
	public static void main(String[] args) {
		BeepTask bp = new BeepTask();
		bp.run();
	}
}