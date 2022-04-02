package p_2;

public class ConstantAndStatic {
    // finalは変数につけることができ、「定数」を表す
    // 定数は、値を変化させることができない
    final int FINALVALUE = 10;
    // staticは「静的」を表す
    // staticは変数やメソッドの宣言に付けることができる
    // 従来のメンバ変数（メソッド）は「インスタンス名.メンバ変数（メソッド）名」で参照できるのに対し
    // 静的変数は、「クラス名.変数名」で参照できる
    static String s = "hello world";

    // final と static は共存可能

    final static int STATICFINALVALUE = 100;

    ConstantAndStatic() {
        // 特に処理は無い
    }

    public static void main(String[] args) {

        // staticはクラス名.変数名
        System.out.println(ConstantAndStatic.s);
        System.out.println(ConstantAndStatic.STATICFINALVALUE);

        // finalだけはインスタンス化する
        ConstantAndStatic example = new ConstantAndStatic();
        System.out.println(example.FINALVALUE);
        // ↓のようなコードはエラー（FINALVALUEは定数なので変更不可）
        // example.FINALVALUE = 100;

    }
}
