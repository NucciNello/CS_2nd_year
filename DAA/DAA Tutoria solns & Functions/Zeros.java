import java.util.Scanner;
public class Zeros {
    static int zeros(int n){
        if (n == 0)
            return 1;
        if ((-10<n) && (10>n))
            return 0;
        return zeros((n)/10) + zeros(((n)%10)); 
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Intger:");
        int number = sc.nextInt();

        System.out.println(zeros(number));


    }
    
}
