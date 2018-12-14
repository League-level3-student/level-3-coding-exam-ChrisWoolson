import java.util.HashMap;
import java.util.Set;

public class HashMapCalculator {
public int commonKeyValuePairs(HashMap<String, String> h1, HashMap<String, String> h2) {
	
	HashMap<String, String> h12 = new HashMap<String, String>();
	HashMap<String, String> h22 = new HashMap<String, String>();
	int number= 0;
	
	
	
	for (String key1 : h1.keySet()) {
		for (String key2 : h2.keySet()) {
			
			if(key1.equals(key2)) {
				h12.put(key1, h1.get(key1));
				h22.put(key2, h2.get(key2));
			}
			
			
			
			
		}	
	}
		
	for (String value1 : h12.values()) {
		for (String value2 : h22.values()) {
			if(value1.equals(value2)){
				number++;
			}
		}
		
		
	}	
		
		
		
	
	
	
	
	
	
	
	return number;
	
}
}
