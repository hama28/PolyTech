public class TimeLooop extends TimeCount {
    // 処理させたい内容
    public void time() {
        for (int i = 0; i < 10000; i++) {
            int num = (int)(Math.random() * 9999);
            System.out.println(num);
        }
    }

}