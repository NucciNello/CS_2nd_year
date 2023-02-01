import java.util.Scanner;
public class Fibonacci {
    // static int fibonacci(int n){
    //     if(n ==  0){
    //         return 0;
    //     }else if(n == 1){
    //         return 1;
    //     }
    //     return fibonacci((n-1))+fibonacci((n-2));
    // }
    static int fibonacci(int n){
        int[] f = new int[100];
        f[0] = 0;
        f[1] = 1;
        for (int i=2 ; i<=n ; i++)
        f[i] = f[n-1] + f[n-2];
        return f[n];
    }


public static void main(String[] args) {
    Scanner sk = new Scanner(System.in);
    
    System.out.println("Enter the number of months:");
    int n = sk.nextInt();

    System.out.println(fibonacci(n));
    
}
}
