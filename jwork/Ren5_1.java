public class Ren5_1 {
    public static void main(String[] args) {
        introduceOneself();
    }

    public static void introduceOneself() {
        System.out.print("名前を");
        String name = PConsole.inputString();
        System.out.print("年齢を");
        int age = PConsole.inputIntNum();
        System.out.print("身長を");
        double height = PConsole.inputIntNum();
        System.out.print("干支を");
        String eto = PConsole.inputString();

        System.out.println("名前：" + name + "　年齢：" + age);
        System.out.println("身長：" + height + "　干支：" + eto);
    }
}