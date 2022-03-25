
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;


public class Set_Map01 {

    public static void main(String[] args) {
    	Set<Integer> set = new LinkedHashSet<>();
    	set.add(1);
    	System.out.println(set.contains(1));
    	System.out.println(set.contains(3));
    	
    	Map<Integer, String> map = new HashMap<>();
    	map.put(1, "Taro");
    	map.put(2, "Hanako");
    	System.out.println(map.get(1));
    	System.out.println(map.get(2));
    }
}