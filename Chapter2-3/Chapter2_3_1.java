package practice;
import java.util.ArrayList;
import java.util.List;

public class Chapter2_3_1 {

    public static void main(String[] args) {
    	List<String> list1 = new ArrayList<String>();
    	list1.add("りんご");
    	list1.add("みかん");
    	//位置を指定して要素を追加する
    	list1.add(1, "バナナ");
    	//要素を取得する
    	System.out.println(list1.get(0));

    	//存在チェック (trueを返す)
    	System.out.println(list1.contains("バナナ"));

    	//存在チェック (falseを返す)
    	System.out.println(list1.contains("なし"));

    	System.out.println(list1.size()); // 3を返す
    	
    	// 要素を削除する (要素が文字列の場合、文字列として同じであれば削除されます)
    	list1.remove("バナナ");
    	list1.remove("なし"); // 何もしない

    	// 位置を指定して要素を削除する
    	list1.remove(0);
    	System.out.println(list1.size());
    	System.out.println(list1.contains("みかん"));
    }
}





