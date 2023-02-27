import java.util.Scanner;
public class Message {

    //Recursion function
    static String recu_print(String message,int n ){
        if((message == "")||(n<=0)) 
            return "";
        else{
            return message+"\n" + recu_print(message, n-1);
        }
    }
    //Iteration function
    static void itera_print(String message,int n ){
        if((message == "")||(n<=0))
            System.out.println("");
        else{
                int i=0;
                while(i<n){
                   System.out.println(message);
                i++;
                }
        }
    }


    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);

        System.out.println("type the text here!");
        String message = scan.nextLine();

        System.out.println("How many times?");
        int times = scan.nextInt();
        
        System.out.println(recu_print(message, times));
        System.out.println("\n");
        itera_print(message, times);
    }
}

