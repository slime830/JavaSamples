package p_3;

public class Slime extends DragonquestMonster {
    //
    Slime() {
        super("スライム");
    }

    void skill() {
        System.out.println(getMonsterName() + "はスラ・ストライクを放った！");
    }

    public static void main(String[] args) {
        Slime surarin = new Slime();
        surarin.skill();
    }
}
