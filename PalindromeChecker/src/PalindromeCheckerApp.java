import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PalindromeCheckerApp {
    static void main(){
                String word = "radar";
                char[] charArray = word.toCharArray();
                int start = 0;
                int end = charArray.length - 1;
                boolean isPalindrome = true;

                while (start < end) {
                    if (charArray[start] != charArray[end]) {
                        isPalindrome = false;
                        break;
                    }
                    start++;
                    end--;
                }
                if (isPalindrome) {
                    System.out.println(word + " is a palindrome.");
                } else {
                    System.out.println(word + " is not a palindrome.");
                }
            }
        }
