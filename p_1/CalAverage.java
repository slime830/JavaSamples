package p_1;

public class CalAverage {
    public static void main(String[] args) {
        // 配列の平均値・最大値・最小値を求める基本プログラム（クラス名CalAverageだけど）
        int[] intArray = { 32, 45, 32, 34, 67, 89, 77, 99, 9, 56 };
        // 今回はこのintArrayについて，プログラムを使って平均値等を求める

        // 平均値の求め方
        int sum = 0;// 配列の整数の合計を計算する用の変数を用意する
        for (int num : intArray) {// for文で配列の整数を全て回して
            sum += num;// sumにnumを足していく
        }
        // 合計を要素数で割れば平均
        // javaの仕様上，int/intの計算結果はintで帰ってしまう（5/2=2など）
        // なので，片方を一次的にdoubleに変換する（キャスト変換する）ことで，この問題を解消する
        double average = (double) sum / intArray.length;
        System.out.println("average");
        System.out.println(average);

        //最大値
        int max=intArray[0];//最大値の為の変数 とりあえず最初を最大値としておく
        for(int num:intArray){
            if(num>max){//もしnumが現状のmaxよりも大きかったら
                max=num;//maxの値をnumと同じにする
            }
        }
        System.out.println("max");
        System.out.println(max);

        //同様に最小値
        int min=intArray[0];
        for(int num:intArray){
            if(num<min){
                min=num;
            }
        }
        System.out.println("min");
        System.out.println(min);

    }
}
