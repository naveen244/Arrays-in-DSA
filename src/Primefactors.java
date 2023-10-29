import java.io.*;
import java.util.*;

public class Primefactors {
    public static boolean isPrime(int n){
        for (int i=2;i<n;i++){
            if (n%i == 0)return false;
        }
        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();
        int[] arr=new int[N/2];
        int i=2;
        int j=0;
        while (i<=N){
            if (isPrime(i)==true){
                if (N%i==0){
                    arr[j]=i;
                    j++;
                    N=N/i;
                }else {
                    i++;
                }
            }else i++;

        }
        for (int k=0;k<j;k++){
            System.out.print(arr[k]+" ");
        }
}
}