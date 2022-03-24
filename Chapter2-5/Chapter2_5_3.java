import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Chapter2_5_3 {
  
  public static void main(String[] args) {
	// 並び替え対象のリスト
	  List<String> animals = Arrays.asList("dog", "cat", "fox", "elephant");

	  Collections.sort(
	      animals,
	      new Comparator<String>() {
	        @Override
	        public int compare(String x, String y) {
	          // 数値が小さい順に並べる
	          return x.compareTo(y);
	        }
	      });

	  System.out.println(animals);
  }
}
