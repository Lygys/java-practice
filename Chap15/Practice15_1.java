public class Practice15_1 {
    public static void main(String[] args) {
    	StringBuilder sb = new StringBuilder();
    	for (int = 0; i < 100; i++) {
    		sb.append(i+1).append(",");
    	}
    	String s = sb.toString();
    	String[] array = s.split(",");
    }    
}