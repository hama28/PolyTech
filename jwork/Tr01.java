public class Tr01 {
    public static void main(String[] args) {
        int kokugo;
        int eigo;
        int sugaku;
        int sum;
        int ave;

        kokugo = PConsole.inputIntNum();
        eigo = PConsole.inputIntNum();
        sugaku = PConsole.inputIntNum();
        
        sum = kokugo;
        sum += eigo;
        sum += sugaku; 
        ave = sum / 3;

        System.out.println("���v�_��" + sum + "�_�ł��B");
        System.out.println("���ϓ_��" + ave + "�_�ł��B");
    }
}