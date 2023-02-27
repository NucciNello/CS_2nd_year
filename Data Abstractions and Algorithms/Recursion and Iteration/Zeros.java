import java.util.Scanner;
public class Zeros {

    //Recursio function
    static int recu_zeros(int n){
        if (n == 0)
            return 1;
        if ((-10<n) && (10>n))
            return 0;
        return recu_zeros((n)/10) + recu_zeros(((n)%10)); 
    }
    //Iteration function
    static int itera_zeros(int n){
        int count = 0;
        while(n>0||n<0){
            if(n%10==0){
                count++;
            }
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Intger:");
        int number = sc.nextInt();

        System.out.println(recu_zeros(number));
        System.out.println(itera_zeros(number));


    }
    
}
