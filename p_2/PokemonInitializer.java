package p_2;

public class PokemonInitializer {
    // ポケモンクラス

    // メンバ変数の宣言（今回はポケモンが持つ値）
    String monster_name;// もんスタの名前
    String nickname;// ニックネーム
    int hp;// 体力
    int attack;// 攻撃力
    int defence;// 防御力
    // とくこうとかもあるけどだるいので一回パス

    // コンストラクタ（クラスのメンバ変数を初期化して，変数化する）の宣言
    PokemonInitializer(String monster_name, String nickname, int hp, int attack, int defence) {
        // 「this」は「そのクラス自体」を指す
        // this.monster_name は7行目で宣言した、クラスが持つメンバ変数である
        // 一方でmonster_nameは、15行目で「貰った」変数
        this.monster_name = monster_name;
        this.nickname = nickname;
        this.hp = hp;
        this.attack = attack;
        this.defence = defence;
    }

    public static void main(String[] args) {
        // java p_2.PokemonConstracter するとこの箇所が実行される
        // pokemon をコンストラクタを使って作成（インスタンス化）
        // クラス名 インスタンス名 = new クラス名（引数）
        PokemonInitializer pokemon = new PokemonInitializer("ピカチュウ", "ピカちゃん", 100, 50, 10);// 15行目のmonster_name ~
                                                                                           // defenceに対応
        // pokemon はインスタンス
        // ピカチュウはmonster_nameに当たる 100はhpにあたる

        // インスタンス名.メンバ変数で、メンバ変数を参照可能
        System.out.println(pokemon.monster_name);

    }

}
