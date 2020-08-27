public class Tr02 {
    public static void main(String[] args) {
        int time;
        System.out.println("‚S`‚Q‚Q‚Ì”’l‚ğ“ü—Í‚µ‚Ä‰º‚³‚¢");
        time = PConsole.inputIntNum();
        if (time < 4 || time >22) {
            System.out.println("•s³‚È’l‚Å‚·");
        } else if (time < 10) {
            System.out.println("‚¨‚Í‚æ‚¤");
        } else if (time >= 19) {
            System.out.println("‚±‚ñ‚Î‚ñ‚Í");
        } else {
            System.out.println("‚±‚ñ‚É‚¿‚Í");
        }
    }
}