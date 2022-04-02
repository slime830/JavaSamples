package p_3;

public class Monster {
    // モンスタークラス（今までの内容）
    private String monster_name;
    private int hp;
    private int attack;
    private int defence;

    Monster(String name, int hp, int attack, int defence) {
        this.monster_name = name;
        this.hp = hp;
        this.attack = attack;
        this.defence = defence;
    }

    Monster(String name) {
        this(name, 100, 50, 10);
    }

    void setMonsterName(String name) {
        this.monster_name = name;
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

    String getMonsterName() {
        return this.monster_name;
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

}
