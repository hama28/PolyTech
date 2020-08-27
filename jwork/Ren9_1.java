public class Ren9_1 {
    String name;
    int hp;
    int mp;

    public Ren9_1(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    public Ren9_1(String name, int hp) {
        this(name, hp, 5);
    }

    public Ren9_1(String name) {
        this(name, 40);
    }
}