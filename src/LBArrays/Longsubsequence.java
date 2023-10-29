package LBArrays;

import java.util.Arrays;

public class Longsubsequence {

        // arr[] : the input array
        // N : size of the array arr[]

        //Function to return length of longest subsequence of consecutive integers.


            static int findLongestConseqSubseq(int arr[], int N)
            {
                // add your code here
                Arrays.sort(arr);
                int sum=1;

                for(int i=0;i<N-1;i++){
                    if(arr[i+1]-arr[i]==0)continue;
                    else if(arr[i+1]-arr[i]==1){
                        sum++;
                    }}
                return sum;
            }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int i=findLongestConseqSubseq(arr, arr.length);
        System.out.println(i);
    }
}
