package p_1;

public class ArrayMemoryAllocation {
    public static void main(String[] args) {
        // 今まで配列は以下のように宣言時に初期化していた
        int[] intArray1 = { 1, 2, 3 };
        // しかし，このように初期化するのは稀
        // intArrayだけを宣言しておきたい

        int[] intArray2 = new int[3];// int3個分のメモリ（箱）を用意して，intArray2に配列として充てる
        System.out.println(intArray2);// メモリの場所が返ってくる
        for (int num : intArray2) {
            System.out.println(num);// 元は0
        }

        System.out.println("----------");
        // intArray2に値を代入する
        for (int i = 0; i < intArray2.length; i++) {
            intArray2[i] = i * i;
            System.out.println(intArray2[i]);// オール0ではなくなってる
        }

        System.out.println("----------");
        // ２重配列の場合も同様
        int[][] intSqueareArray = new int[9][9];
        for (int i = 0; i < intSqueareArray.length; i++) {
            for (int j = 0; j < intSqueareArray[i].length; j++) {
                intSqueareArray[i][j] = (i + 1) * (j + 1);
                System.out.print(intSqueareArray[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
