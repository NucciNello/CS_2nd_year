import java.util.Scanner;
public class Handshake {
    static int shakes(int n){
        if( n == 0){
            return 0;
        }else{
            return shakes((n-1)) + (n-1);
        }
    }


public static void main(String[] args) {
    Scanner sk = new Scanner(System.in);
    
    System.out.println("Enter the number of people:");
    int n = sk.nextInt();

    System.out.println(shakes(n));
    
}
}

