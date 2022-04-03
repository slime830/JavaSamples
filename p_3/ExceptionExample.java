package p_3;

public class ExceptionExample {
    // 以下のようなコードを書くとエラーが起きる（0除算は数学的にご法度）
    // int num = 10/0;

    // このように、プログラム中には成功するかわからない（エラーが起きるかもしれない）箇所がある
    // そこで、想定されるエラーを予め処理し、想定内のエラーが起きても、エラー処理を行えるようにする
    // Javaでは、これを例外処理という

    // 例外処理の基本構文
    // 例外処理では、例外を出すことを「例外を投げる」という
    // 一方、投げられた例外を処理することを「例外をキャッチする」という

    // ExceptionTypeは例外の種類。
    // 例えばArrayIndexOutOfBoundsException（配列の存在しない添え字を参照）などがある

    // try{
    // エラー（例外）が起きそうな処理
    // }catch(ExceptionType_1 e1){
    // ExceptionType1 をキャッチした時の例外処理
    // }
    // ・
    // ・
    // ・
    // }catch(ExceptionType_n en){
    // 例外処理
    // }finally{
    // 例外処理を行った際に、共通で行う処理
    // }

    public static void main(String[] args) {
        int[] intArray1 = { 10, 4, 0, 5, 2 };
        int[] intArray2 = { 2, 5, 0, 0, 3 };

        // 例えば、0除算を行う可能性がある場合、以下のようなコードを記述する
        // ex intArray1の各要素から、intArray2の各要素を除算し、新たな配列 ansArrayを作成する

        double[] ansArray = new double[intArray1.length];

        try {
            for (int i = 0; i < intArray1.length; i++) {
                try {
                    ansArray[i] = (double) intArray1[i] / intArray2[i];
                } catch (ArithmeticException arithmeticException) { // ArithmeticExceptionは、計算での例外を携わっている例外クラス
                    ansArray[i] = 0;
                }
            }
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            indexOutOfBoundsException.printStackTrace();// 例外の内容を標準出力するメソッド
        }

        for (double num : ansArray) {
            System.out.print(num);
            System.out.print("\t");
        }

    }

}
