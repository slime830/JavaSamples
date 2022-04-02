package p_1;

public class PrintVariable {
    public static void main(String[] args) {
        int intNum = 0;// 整数型
        double doubleNum = 1.1;// 浮動点少数型
        float floatNum = 1.1f;// フロート型（doubleの方が高精度）
        char character = 'a';// 文字型 一文字
        String str = "test string";// 文字列型

        // System.out.println()でコマンドプロンプトへの出力（標準出力）

        System.out.println(intNum);
        System.out.println(doubleNum);
        System.out.println(floatNum);
        System.out.println(character);
        System.out.println(str);

        // System.out.print()でも標準出力可能 ただし改行はされない

        System.out.println("----------");

        System.out.print(intNum);
        System.out.print(doubleNum);
        System.out.print(floatNum);
        System.out.print(character);
        System.out.println(str);

        // 全ての変数は配列というものでまとめられる

        System.out.println("----------");

        int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };// {}で囲って,で区切る
        System.out.println(intArray[0]);// 最初の要素（今回は1)は，配列の0番目
        System.out.println(intArray.length);// 配列.lengthで要素数を返す

        // 配列の配列（２重配列）もできる
        System.out.println("----------");
        int[][] intSqueareArray = { { 1, 2 }, { 3, 4 } };
        System.out.println(intSqueareArray[0]);// 配列
        System.out.println(intSqueareArray[1][0]);// 整数値
    }
}
