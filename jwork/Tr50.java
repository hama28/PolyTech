public class Tr50 {
    public static void main(String[] args) {
        // ���̃N���X�̃`�F�b�N
        Seiseki3 one = new Seiseki3();
        one.name = "yamada";
        one.kokugo = 10;
        one.eigo = 10;
        one.sugaku = 10;
        one.getGoukei();
        one.getHeikin();
        one.printAll();

        // �V�����N���X�̃`�F�b�N
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

        // �p���̃`�F�b�N
        Seiseki5 san = new Seiseki5("sato",31,32,33,34,35);
        san.getGoukei();
        san.getHeikin();
        san.printAll();

    }
}