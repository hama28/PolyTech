import java.util.Random;

public class Ren8_Cleric {
    String name;
    int hp = 50;
    final int max_hp = 50;
    int mp = 10;
    final int max_mp = 10;


    public void selfAid() {
        this.mp -= 5;
        System.out.println(this.name + "�̓Z���t�G�C�h���g����");
        this.hp = this.max_hp;
        System.out.println("HP���S������");
    }

    public int pray(int time) {
        System.out.println(this.name + "��" + time + "�b�ԋx�e����");

        int recover = new Random().nextInt(3) + time;
        int recovered = Math.min(this.max_mp - this.mp, recover);

        this.mp += recovered;
        System.out.println("MP��" + recovered + "�񕜂���");
        return recovered;
    }
}