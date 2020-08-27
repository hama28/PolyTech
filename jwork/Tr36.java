public class Tr36 {
    public static void main(String[] args) {
        Seiseki h = new Seiseki();
        h.name = PConsole.inputString();
        h.kokugo = PConsole.inputIntNum();
        h.eigo = PConsole.inputIntNum();
        h.sugaku = PConsole.inputIntNum();

        h.goukei = h.seiseki(h.kokugo, h.eigo, h.sugaku);

        System.out.println("名前：" + h.name + "　合計点：" + h.goukei);
    }
}

class Seiseki {
    String name;
    int kokugo;
    int eigo;
    int sugaku;
    int goukei;
    
    public static int seiseki(int kokugo, int eigo, int sugaku) {
        int goukei = kokugo + eigo + sugaku;
        return goukei;
    }
}