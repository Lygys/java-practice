public class Human01 {
    public String name; //メンバー変数
    public int age;  //メンバー変数

    //引数なしのコンストラクタ
    public Human01() {
        name = "山田";
        age = 20;
    }
    //引数2つのコンストラクタ
    public Human01(String name, int age) {
        this.name = name;
        this.age = age;
    }
}