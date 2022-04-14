package sec1;

public class BreadEx1 {

	public static void main(String[] args) {
		// Å©·Î¾Æ»ó , ´ÜÆÏ»§
		Bread cream1 = new Bread("Å©¸²»§", "»ýÅ©¸²", 120, 1500, 10);
		Bread cream2 = new Bread("Å©¸²»§", "½´Å©¸²", 110, 1600);
		System.out.println(cream1.getName());
		
		Bread croissant1 = new Bread("Å©·Î¿Í»ó", "¹Ù»èÇÑ", 160, 2000, 3);
		Bread croissant2 = new Bread("Å©·Î¿Í»ó", "ÂËµæÇÑ", 170, 2000, 3);
		
		Bread Bean1 = new Bread("´ÜÆÏ»§","´ÜÆÏ", 150, 1700, 5);
		
	}

}
