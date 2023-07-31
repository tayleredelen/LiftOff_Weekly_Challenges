package Week5_Challenge;

public class AddUp {

        public static int addUp(int num) {
            int sum = 0;
            for (int i = 1; i <= num; i++) {
                sum += i;
            }
            return sum;
        }

        public static void main(String[] args) {
            // Test cases
            System.out.println(addUp(4));   // Output: 10
            System.out.println(addUp(13));  // Output: 91
            System.out.println(addUp(600)); // Output: 180300
        }
}


