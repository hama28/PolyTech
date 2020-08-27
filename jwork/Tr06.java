public class Tr06 {
    public static void main(String[] args) {
        int time;
        System.out.println("D‚«‚È•b”‚ğ“ü—Í‚µ‚Ä‰º‚³‚¢B›ŠÔ›•ª›•b‚É•ÏŠ·‚µ‚Ü‚·Bj");
        time = PConsole.inputIntNum();
        int h = time / 3600;
        int m = (time - h * 3600) / 60;
        int s = time - (h * 3600) - (m * 60);
        
        System.out.println(h + "ŠÔ" + m + "•ª" + s + "•b");
    }
}