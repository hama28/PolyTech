public class Ren5_4 {
    public static void main(String[] args) {
        System.out.print("’ê•Ó‚Ì’·‚³F");
        double b = PConsole.inputIntNum();
        System.out.print("‚‚³F");
        double h = PConsole.inputIntNum();

        double sankaku = calcTriangleArea(b, h);
        System.out.println("’ê•Ó" + String.format("%.0f", b) + "cm" + "‚‚³" + String.format("%.0f", h) + "cm‚ÌOŠpŒ`‚Ì–ÊÏ‚Í" + String.format("%.0f", sankaku) + "•½•ûcm‚Å‚·");

        System.out.print("”¼ŒaF");
        double c = PConsole.inputIntNum();
        
        double en = calcCircleArea(c);
        System.out.println("”¼Œa" + c + "cm‚Ì‰~‚Ì–ÊÏ‚Í" + String.format("%.1f", en) + "•½•ûcm‚Å‚·");
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