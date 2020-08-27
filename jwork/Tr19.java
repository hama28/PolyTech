public class Tr19 {
    public static void main(String[] args) {
        System.out.print("ŒÂ”‚ð“ü—Í‚µ‚Ä‰º‚³‚¢B");
        int count = PConsole.inputIntNum();
        System.out.print("‰¿Ši‚ð“ü—Í‚µ‚Ä‰º‚³‚¢B");
        int price = PConsole.inputIntNum();

        if (count >= 100 || price >= 50000) {
            System.out.println(count * price * 0.9);
        } else {
            System.out.println(count * price);
        }
    }
}