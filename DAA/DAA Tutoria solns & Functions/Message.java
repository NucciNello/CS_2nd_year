import java.util.Scanner;
public class Message {
    static String nprint(String message,int n ){
        if((message == null)||(n<=0)) 
            return "";
        else{
            n--;
            return message+"\n" + nprint(message, n);
        }
    }

    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);

        System.out.println("type the text here!");
        String message = scan.nextLine();

        System.out.println("How many times?");
        int times = scan.nextInt();
        
        String result = nprint(message, times);
        System.out.println(result);
    }
    
}
