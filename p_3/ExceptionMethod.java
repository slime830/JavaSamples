package p_3;

public class ExceptionMethod {
    // 例外のtry-catch は理解した
    // 次は例外を投げるメソッドの定義について
    // 先程のように、メソッド内の例外はメソッド内で処理しても良いが、メソッドの呼び出し先に投げることもできる

    // 整数割り算
    static double intDivision(int num1, int num2) throws ArithmeticException {// ArithmeticExceptionを投げることを表す
        if (num2 == 0) {
            throw new ArithmeticException();// 0除算の時に例外を投げる
        }
        return (double) num1 / num2;
    }

    public static void main(String[] args) {
        int[] intArray1 = { 10, 4, 0, 5, 2 };
        int[] intArray2 = { 2, 5, 0, 0, 3 };

        double[] ansArray = new double[intArray1.length];

        try {
            for (int i = 0; i < intArray1.length; i++) {
                try {
                    ansArray[i] = ExceptionMethod.intDivision(intArray1[i], intArray2[i]);// 例外を投げるメソッドはtry内で記述しなければならない
                } catch (ArithmeticException arithmeticException) {
                    ansArray[i] = 0;
                }
            }

        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            indexOutOfBoundsException.printStackTrace();
        }

    }
}
