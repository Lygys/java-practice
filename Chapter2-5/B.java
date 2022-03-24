public class A {

  public String hello() {
    return "Hello A!";
  }
  
  public static void main(String[] args) {
	  A b = new A(){
		  // クラスAのhelloメソッドをオーバーライドします。
		  @Override
		  public String hello() {
		    // "Hello B!"を返します。
		    return "Hello B!";
		  } 
	  };
	  System.out.println(b.hello());
  }
}
