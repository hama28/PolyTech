import java.util.*;

public class GameSystem {
    // �K���|���p�̔z���p��
    ArrayList<Integer> ball = new ArrayList<Integer>();
    static int binNo;

    // 1~75�̃{�[��������
    public void ballset() {
        for (int i = 1; i < 76; i++) {
            ball.add(i);
        }
    }

    // �{�[����1�r�o
    public int bingomahine() {
        // ball�z��̑����ȉ��̃����_���Ȓl�𐶐�
        int set = (int)(Math.random() * ball.size());
        // ball�z���set�Ԗڂ̒l��binNo�ɑ��
        binNo = ball.get(set);
        // �l�̕\��
        System.out.println("������ " + binNo + " �ł�");
        // ball�z�񂩂�set�Ԗڂ̒l���폜
        ball.remove(set);
        return binNo;
    }

}