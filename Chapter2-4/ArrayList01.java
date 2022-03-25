
import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

    public static void main(String[] args) {
    	List<String> items = new ArrayList<String>();
    	items.add("bag");
    	String item = items.get(0);
    	System.out.println(item);
    }
}