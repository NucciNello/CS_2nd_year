public class BinarySearch{


//****RECURSIVE BINARY SEARCH****//
    static int rBinary(int arr[], int value,int low,int high){
        if (high >= low){
        int mid =  ( high + low)/2;

        if (value == arr[mid]){
            return arr[mid];
        }
        if ( value > arr[mid] ){
            return rBinary(arr, value, mid + 1, high);
        }
        // else( value < mid ){
            return rBinary(arr, value, low, mid -1);
        // }
    }
    return -1;
 }

 
//****ITERATIVE BINARY SEARCH****//
    static int iBinary(int arr[], int value, int low, int high){
        while(low <= high){
            int mid = (low + high)/2;

            if(arr[mid] == value){
                return arr[mid];
            }
            if (value > arr[mid]){
                low = mid + 1;
            }
            if(value < arr[mid]){

                high = mid - 1;
            }
        }
        return -1;
    }


public static void main(String args[]){
    int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 , 14};
    int n = array.length;
    int value = 3;
    int result = iBinary(array, value,  0, (n-1));
    if (result == -1)
        System.out.println("Not Found!");
        else
        System.out.println(result);
}
}
