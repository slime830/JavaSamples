package p_5;

import java.util.*;//Listを使うときに必要

public class ListExample {
    // List
    // 今まで使ってきた配列は、「要素を削除」したり、「サイズを増やす」したりが非常にめんどくさい
    // 例えば、lengthがnの配列のm番目の値を削除する場合
    // 1. m+1 ~ n-1までの要素を全て１つ左にずらして
    // 2. 余った一番最後の要素をメモリ開放する
    // と言った処理が必要
    // 口でいうのは簡単だが、かなりだるい

    // そこでListが登場
    // Listなら、配列と非常に似た感覚でデータを扱え、加えて要素の削除や追加が非常に簡単にできる

    // Listには主にArrayListとLinkedListがある。これらは、どちらもListの子クラス
    // プログラム上での挙動は」特に変わらない。
    // ArrayListは値の参照は高速だが、要素の削除や追加は低速
    // LinkedListは値の参照は低速だが、要素の削除や追加は高速

    // ArrayList（LinkedListも同様）の宣言
    // ArrayList<中身のデータ型（参照型変数> 変数名 = new ArrayList<中身のデータ型（参照型変数>();
    // 以下、実際の例
    public static void main(String args[]) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        // LinkedList<Integer> linkedList = new LinkedList<Integer>();

        // Integerは、intの参照型バージョン
        // ちなみにdoubleの参照型バージョンはDouble
        // これらは、ただ参照型バージョンというだけでなく、便利なメンバメソッドも持っている

        // データの追加
        int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1 };
        for (int num : intArray) {
            arrayList.add(num);// addで、Listの最後に値を追加する（[1]->[1,2]->...->[1,2,3,4,5,6,7,8,9]みたいなイメージ）
        }

        // データの削除
        arrayList.remove(1);// removeで要素削除 指定した値が複数ある時は、一番左の要素を削除する（[1,2,3,4,5,6,7,8,9,1] ->
                            // [2,3,4,5,6,7,8,9,1]）

        // データの参照
        for (int i = 0; i < arrayList.size(); i++) {// size()で要素数が得られる
            System.out.println(arrayList.get(i));// get(添え字)で、i番目の要素が得られる
        }
    }

}
