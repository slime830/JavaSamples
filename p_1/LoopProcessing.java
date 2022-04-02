package p_1;

public class LoopProcessing {
    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // ループ処理はfor文とwhile文とdo-while文がある
        // for文の構成
        /*
         * for(初期化式 ; 継続条件式 ; 再初期化式){
         * 処理
         * }
         */
        for (int i = 0; i < intArray.length; i++) {
            // ループ用の変数iを宣言して，
            // iがintArrayの長さ（今回は10）よりも小さい間まで継続し，
            // ループが回るたびにi+1する（+1と++は厳密には違うけど，とりあえず同じだと思っていてよい）
            System.out.println(intArray[i]);
        }

        // for文では，このような表現もできる

        System.out.println("----------");

        for (int num : intArray) {
            // intArrayから値を取って，その変数をnumとする
            // ループが一つ回ったら，次の要素を取ってくる
            // 配列以外にも，ArrayListやSetでも使える
            // ArrayList等は後半で説明する
            System.out.println(num);
        }

        // while 文
        /*
         * while(継続条件式){
         * 処理
         * }
         */
        System.out.println("----------");

        int i = 0;
        while (i < intArray.length) {
            System.out.println(intArray[i]);
            i = i + 1;// この文が無いと無限ループになる
        }

        // do-while文
        /*
         * do{
         * 処理
         * }while(継続条件式);
         */

        System.out.println("----------");
        i = 0;
        do {
            System.out.println(intArray[i]);
            i = i + 1;
        } while (i < intArray.length);

        // do-whileはとりあえず一回処理を実行するが，whileはそうではない
        System.out.println("----------");
        while (1 == intArray[9]) {// intArray[9]は10（ありえない条件式）
            System.out.println("from while statement");
        }

        do {
            System.out.println("from do-while statement");
        } while (1 == intArray[9]);

        // break と continue
        // breakはループ処理自体を中断する
        // continueはループの処理をスキップする

        // breakはループ処理自体を中断するので1のみ標準出力される
        System.out.println("----------");

        for (int num : intArray) {
            if (num % 2 == 0) {
                break;
            }
            System.out.println(num);
        }

        // continueはスキップするので偶数の時はプリントされない
        System.out.println("----------");

        for (int num : intArray) {
            if (num % 2 == 0) {
                continue;
            }
            System.out.println(num);
        }
    }
}
