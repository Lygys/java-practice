package practice;
import java.util.HashMap;
import java.util.Map;

public class Chapter2_3_2 {

    public static void main(String[] args) {
    	Map<Integer, String> map1 = new HashMap<Integer, String>();
    	
    	// 要素を追加する
    	
    	map1.put(0, "ぶどう");
    	map1.put(3, "もも");

    	// 登録済みのキーで追加すると上書きされる
    	map1.put(0, "マスカット");

    	// 要素を取得する
    	System.out.println(map1.get(0)); // マスカットを返す
    	System.out.println(map1.get(1)); // nullを返す
    	System.out.println(map1.size()); // 2を返す
    	// キーを指定して要素を削除する
    	map1.remove(0);
    	map1.remove(1); // 何もしない

    	// キーと値を指定して要素を削除する
    	map1.remove(3, "もも");
    	map1.remove(3, "なし"); // 何もしない   
    	System.out.println(map1.size()); // 0を返す
    }
}