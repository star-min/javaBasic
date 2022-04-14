package sec1;

public class AnimalEx1 {

	public static void main(String[] args) {
		
		Animal rebit = new Animal("토끼");
		rebit.running(rebit.getName());
		Animal rebit1 = new Animal("토끼");
		rebit.setSpeed(70);
		rebit.running(rebit.getName(),rebit.getSpeed());
		
	}

}
