import java.util.Scanner;
public class Hanoi {

    //Recursion function
    static void hanoi(int n, char source, char destination, char temp_rod){
        if (n==1){
          System.out.println("Move disk 1 from rod "+source+ " to rod "+destination); 
        }else{
            hanoi(n-1, source, temp_rod, destination);
            System.out.println("Move disk "+n+" from rod "+source+" to rod "+destination);
            hanoi(n-1, temp_rod, destination, source);
        }
    }

    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
    
        System.out.println("Enter number of disks:");
        int n = sk.nextInt();

        System.out.println("Enter the name of the 1st tower:");
        char a = sk.next().charAt(0);

        System.out.println("Enter the name of the 2nd tower:");
        char b = sk.next().charAt(0);

        System.out.println("Enter the name of the 3rd tower:");
        char c = sk.next().charAt(0);
    
        hanoi(n, a, b , c);
        
    
        
    }
    
}
