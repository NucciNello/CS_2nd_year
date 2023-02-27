import java.util.Scanner;
public class Palindrome {
    static boolean recu_palindrome( String word, int first, int last){
        if(word.charAt(first)==word.charAt(last)){
            if(first <= last){
                recu_palindrome(word, first + 1, last-1);
            }
        }
        else{
            return false;
        }
        return true;
    }

    static boolean itera_palindrome(String word, int first, int last){
        while(first<last){
            if(word.charAt(first)==word.charAt(last)){
                last--;
                first++;
                return true;
            }
            return false;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);

        // System.out.println("type the text here!");
        // String [] message = scan.nextLine();

        String message = "emadame";

        // int first = 0;
        // int last = message.length();

        System.out.println(recu_palindrome(message, 0, message.length()-1));
        System.out.println(itera_palindrome(message, 0, message.length()-1));

    
}
}
