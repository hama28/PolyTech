import java.util.*;

public class GameSystem {
    // �Q���Җ����L�^
    String name;

    // �K���|���p�̔z���p��
    ArrayList<Integer> ball = new ArrayList<Integer>();

    // �r���S�J�[�h�p�̔z���p��
    ArrayList<Integer> B = new ArrayList<Integer>();
    ArrayList<Integer> I = new ArrayList<Integer>();
    ArrayList<Integer> N = new ArrayList<Integer>();
    ArrayList<Integer> G = new ArrayList<Integer>();
    ArrayList<Integer> O = new ArrayList<Integer>();

    // �r���S�������`�F�b�N����p�̒l
    // ���̒l��1�ɂȂ�΃r���S�������������Ƃ�\��
    int check = 0;

    public void ballset() {
        // 1~75�̃{�[��������
        for (int i = 1; i < 76; i++) {
            ball.add(i);
        }
    }

    public void bingomahine() {
        if (check == 0) {
            // ball�z��̑����ȉ��̃����_���Ȓl�𐶐�
            int set = (int)(Math.random() * ball.size());
            // ball�z���set�Ԗڂ̒l��binNo�ɑ��
            int binNo = ball.get(set);
            // �l�̕\��
            System.out.println("������ " + binNo + " �ł�");
            // ball�z�񂩂�set�Ԗڂ̒l���폜
            ball.remove(set);
            
            // �q�b�g���Ă���΁A�Y���̒l��0�ɕύX
            for (int i = 0; i < 5; i++) {
                if (B.get(i) == binNo ) {
                    B.set(i, 0);
                    System.out.println("�q�b�g�I");
                } else if (I.get(i) == binNo) {
                    I.set(i, 0);
                    System.out.println("�q�b�g�I");
                } else if (N.get(i) == binNo) {
                    N.set(i, 0);
                    System.out.println("�q�b�g�I");
                } else if (G.get(i) == binNo) {
                    G.set(i, 0);
                    System.out.println("�q�b�g�I");
                } else {
                    if (O.get(i) == binNo) {
                        O.set(i, 0);
                        System.out.println("�q�b�g�I");
                    }
                }
            }
        } else {
            System.out.println("�r���S�I�I�I");
        }
    }

    public void bingocard() {
        ArrayList<Integer> num = new ArrayList<Integer>();
        for (int i = 1; i < 76; i++) {
            num.add(i);
        }
    
        for (int i = 0; i < 75; i++) {
            int set = (int)(Math.random() * num.size());
            int binNo = num.get(set);
    
            // �z��ɓ���Ă���
            if (binNo < 16) {
                if (B.size() < 5) {
                    B.add(binNo);
                }
            } else if (binNo < 31) {
                if (I.size() < 5) {
                    I.add(binNo);
                }
            } else if (binNo < 46) {
                if (N.size() < 5) {
                    // ������0������
                    if (N.size() == 2) {N.add(0);}
                    N.add(binNo);
                }
            } else if (binNo < 61) {
                if (G.size() < 5) {
                    G.add(binNo);
                }
            } else {
                if (O.size() < 5) {
                    if (binNo < 76) {
                        O.add(binNo);
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

    public void bingocardshow() {
        // �r���S�J�[�h��\������
        System.out.println(name + "����̃r���S�J�[�h");
        System.out.println("-------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println("| " + B.get(i) + " | " + I.get(i) + " | " + N.get(i) +
                            " | " + G.get(i) + " | " + O.get(i) + " |");
            System.out.println("-------------------------");
        }
    }

    public void bingocheck() {
        // �r���S���Ă��邩�`�F�b�N����
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



    public void gamestart() {
        System.out.println("�Q�[�����J�n���܂�");
        System.out.print("���O����͂��Ă��������F");
        name = PConsole.inputString();
        bingocardshow();
        System.out.println("�G���^�[�L�[���������тɃQ�[�����i�s���܂�");
        Scanner scanner = new Scanner(System.in);
        String readString = scanner.nextLine();
        while(readString!=null) {
            bingomahine();
            bingocardshow();
            bingocheck();

            if (scanner.hasNextLine()) {
                readString = scanner.nextLine();
            } else {
                readString = null;
            }

            if(check == 1) {
                System.out.println("�r���S�I�I�I");
                break;
            }
        }
    }
}