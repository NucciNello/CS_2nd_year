import java.util.Scanner;
public class Handshake {
    //recursion function
    static int recu_shakes(int n){
        if( n == 0){
            return 0;
        }else{
            return recu_shakes((n-1)) + (n-1);
        }
    }

    //iterative function
    static int itera_shakes(int n){
        int handshakes = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                handshakes++;
            }  
        }
        return handshakes;
    }





public static void main(String[] args) {
    Scanner sk = new Scanner(System.in);
    
    System.out.println("Enter the number of people:");
    int n = sk.nextInt();
    System.out.println(recu_shakes(n));
    System.out.println(itera_shakes(n));
    
}
}

