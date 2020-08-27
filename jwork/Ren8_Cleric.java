import java.util.Random;

public class Ren8_Cleric {
    String name;
    int hp = 50;
    final int max_hp = 50;
    int mp = 10;
    final int max_mp = 10;


    public void selfAid() {
        this.mp -= 5;
        System.out.println(this.name + "はセルフエイドを使った");
        this.hp = this.max_hp;
        System.out.println("HPが全快した");
    }

    public int pray(int time) {
        System.out.println(this.name + "は" + time + "秒間休憩した");

        int recover = new Random().nextInt(3) + time;
        int recovered = Math.min(this.max_mp - this.mp, recover);

        this.mp += recovered;
        System.out.println("MPが" + recovered + "回復した");
        return recovered;
    }
}