package Week4_Challenge;
import java.util.*;
import java.io.*;
public class Longest {
    public static String LongestWord(String sen) {
        String[] words = sen.split(" "); //split sen into words and store in the array words
        String longestWord = ""; //set longestWord as an empty string

        for (String currentWord : words) { //for each currentWord in the words array
            if (currentWord.length() > longestWord.length()) { //if the length of currentWord is greater than the length of longestWord
                longestWord = currentWord; //set longestWord as currentWord
            }
        }

        return longestWord;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in); //create a new instance of Scanner named s to read user input from the console
        System.out.print(LongestWord(s.nextLine())); //print the result of calling LongestWord with the next line of user input using s
    }
}


