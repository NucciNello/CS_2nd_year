import java.util.Scanner;
import java.lang.Math;
// ****RECURSIVE EXPONENTIAL****//
public class Exponential {
    static float recu_exponential(float value, float n){
        if (n == 0)
            return 1;
        else if( n > 0)
            return value * recu_exponential(value, (n-1));
        else 
            n = Math.abs(n);
            return ((1)/(value * recu_exponential(value, (n-1))));
    }


    //****ITERATION EXPONENTIAL****//
    static float itera_exponential(float value, float n){
        float result = 1;
        if(n<0){
                for (int i=1; i<=n;i++){
                result *= (1/value);
                }
        }
        if(n>0){
            for (int i=1;i<=n;i++){
                result *= value;
            }
        }
        return result;
}


    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        
        System.out.println("Enter the interger: ");
        float value = sk.nextFloat();

        System.out.println("Enter the exponent: ");
        float exponent = sk.nextFloat();

        System.out.println(recu_exponential(value, exponent));
        System.out.println(itera_exponential(value, exponent));

        
    }
}
