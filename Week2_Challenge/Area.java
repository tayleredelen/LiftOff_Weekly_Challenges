package Week2_Challenge;

public class Area {

    public static double triArea(double base, double height){
        double result = (base * height) / 2;
        return result;
    }
    public static void main(String[] args) {

        System.out.println(triArea(3,2));
        System.out.println(triArea(7,4));
        System.out.println(triArea(10,10));

    }

}
//