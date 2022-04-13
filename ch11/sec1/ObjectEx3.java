package sec1;
import java.util.HashMap;
//Student.name = "김기태";	name:key, "김기태":value 
class Key {
	public int number;
	public String value;
	Key(int number){ this.number = number; }
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number) { return true;	}
		}
		return false;
	}
	@Override
	public int hashCode() {		return number;	}
	@Override
	public String toString() {	return number+" : "+value;	}
}
public class ObjectEx3 {
	public static void main(String[] args) {
		HashMap<Key, String> hash1 = new HashMap<>(); //키, 값
		hash1.put(new Key(200), "김기태");
		
		String value = hash1.get(new Key(200));
		System.out.println(value);
		
		Key k = new Key(100);
		k.value = "조수민";
		System.out.println(k.toString());
	}
}