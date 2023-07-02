package Week2_Challenge;

public class Area {
    public static void main(String[] args) {
        double base = 3.0;
        double height = 2.0;
        double area = triArea(base, height);
        System.out.println("Triangle area: " + area);

        base = 7.0;
        height = 4.0;
        area = triArea(base, height);
        System.out.println("Triangle area: " + area);

        base = 10.0;
        height = 10.0;
        area = triArea(base, height);
        System.out.println("Triangle area: " + area);
    }

    public static double triArea(double base, double height) {
        double result = (base * height) / 2;
        return result;
    }
}
