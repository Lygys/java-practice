package practice;
public class Static01 {
    public static void main(String[] args) {
    	Hero.money = 100;
    	System.out.println(Hero.money);   	
    	Hero h1 = new Hero("ミナト");
    	Hero h2 = new Hero("アカネ");
    	Hero.money = 500;
    	System.out.println(Hero.money);
    	System.out.println(h1.money);
    	System.out.println(h2.money);
    	Hero.money += 500;
    	System.out.println(Hero.money);
    	System.out.println(h1.money);
    	System.out.println(h2.money);    	
    }
}