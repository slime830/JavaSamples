package p_3;

//抽象（アブストラクト）クラス
// 抽象クラスは一つ以上の未実装のメソッド（抽象メソッドという）を持つクラス

// abstractは抽象を表す
// 今回はextendsを付けてるが、なくてもよい
abstract public class DragonquestMonster extends Monster {
    private int ex;
    private int dropGold;

    DragonquestMonster(String monster_name,int ex,int dropGold) {
        super(monster_name);
        this.ex = ex;
        this.dropGold = dropGold;
    }

    DragonquestMonster(String monster_name){
        this(monster_name,100,10);
    }

    void setEx(int ex){
        this.ex = ex;
    }

    void setDropGold(int dropGold){
        this.dropGold = dropGold;
    }

    int getEx(){
        return this.ex;
    }

    int getDropGold(){
        return this.dropGold;
    }

    abstract void skill();// 抽象メソッド
    // 抽象メソッドは、そのメソッドが「存在することだけ」を宣言するイメージ
}
