import java.util.Scanner;
public class Palindrome {
    static boolean isPalindrome( String word, int first, int last){
        boolean answer = true;
        if(word.charAt(first)==word.charAt((last))){
            if(first <= last){
                isPalindrome(word, first + 1, last-1);
            }
        }
        else{
            answer = false;
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);

        // System.out.println("type the text here!");
        // String [] message = scan.nextLine();

        String message = "madam";

        // int first = 0;
        // int last = message.length();


        System.out.println(isPalindrome(message, 0, message.length()-1));

    
}
}
