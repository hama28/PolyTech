public class Ren5_4 {
    public static void main(String[] args) {
        System.out.print("źÓĢ·³F");
        double b = PConsole.inputIntNum();
        System.out.print("³F");
        double h = PConsole.inputIntNum();

        double sankaku = calcTriangleArea(b, h);
        System.out.println("źÓ" + String.format("%.0f", b) + "cm" + "³" + String.format("%.0f", h) + "cmĢOp`ĢŹĻĶ" + String.format("%.0f", sankaku) + "½ūcmÅ·");

        System.out.print("¼aF");
        double c = PConsole.inputIntNum();
        
        double en = calcCircleArea(c);
        System.out.println("¼a" + c + "cmĢ~ĢŹĻĶ" + String.format("%.1f", en) + "½ūcmÅ·");
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