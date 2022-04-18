package sec3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("김성민", 100);
		map.put("홍길동", 80);
		map.put("김유신", 700);
		map.put("이순신", 60);
		map.put("게르망", 10);
		map.put("박뿔테",70);
		System.out.println("저장된 데이터 건수 : "+map.size());
		System.out.println("김성민의 점수 : "+map.get("김성민"));
		System.out.println("게르망의 점수 : "+map.get("게르망"));
		map.remove("이순신");
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterater = keySet.iterator();
		while(keyIterater.hasNext()) {
			String key = keyIterater.next();
			Integer value = map.get(key);
			System.out.println("key : "+key+", value : "+value);
		}
	}

}
