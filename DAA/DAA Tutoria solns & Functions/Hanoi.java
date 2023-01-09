import java.util.Scanner;
public class Hanoi {
    static void hanoi(int n, char from_rod, char to_rod, char temp_rod){
        if (n==1){
          System.out.println("Move disk 1 from rod "+from_rod+ " to rod "+to_rod);
          return;  
        }
        hanoi(n-1, from_rod, temp_rod, to_rod);
        System.out.println("Move disk "+n+" from rod "+from_rod+" to rod "+to_rod);
        hanoi(n-1, temp_rod, to_rod, from_rod);
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
