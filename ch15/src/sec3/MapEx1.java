package sec3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
//Map<Key, value>
public class MapEx1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>(); //키에 의해 접근이 가능함
		map.put("김준호", 100);
		map.put("김태균", 90);
		map.put("김효민", 95);
		map.put("김예은", 80);
		map.put("김성민", 90);
		System.out.println("저장된 데이터 건수 : "+map.size());
		System.out.println("김예은의 점수 : "+map.get("김예은"));
		System.out.println("김준호의 점수 : "+map.get("김준호"));
		map.remove("김효민");	//해당 데이터 제거
		//------------------- key와 value의 분리 --------------
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterater = keySet.iterator();
		while(keyIterater.hasNext()) {
			String key = keyIterater.next();  //키
			Integer value = map.get(key);	//값
			System.out.println("key : "+key+", value : "+value);
		}
	}
}