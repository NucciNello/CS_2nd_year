import java.util.Scanner;
public class Factorial {
    //Recurive function
    static int recu_factorial(int n){
        if((n<=1)){
            return 1;
        }
        return n * recu_factorial((n-1));
    }

    //Iterative function
    static int itera_factorial(int n){
        int factorial = 1;
        if((n<=1)){
            return factorial;
        }
        else{
        for(int i=1; i<=n; i++){
         factorial *= i;
        }
        return factorial;
        }
    }

public static void main(String[] args) {
    Scanner sk = new Scanner(System.in);
    
    System.out.println("Enter the integer:");
    int n = sk.nextInt();

    // System.out.println(recu_factorial(n));
    System.out.println(itera_factorial(n));
    
}
}
