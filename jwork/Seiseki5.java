public class Seiseki5 extends Seiseki3 {
    int rika;
    int syakai;

    Seiseki5(String name, int kokugo, int eigo, int sugaku, int rika, int syakai) {
        super.name = name;
        super.kokugo = kokugo;
        super.eigo = eigo;
        super.sugaku = sugaku;
        this.rika = rika;
        this.syakai = syakai;
    }

    Seiseki5() {

    }

    public int getGoukei() {
        this.goukei = this.kokugo + this.eigo + this.sugaku + this.rika + this.syakai;
        return goukei;
    }

    public double getHeikin() {
        this.ave = this.goukei / 5;
        return ave;
    }

    public void printAll() {
        System.out.printf("%.5s    %d  %d  %d  %d  %d  %d  %d  %n",name,kokugo,eigo,sugaku,rika,syakai,goukei,ave);
    }
}