import java.util.Scanner;
public class Fibonacci {
    //Recursive function
    static int recu_fibonacci(int n){
        if(n ==  0){
            return 0;
        }else if(n == 1){
            return 1;
        }
        return recu_fibonacci(n-1) + recu_fibonacci(n-2);
    }

    //Iterative function
    static int itera_fibonacci(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            int fibonacci=1;
            int prevFibonacci = 1;
            for(int i=2; i<n;i++){
                int temp=fibonacci;
                fibonacci +=prevFibonacci;
                prevFibonacci = temp;
            }
            return fibonacci;
        }
    }

    /***Array-Iterative function
    the problem with this it only put values to index 3, leaving
        other indeces with a 0 as their values***/
    static int array_fibonacci(int n){
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

    System.out.println(recu_fibonacci(n));
    System.out.println(itera_fibonacci(n));
    System.out.println(array_fibonacci(n));

    
}
}
