public class Tr36_2 {
    public static void main(String[] args) {
        Seiseki h = new Seiseki();
        h.name = PConsole.inputString();
        int k = PConsole.inputIntNum();
        int e = PConsole.inputIntNum();
        int s = PConsole.inputIntNum();
        h.set(k, e, s);
        h.getGoukei();
        h.getHeikin();

        Seiseki l = new Seiseki();
        l.name = PConsole.inputString();
        int k2 = PConsole.inputIntNum();
        int e2 = PConsole.inputIntNum();
        int s2 = PConsole.inputIntNum();
        l.set(k2, e2, s2);
        l.getGoukei();
        l.getHeikin();

        System.out.println("---------------------------");
        System.out.println("–¼‘O     ‘ ‰p ” ‡Œv •½‹Ï");
        System.out.println("---------------------------");
        h.printAll();
        l.printAll();
        System.out.println("---------------------------");
    }
}

class Seiseki {
    String name;
    int kokugo;
    int eigo;
    int sugaku;
    int goukei;
    int ave;
    
    public void set(int kokugo, int eigo, int sugaku) {
        this.kokugo = kokugo;
        this.eigo = eigo;
        this.sugaku = sugaku;
    }

    public int getGoukei() {
        this.goukei = this.kokugo + this.eigo + this.sugaku;
        return goukei;
    }

    public double getHeikin() {
        this.ave = this.goukei / 3;
        return ave;
    }

    public void printAll() {
        System.out.printf("%s %d %d %d %d %d %n",name,kokugo,eigo,sugaku,goukei,ave);
    }
}