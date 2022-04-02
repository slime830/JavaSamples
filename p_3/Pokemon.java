package p_3;

// クラスの依存関係
// クラスには「親」と「子」という関係がある
// 親クラス１つに対して、複数の子がいる
// 一方、子クラス１つに対しては、親は一人だけである
// 子クラスは、親クラスが持つメンバ変数・メソッドを使用できる（継承という）
// 親クラスは、子クラスが持つメンバ変数・メソッドを使用できない

// extends MonsterはMonsterクラスの子クラスであることを表す 
public class Pokemon extends Monster {
    String nickname;

    // コンストラクタ
    Pokemon(String monster_name, int hp, int attack, int defence) {
        // superは親クラスを指す
        // 今回は親クラスのコンストラクタを表している
        super(monster_name, hp, attack, defence);
        this.nickname = monster_name;// 親クラスの変数/メソッドは、宣言しなくても使用可能
    }

    Pokemon(String monster_name, String nickname, int hp, int attack, int defence) {
        super(monster_name, hp, attack, defence);
        this.nickname = nickname;
    }

    Pokemon(String monster_name) {
        super(monster_name);
        this.nickname = monster_name;
    }

    Pokemon(String monster_name, String nickname) {
        super(monster_name);
        this.nickname = nickname;
    }

    // ゲッター セッター

    void setNickname(String nickname) {
        this.nickname = nickname;
    }

    String getNickname() {
        return this.nickname;
    }

    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("ピカチュー");

        // getMonsterNameはMonsterクラスで定義されているが、継承しているため使用可能
        System.out.println(pikachu.getMonsterName());
    }

}
