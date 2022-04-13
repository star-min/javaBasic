package Confirm;

public class ShopService {	//싱글톤
	private static ShopService shopservice = new ShopService();
	private ShopService() { }
	static ShopService getInstance() {
		return shopservice;
	}
}