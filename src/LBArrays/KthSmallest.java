package LBArrays;
import java.util.Arrays;
import java.util.Scanner;

public class KthSmallest {
    static int kthsmall(int[] arr,int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={12,67,9,8,21,1};
        int n= sc.nextInt();
        System.out.println(kthsmall(arr,n));

    }
}

