package Week3_Challenge;
import java.util.*;
import java.io.*;
public class Reverse {
        public static String FirstReverse(String str) {
            // Create a StringBuilder object and pass the input string as an argument
            StringBuilder reversedStr = new StringBuilder(str);

            // Use the reverse() method to reverse the string
            reversedStr.reverse();

            // Convert the StringBuilder object back to a string
            String reversed = reversedStr.toString();

            return reversed;
        }

        public static void main(String[] args) {
            // keep this function call here
            Scanner input = new Scanner(System.in);
            System.out.print(FirstReverse(input.nextLine()));
        }

}
