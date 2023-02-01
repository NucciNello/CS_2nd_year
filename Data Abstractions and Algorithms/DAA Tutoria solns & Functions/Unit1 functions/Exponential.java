import java.util.Scanner;
import java.lang.Math;


//****RECURSIVE EXPONENTIAL****//
public class Exponential {
    static float rExp(float value, float n){
        if (n == 0)
            return 1;
        else if( n > 0)
            return value * rExp(value, (n-1));
        else 
            n = Math.abs(n);
            return ((1)/(value * rExp(value, (n-1))));
    }


    //****ITERATION EXPONENTIAL****//
    static float iExp(float value, float n){
        float result = 1;
        if(n<0){
                for (int j=1; j<=(n-1);j++){
                result = result * (1/value);
            }
            return result;
        }
        if(n>0){
            for ( int i=1;i<=(n-1);i++){
                result = result * value;
                return result;
            }
        }
        return 1;
}


    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        
        System.out.println("Enter the interger: ");
        float value = sk.nextFloat();

        System.out.println("Enter the exponent: ");
        float exponent = sk.nextFloat();

        
        float result = iExp(value, exponent);
        // if (result == 0)
        //     System.out.println("Not")
        System.out.println(result);

        
    }
}
