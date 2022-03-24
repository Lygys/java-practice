package practice;

import java.math.BigDecimal;

class Chapter2_4_2 {
    public static void main(String[] args) {
    	Basket<Apple> appleBasket = new Basket<>(new Apple("ふじ", new BigDecimal(200)));
    	Basket<Peach> peachBasket = new Basket<>(new Peach("黄金桃", new BigDecimal(300)));

    	appleBasket.printTotalPrice(); // 「ふじの入った籠は合計300円です」と出力
    	peachBasket.printTotalPrice(); // 「黄金桃の入った籠は合計400円です」と出力
    }
}