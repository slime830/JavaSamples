package p_5;

public class PrimitiveAndReference {
    // プリミティブ型とリファレンス型・値渡しと参照渡しの話
    // 後回しにしてきたんですが、そろそろ必要になってきたので
    // 以下、とりあえず呪文だと思うんですが、まずは読んでください（僕も字面だけで説明するのに自身がありません）

    // プリミティブ型 ⇒変数に、直接その値が入っている（int型やdouble型など）
    // 参照型 ⇒変数には実際の値が入っているわけではなく、「実際の値が入っている場所（メモリ）」が入っている（配列や各インスタンス）

    // 値渡し⇒メソッドにプリミティブ型の変数を引数として渡すこと。
    // 内部処理では変数の値を「コピーして」新しいメモリ領域に格納し、処理を行う
    // そのため、メソッド内で引数に変化を加えても、呼び出し下での変数値は変わらない

    // 参照渡し⇒メソッドに参照型の変素を引数として渡すこと。
    // メモリ情報を渡すため、メソッド内で扱う変数と呼び出し元の変数のメモリ領域は同一（コピーしていない）
    // そのため、メソッド内で引数に変更を加えると、呼び出し元出の変数値も変化する

    // つまりどういうことかというと…以下説明の為のソースコード
    static void exampleMethod(int num,int[] intArray){
        num = 100;
        intArray[1] = 0;
        //返り値は無し
    }

    public static void main(String[] args){
        int num;
        int[] intArray = new int[2];

        num = 10;
        for(int i=0;i<intArray.length;i++){
            intArray[i] = 10;
        }
        
        System.out.println("----------");
        System.out.println(num);//10
        for(int n:intArray){
            System.out.println(n);//ふたつとも10
        }

        PrimitiveAndReference.exampleMethod(num, intArray);//返り値はない　内部でnumとintArrayは変更された

        System.out.println("----------");
        System.out.println(num);//10
        for(int n:intArray){
            System.out.println(n);//ふたつとも10では失くなっている
        }

        // といったことがおこります
        // Primitive型は、int,float,double,boolくらいしかないと思っていていいです
        // Stringは参照型です
        // とりあえず、この挙動の違いだけ分かっていればいいと思います

    }

}
