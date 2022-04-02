package p_3;

//抽象（アブストラクト）クラス
// 抽象クラスは一つ以上の未実装のメソッド（抽象メソッドという）を持つクラス

// abstractは抽象を表す
// 今回はextendsを付けてるが、なくてもよい
abstract public class DragonquestMonster extends Monster {
    DragonquestMonster(String monster_name) {
        super(monster_name);
    }

    abstract void skill();// 抽象メソッド
    // 抽象メソッドは、そのメソッドが「存在することだけ」を宣言するイメージ
}
