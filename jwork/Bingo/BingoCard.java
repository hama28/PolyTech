import java.util.*;

public class BingoCard {
    // �Q���Җ����L�^
    String name;

    // �r���S�J�[�h�p�̔z���p��
    ArrayList<Integer> B = new ArrayList<Integer>();
    ArrayList<Integer> I = new ArrayList<Integer>();
    ArrayList<Integer> N = new ArrayList<Integer>();
    ArrayList<Integer> G = new ArrayList<Integer>();
    ArrayList<Integer> O = new ArrayList<Integer>();

    // �r���S�������`�F�b�N����p�̒l
    // ���̒l��1�ɂȂ�΃r���S�������������Ƃ�\��
    static int check = 0;

    // �r���S�J�[�h�𐶐�
    public void bingocard() {
        ArrayList<Integer> num = new ArrayList<Integer>();
        for (int i = 1; i < 76; i++) {
            num.add(i);
        }
    
        for (int i = 0; i < 75; i++) {
            int set = (int)(Math.random() * num.size());
            int carNo = num.get(set);
    
            // �z��ɓ���Ă���
            if (carNo < 16) {
                if (B.size() < 5) {
                    B.add(carNo);
                }
            } else if (carNo < 31) {
                if (I.size() < 5) {
                    I.add(carNo);
                }
            } else if (carNo < 46) {
                if (N.size() < 5) {
                    // ������0������
                    if (N.size() == 2) {N.add(0);}
                    N.add(carNo);
                }
            } else if (carNo < 61) {
                if (G.size() < 5) {
                    G.add(carNo);
                }
            } else {
                if (O.size() < 5) {
                    if (carNo < 76) {
                        O.add(carNo);
                    }
                }
            }
    
            num.remove(set);
    
            if(B.size() == 5 && I.size() == 5 && N.size() == 5 &&
            G.size() == 5 && O.size() == 5) {
                break;
            }
        }
    }

    // �r���S�J�[�h�̊m�F
    public void bingocardshow() {
        System.out.println(name + "����̃r���S�J�[�h");
        System.out.println("-------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println("| " + B.get(i) + " | " + I.get(i) + " | " + N.get(i) +
                            " | " + G.get(i) + " | " + O.get(i) + " |");
            System.out.println("-------------------------");
        }
    }

    // �q�b�g���Ă��邩�`�F�b�N
    public void hitcheck() {
        if (check == 0) {
            // �q�b�g���Ă���΁A�Y���̒l��0�ɕύX
            for (int i = 0; i < 5; i++) {
                if (B.get(i) == GameSystem.binNo ) {
                    B.set(i, 0);
                    System.out.println("�q�b�g�I");
                } else if (I.get(i) == GameSystem.binNo) {
                    I.set(i, 0);
                    System.out.println("�q�b�g�I");
                } else if (N.get(i) == GameSystem.binNo) {
                    N.set(i, 0);
                    System.out.println("�q�b�g�I");
                } else if (G.get(i) == GameSystem.binNo) {
                    G.set(i, 0);
                    System.out.println("�q�b�g�I");
                } else {
                    if (O.get(i) == GameSystem.binNo) {
                        O.set(i, 0);
                        System.out.println("�q�b�g�I");
                    }
                }
            }
        } else {
            System.out.println("�r���S�I�I�I");
        }
    }

    // �r���S���Ă��邩�`�F�b�N����
    public void bingocheck() {
        // �c����
        if (B.get(0) == 0 && B.get(1) == 0 && B.get(2) == 0 && B.get(3) == 0 && B.get(4) == 0) {
            check = 1;
        } else if (I.get(0) == 0 && I.get(1) == 0 && I.get(2) == 0 && I.get(3) == 0 && I.get(4) == 0) {
            check = 1;
        } else if (N.get(0) == 0 && N.get(1) == 0 && N.get(2) == 0 && N.get(3) == 0 && N.get(4) == 0) {
            check = 1;
        } else if (G.get(0) == 0 && G.get(1) == 0 && G.get(2) == 0 && G.get(3) == 0 && G.get(4) == 0) {
            check = 1;
        } else if (O.get(0) == 0 && O.get(1) == 0 && O.get(2) == 0 && O.get(3) == 0 && O.get(4) == 0) {
            check = 1;
        // ������
        } else if (B.get(0) == 0 && I.get(0) == 0 && N.get(0) == 0 && G.get(0) == 0 && O.get(0) == 0) {
            check = 1;
        } else if (B.get(1) == 0 && I.get(1) == 0 && N.get(1) == 0 && G.get(1) == 0 && O.get(1) == 0) {
            check = 1;
        } else if (B.get(2) == 0 && I.get(2) == 0 && N.get(2) == 0 && G.get(2) == 0 && O.get(2) == 0) {
            check = 1;
        } else if (B.get(3) == 0 && I.get(3) == 0 && N.get(3) == 0 && G.get(3) == 0 && O.get(3) == 0) {
            check = 1;
        } else if (B.get(4) == 0 && I.get(4) == 0 && N.get(4) == 0 && G.get(4) == 0 && O.get(4) == 0) {
            check = 1;
        // �΂ߕ���
        } else if (B.get(0) == 0 && I.get(1) == 0 && N.get(2) == 0 && G.get(3) == 0 && O.get(4) == 0) {
            check = 1;
        } else if (B.get(4) == 0 && I.get(3) == 0 && N.get(2) == 0 && G.get(1) == 0 && O.get(0) == 0) {
            check = 1;
        } else {
            
        }
    }

}