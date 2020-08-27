public class Tr50 {
    public static void main(String[] args) {
        // 元のクラスのチェック
        Seiseki3 one = new Seiseki3();
        one.name = "yamada";
        one.kokugo = 10;
        one.eigo = 10;
        one.sugaku = 10;
        one.getGoukei();
        one.getHeikin();
        one.printAll();

        // 新しいクラスのチェック
        Seiseki5 two = new Seiseki5();
        two.name = "tanaka";
        two.kokugo = 25;
        two.eigo = 24;
        two.sugaku = 23;
        two.rika = 22;
        two.syakai = 21;
        two.getGoukei();
        two.getHeikin();
        two.printAll();

        // 継承のチェック
        Seiseki5 san = new Seiseki5("sato",31,32,33,34,35);
        san.getGoukei();
        san.getHeikin();
        san.printAll();

    }
}