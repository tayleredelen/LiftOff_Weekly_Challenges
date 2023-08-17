package Week7_Challenge;

public class CharCount {

        public static void main(String[] args) {
            System.out.println(charCount("a", "edabit"));               // Output: 1
            System.out.println(charCount("c", "Chamber of secrets"));  // Output: 1
            System.out.println(charCount("b", "big fat bubble"));      // Output: 4
        }

        public static int charCount(String singleChar, String str) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == singleChar.charAt(0)) {
                    count++;
                }
            }
            return count;
        }


} 
