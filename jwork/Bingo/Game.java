import java.util.*;

public class Game {
    public static void main(String[] args) {

        System.out.println("�Q�[���̏������s���܂�");
        System.out.print("���l�ŗV�т܂����H");
        int count = PConsole.inputIntNum();
        BingoCard man[] = new BingoCard[count];
        for (int i = 0; i < count; i++) {
            man[i] = new BingoCard();
        }
        // �Q���l�����̖��O�̓���
        for (int i = 0; i < count; i++){
            System.out.print((i + 1) + "�l�ڂ̖��O����͂��Ă��������F");
            String name = PConsole.inputString();
            man[i].name = name;
        }
        // �Q���l�����̃r���S�J�[�h���쐬���ĕ\��
        for (int i = 0; i < count; i++) {
            man[i].bingocard();
            man[i].bingocardshow();
            System.out.println("");
        }

        // �K���|���̗p��
        GameSystem gara = new GameSystem();
        gara.ballset();

        System.out.println("�Q�[�����J�n���܂�");
        System.out.println("�G���^�[�L�[���������тɃQ�[�����i�s���܂�");
        Scanner scanner = new Scanner(System.in);
        String readString = scanner.nextLine();
        while(readString!=null) {
            gara.bingomahine();
            System.out.println("");
            for (int i = 0; i < count; i++) {
                man[i].hitcheck();
                man[i].bingocheck();
                man[i].bingocardshow();
                System.out.println("");
            }

            if (scanner.hasNextLine()) {
                readString = scanner.nextLine();
            } else {
                readString = null;
            }

            if(BingoCard.check == 1) {
                break;
            }
        }
    }
}