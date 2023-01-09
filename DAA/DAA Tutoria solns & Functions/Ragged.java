
public class Ragged {
    static String isRagged(int[][] array){
        for (int i=0 ; i < (array.length-1) ; i++){
            if(array[i].length != array[i+1].length){
                return "Is not Ragged!";
            }
            else{
                continue;  
            }
        }
            return "Ragged!";
    }

    public static void main(String[] args) {
        
       
        int[][] array = {
            {1, 2, 3, 4},
            {4, 5, 6, 6},
            {1, 2, 5, 7}, 
            {1, 6, 7, 8},
            {1, 0, 0, 0},
          };
          
        System.out.println(array.length);

        System.out.println(isRagged(array));
        
    }














    
}
