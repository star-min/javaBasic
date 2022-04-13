package Confirm;
public class ShopServiceEx {
	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		ShopService obj3 = ShopService.getInstance();
		if(obj1 == obj2 && obj1 == obj3) {
			System.out.println("같은 ShopService 객체입니다.");
		} else {
			System.out.println("다른 ShopService 객체입니다.");
		}
	}
}