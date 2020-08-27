public class Tr38 {
    
    public static void main(String[] args) {
        String n = PConsole.inputString();
        int k = PConsole.inputIntNum();
        int e = PConsole.inputIntNum();
        int s = PConsole.inputIntNum();

        Seiseki h = new Seiseki(k,e,s);
        h.set(n);
        h.getGoukei();
        h.getHeikin();

        
        String n2 = PConsole.inputString();
        int k2 = PConsole.inputIntNum();
        int e2 = PConsole.inputIntNum();
        int s2 = PConsole.inputIntNum();
        
        Seiseki l = new Seiseki(k2,e2,s2);
        l.set(n2);
        l.getGoukei();
        l.getHeikin();

        System.out.println("-------------------------------");
        System.out.println("ñºëO     çë  âp  êî  çáåv  ïΩãœ");
        System.out.println("-------------------------------");
        h.printAll();
        l.printAll();
        System.out.println("-------------------------------");
    }
}

class Seiseki {
    String name;
    int kokugo;
    int eigo;
    int sugaku;
    int goukei;
    int ave;
    
    public void set(String name) {
        this.name = name;
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
        System.out.printf("%.5s    %d  %d  %d  %d  %d  %n",name,kokugo,eigo,sugaku,goukei,ave);
    }

    public Seiseki(int kokugo, int eigo, int sugaku) {
        this.kokugo = kokugo;
        this.eigo = eigo;
        this.sugaku = sugaku;
    }
}