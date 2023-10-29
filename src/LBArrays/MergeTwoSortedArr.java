package LBArrays;

import java.util.Arrays;

class MergeTwoSortedArr
{ //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m)
    {
        // code here
        long arr3[]=new long[n+m];
        for(int i=0;i<n;i++){
            arr3[i]=arr1[i];
        }
        for(int i=0;i<m;i++){
            arr3[i+n]=arr2[i];
        }
        Arrays.sort(arr3);
        for (int i=0;i<arr3.length-m;i++){
            arr1[i]=arr3[i];
        }
        for (int i=0;i<arr2.length;i++){
            arr2[i] =arr3[n+i];
        }
    }

    public static void main(String[] args) {
        long arr1[]={4,2,6,2};
        long arr2[]={6,3,1,7,4,3};
        merge(arr1,arr2, arr1.length, arr2.length);
        for (long i:arr1) {
            System.out.print(i + " ");
        }
        for (long i:arr2){
            System.out.print(i+" ");
        }

    }
}

