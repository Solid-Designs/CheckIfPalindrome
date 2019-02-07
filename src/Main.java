import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        // Check if palindrome
        // Reverse a string, and then see if it equals the original
        String myWord = "racecar", reversedWord = "";

        // Create a for loop that goes backwards through the string
        for(int i = myWord.length() - 1; i >= 0; i--){
            reversedWord = reversedWord + myWord.charAt(i);
        }
        System.out.println(reversedWord);
        if(myWord.equalsIgnoreCase(reversedWord)){
            System.out.print("This is a Palindrome");
        }else{
            System.out.print("This is not a Palindrome");
        }
    }
}
