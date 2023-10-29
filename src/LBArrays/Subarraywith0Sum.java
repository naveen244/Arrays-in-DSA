package LBArrays;
import java.util.*;
class Subarraywith0Sum{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        int sum=0;
        HashSet<Integer> set=new HashSet<Integer>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(set.contains(sum)||sum==0||arr[i]==0) return true;
            set.add(sum);

        }
        return false;

    }
    public static void main(String arg[]) {
        int arr[] = {-3, 2, 3, 1, 6};

        // Function call
        if (findsum(arr, arr.length))
            System.out.println(
                    "Found a subarray with 0 sum");
        else
            System.out.println("No Such Sub Array Exists!");
    }
}

