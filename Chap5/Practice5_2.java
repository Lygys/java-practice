public class Practice5_2 {
    public static void main(String[] args) {
    	String title = "お誘い";
    	String address = "uso800@xxx.com";
    	String text = "今度飲みにでも行きませんか？";
    	email(title, address, text);
    	email(address, text);
    }
    public static void email(String title, String address, String text) {
    	System.out.println(address + "に、以下のメールを送信しました");
    	System.out.println("件名: " + title);
    	System.out.println("本文: " + text);
    }
    public static void email(String address, String text) {
    	System.out.println(address + "に、以下のメールを送信しました");
    	System.out.println("件名: 無題");
    	System.out.println("本文: " + text);
    }    
}