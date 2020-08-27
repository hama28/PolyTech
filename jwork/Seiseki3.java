public class Seiseki3 {
    String name;
    int kokugo;
    int eigo;
    int sugaku;
    int goukei;
    int ave;


    public void Seiseki3(String name, int kokugo, int eigo, int sugaku) {
        this.name = name;
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
        System.out.printf("%.5s    %d  %d  %d  %d  %d  %n",name,kokugo,eigo,sugaku,goukei,ave);
    }
}