public class Ren5_4 {
    public static void main(String[] args) {
        System.out.print("��ӂ̒����F");
        double b = PConsole.inputIntNum();
        System.out.print("�����F");
        double h = PConsole.inputIntNum();

        double sankaku = calcTriangleArea(b, h);
        System.out.println("���" + String.format("%.0f", b) + "cm" + "����" + String.format("%.0f", h) + "cm�̎O�p�`�̖ʐς�" + String.format("%.0f", sankaku) + "����cm�ł�");

        System.out.print("���a�F");
        double c = PConsole.inputIntNum();
        
        double en = calcCircleArea(c);
        System.out.println("���a" + c + "cm�̉~�̖ʐς�" + String.format("%.1f", en) + "����cm�ł�");
    }

    public static double calcTriangleArea(double bottom, double height) {
        double area = (bottom * height) / 2;
        return area;
    }

    public static double calcCircleArea(double radius) {
        double area = radius * radius * 3.1415;
        return area;
    }
}