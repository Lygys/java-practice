public class Practice17_3 {
    public static void main(String[] args) {
    	try {
	    	int i = Integer.parseInt("三");
	    	System.out.println(i);
    	} catch (NumberFormatException e) {
    		System.out.println("NumberFormatExceptio例外をcatchしました");
    	}
    }    
}