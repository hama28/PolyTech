public abstract class TimeCount {

    public abstract void time();

    public void timecount() {
        // �����O�̎������擾
        long startTime = System.nanoTime();

        // ���Ԍv��������������
        time();

        // ������̎������擾
        long endTime = System.nanoTime();

        System.out.println("�J�n�����F" + startTime + " �i�m�b");
        System.out.println("�I�������F" + endTime + " �i�m�b");
        System.out.println("�������ԁF" + ((endTime - startTime) / 1000) + " �}�C�N���b");
    }
}