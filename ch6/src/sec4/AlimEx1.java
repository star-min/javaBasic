package sec4;

import java.lang.reflect.Method;

public class AlimEx1 {

	public static void main(String[] args) {

		Method[] declaredMethods = Service.class.getDeclaredMethods();
		for(Method method : declaredMethods) {
			System.out.println(method.getName());
		}

	}

}
