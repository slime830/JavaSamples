package p_2;

public class PokemonMethod {
    // ポケモンクラス

    // メンバ変数の宣言（今回はポケモンが持つ値）
    String monster_name;// もんスタの名前
    String nickname;// ニックネーム
    int hp;// 体力
    int attack;// 攻撃力
    int defence;// 防御力

    PokemonMethod(String monster_name, String nickname, int hp, int attack, int defence) {
        this.monster_name = monster_name;
        this.nickname = nickname;
        this.hp = hp;
        this.attack = attack;
        this.defence = defence;
    }

    // メンバメソッドを定義
    // 任意の処理を、「メソッド」として定義できる
    // 返り値型 メソッド名（データ型1 仮引数名, … ,データ型n 仮引数名n）{
    // 処理
    // }

    int sumAttackAndDefence() {// 引数無し 返り値はint型
        return this.attack + this.defence; // attackとdefenceの合計（int型）を返す
    }

    void plusHp(int num) {// voidは返り値がないことを表す
        this.hp += num;
    }

    public static void main(String[] args) {
        PokemonMethod pokemon = new PokemonMethod("ピカチュウ", "ピカちゃん", 100, 50, 10);

        // インスタンス名.メソッドで定義したメソッドを使用
        int sum = pokemon.sumAttackAndDefence();// 28でreturnされた値がsumに入る
        System.out.println(sum);

        System.out.println();
        System.out.println("before plusHp");
        System.out.println(pokemon.hp);
        pokemon.plusHp(10);// plusHpはvoidなので返り値はない
        System.out.println(pokemon.hp);

    }

}
