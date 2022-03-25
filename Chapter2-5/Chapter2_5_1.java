public class Chapter2_5_1 {

	public class BImpl implements B {

	    @Override
	    public String hello() {
	        return "Hello B!";
	    }

	}
  
  public static void main(String[] args) {
	  B b = new BImpl();
	  System.out.println(b.hello());
  }
}
