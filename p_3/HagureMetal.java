package p_3;

public class HagureMetal extends DragonquestMonster {
    HagureMetal() {
        super("はぐれメタル");
    }

    void skill() {
        System.out.println(getMonsterName() + "は逃げ出した!!");
    }

    public static void main(String[] args) {
        HagureMetal hagurin = new HagureMetal();
        hagurin.skill();
    }
}
