public class BinarySerach {
    //Recursion function
    static int recu_search(int arr[],int first,int last, int target){
        int mid = (first + last)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(first >= last){
            return -1;
        }
        else if(target<arr[mid]){
            return recu_search(arr,first,mid-1,target);
        }
        else{
            return recu_search(arr,mid+1,last,target);
        }
    }

    //Iterative function
    static int itera_search(int arr[],int target){
        int first=0;
        int last=arr.length-1;
        while(first <= last){
            int mid = (first+last)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                last = mid-1;
            }else{
                first = mid+1;
            }
        }
        return -1; 
    }

    public static void main(String[] args){
        // int[] myarr = new int[8];
        int[] myarr = {11, 22, 33, 44, 55, 66, 77, 88, 99, 100};
        int target = 199, first = 0, last = 9;
        System.out.println(recu_search(myarr, first, last, target));
        System.out.println(itera_search(myarr, target));
    }
}


