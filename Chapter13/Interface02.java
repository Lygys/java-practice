package extend;

import extend.phone.MobilePhone;

public class Interface02 {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("000-1111-2222");
        // Phoneインターフェースのデフォルトメソッドの呼び出し
        mobilePhone.powerOff();
    }
}