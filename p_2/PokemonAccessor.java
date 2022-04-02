package p_2;

public class PokemonAccessor {

    // メンバ変数の宣言にアクセス修飾子をつける
    // アクセス修飾子とは、そのメンバ変数やメンバメソッドをどこから参照できるか決めるもの
    // private そのクラス内部からしか参照できない
    // protected そのクラス内部と、サブクラス内部からも参照できる
    // なし 同一パッケージからなら参照できる
    // public どこからでも参照できる

    private String monster_name;// もんスタの名前
    private String nickname;// ニックネーム
    private int hp;// 体力
    private int attack;// 攻撃力
    private int defence;// 防御力

    // アクセス修飾子で、アクセスを制限すると、ゲッターメソッドとセッターメソッドというのを定義する必要がある
    // 例えばprivateの場合、pokemon.monster_name = "ヒトカゲ";のように出来ないため

    PokemonAccessor(String monster_name, String nickname, int hp, int attack, int defence) {
        this.monster_name = monster_name;
        this.nickname = nickname;
        this.hp = hp;
        this.attack = attack;
        this.defence = defence;
    }

    // アクセス修飾子で、アクセスを制限すると、ゲッターメソッドとセッターメソッドというのを定義する必要がある
    // 例えばprivateの場合、pokemon.monster_name = "ヒトカゲ";のように出来ないため

    // セッター
    // セッターは、メンバ変数の値を変更（セット）する
    void setMonsterName(String monster_name) {
        this.monster_name = monster_name;
    }

    void setNickname(String nickname) {
        this.nickname = nickname;
    }

    void setHp(int hp) {
        this.hp = hp;
    }

    void setAttack(int attack) {
        this.attack = attack;
    }

    void setDefence(int defence) {
        this.defence = defence;
    }

    // ゲッター
    // ゲッターは、メンバ変数の値を返り値として返す

    String getMonsterName() {
        return this.monster_name;
    }

    String getNickname() {
        return this.nickname;
    }

    int getHp() {
        return this.hp;
    }

    int getAttack() {
        return this.attack;
    }

    int getDefence() {
        return this.defence;
    }

    // ゲッターおわり

    int sumAttackAndDefence() {// 引数無し 返り値はint型
        return this.attack + this.defence; // attackとdefenceの合計（int型）を返す
    }

    void plusHp(int num) {// voidは返り値がないことを表す
        this.hp += num;
    }

    public static void main(String[] args) {
        PokemonAccessor pokemon = new PokemonAccessor("ピカチュウ", "ピカちゃん", 100, 50, 10);

        // 以下のコードはエラーがでる
        // System.out.println(pokemon.monster_name);

        // ゲッターの使用
        System.out.println(pokemon.getMonsterName());
        // セッターの使用
        pokemon.setMonsterName("ヒトカゲ");
        System.out.println(pokemon.getMonsterName());
    }

}
