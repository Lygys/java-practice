public class Practice3_3 {
    public static void main(String[] args) {
    	int isHungry = 1;
    	String food = "餃子";
        System.out.println("こんにちは");
        if (isHungry == 0) {
        	System.out.println("お腹がいっぱいです");
        } else {
        	System.out.println("はらぺこです");
        	System.out.println(food + "を頂きます");
        }
        System.out.println("ごちそうさまでした");
    }
}