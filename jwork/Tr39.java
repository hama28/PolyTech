public class Tr39 {
        
    public static void main(String[] args) {
        String n = PConsole.inputString();
        int k = PConsole.inputIntNum();
        int e = PConsole.inputIntNum();
        int s = PConsole.inputIntNum();

        Seiseki h = new Seiseki(n,k,e,s);
        h.getGoukei();
        h.getHeikin();

        
        String n2 = PConsole.inputString();
        int k2 = PConsole.inputIntNum();
        int e2 = PConsole.inputIntNum();
        int s2 = PConsole.inputIntNum();
        
        Seiseki l = new Seiseki(n2,k2,e2,s2);
        l.getGoukei();
        l.getHeikin();

        // コンストラクタのテスト
        Seiseki o = new Seiseki(15,25,35);
        o.getGoukei();
        o.getHeikin();

        System.out.println("-------------------------------");
        System.out.println("名前     国  英  数  合計  平均");
        System.out.println("-------------------------------");
        h.printAll();
        l.printAll();
        o.printAll();
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

    public Seiseki(String name, int kokugo, int eigo, int sugaku) {
        this.name = name;
        this.kokugo = kokugo;
        this.eigo = eigo;
        this.sugaku = sugaku;
    }

    public Seiseki(int kokugo, int eigo, int sugaku) {
        this("nanashi", kokugo, eigo, sugaku);
    }

}