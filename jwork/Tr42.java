public class Tr42 {
    public static void main(String[] args) {
        //System.out.println("���l���A���͂��܂����H");
        //int x = PConsole.inputIntNum();
        //Seiseki h[] = new Seiseki[x];

        //ArrayList<Integer> hoge = new ArrayList<Integer>();

        Seiseki h[] = new Seiseki[100000];

        System.out.println("[���O,����̓_��,�p��̓_��,���w�̓_��]�̏��œ��͂��ĉ�����");

        for (int i = 0; i < h.length; i++) {
            System.out.print( (i+1) + "�l�ځF");
            String str = PConsole.inputString();
            String msg = "-q";
            if (str.equals(msg)) {
                break;
            }
            String[] list = str.split(",", 0);
            h[i] = new Seiseki(list[0],list[1],list[2],list[3]);
            h[i].getGoukei();
            h[i].getHeikin();
        }

        System.out.println("---------------------------");
        System.out.println("���O     �� �p �� ���v ����");
        System.out.println("---------------------------");
        
        for (int i = 0; i < h.length; i++) {
            if (h[i] != null) {
                h[i].printAll();
            }
        }

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

    public Seiseki(String name, String kokugo, String eigo, String sugaku) {
        this.name = name;
        this.kokugo = Integer.parseInt(kokugo);
        this.eigo = Integer.parseInt(eigo);
        this.sugaku = Integer.parseInt(sugaku);
    }
}
