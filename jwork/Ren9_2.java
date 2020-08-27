public class Ren9_2 {
    public static void heal(int hp) {
        hp += 10;
    }
    public static void heal(Ren9_1 ren9_1) {
        ren9_1.hp += 10;
    }
    public static void main(String[] args) {
        int baseHp = 25;
        Ren9_1 t = new Ren9_1("ハンゾー", baseHp);
        System.out.println(baseHp + "：" + t.hp);
        heal(baseHp);
        heal(t);
        System.out.println(baseHp + "：" + t.hp);
    }
}