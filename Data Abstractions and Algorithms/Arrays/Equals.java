public class Equals {
    static void equals(int[][] array1, int[][] array2){
        if( array1.length != array2.length){
            // return "Arrays are not equal!";
            System.out.println("Arrays are not equal!");
        }
        else{
            for (int i=0 ; i < (array1.length) ; i++){
                if (array1[i].length == array2[i].length){
                    for (int j = 0; j < (array1.length) ; j++){
                            if(array1[i][j] != array2[i][j]){
                                // return "Arrays are not equal!";
                                System.out.println("Arrays are not equal!");
                                break;
                            }
                            else{
                                // System.out.println("Arrays are equal!");
                                continue;
                            }
                        }
                    
                }
                else if(array1[i].length != array2[i].length){
                    // return "Arrays are not equal!";
                    System.out.println("Arrays are not equal!");
                }
            }
            // return "Arrays are equal!";
        }
    }

    public static void main(String[] args) {

        int[][] array1 = {
            {1, 2, 3, 4},
            {4, 5, 6, 6},
            {1, 2, 5, 7}, 
            {1, 6, 7, 8},
          };

          int[][] array2 = {
            {1, 2, 3, 4},
            {4, 5, 6, 6},
            {1, 2, 5, 7}, 
            {1, 6, 7, 8},
          };

        equals(array1, array2);
        
    }







}
