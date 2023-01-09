import java.util.Scanner;

//****RECURSION****
// public class Factorial {
//     static int factorial(int n){
//         if((n==0)||(n==1)){
//             return 1;
//         }
//         return n * factorial((n-1));
//     }

public class Factorial {
    static int factorial(int n){
        if((n==1)||(n==0)){
            return 1;
        }
        else{
        int fact = 1;
        for(int i=1; i<=n; i++){
         fact *= i;
        }
        return fact;
    }
}

public static void main(String[] args) {
    Scanner sk = new Scanner(System.in);
    
    System.out.println("Enter the integer:");
    int n = sk.nextInt();

    System.out.println(factorial(n));
    
}
}
