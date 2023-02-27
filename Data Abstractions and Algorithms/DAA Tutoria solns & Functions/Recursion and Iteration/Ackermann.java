import java.util.Scanner;

public class Ackermann{
    static int acker(int m, int n){
        if (m == 0){
            return n + 1;
        }
        else if((m>0)&&(n>0)){
            return acker((m-1), acker(m, (n-1)));
        }
        else if((m>0)&&(n==0)){
            return acker((m - 1), 1);
        }
        return 0;
    }


 public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        
        System.out.println("Enter the 1st interger: ");
        int x = sk.nextInt();

        System.out.println("Enter the 2nd interger: ");
        int y = sk.nextInt();

        System.out.println(acker(x, y));
        
    }
}