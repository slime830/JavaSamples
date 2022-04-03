package p_5;

import java.util.HashMap;

public class HashMapExample {
    // HashMap(Map)
    // 配列やListは全て、添え字（左から何番目か）を基にデータ参照していた
    // HashMapはそれとは異なり、任意の参照型変数を「キー」として
    // キーを与えると値（バリュー）が得られるような、データ型

    public static void main(String[] args) {
        // HashMapの宣言
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        // 文字列を与えると、整数型のデータが返ってくる

        // データの追加
        map.put("slime", 100);
        map.put("pikachu", 50);

        // データの参照
        for (String key : map.keySet()) {
            // keySet()で、全てのキーを参照できる（ただし、Set（集合）型、詳しくはググってください）
            // 今回は{"slime","pikachu"} みたいなイメージ
            System.out.print(key);
            System.out.print("\t");
            System.out.println(map.get(key));// get(キー)で、キーに当たる値を参照可
        }

        // データの削除
        map.remove("slime");
    }

}
