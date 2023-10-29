import java.io.*;
import java.util.*;

public class GCDofArr {

    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];*/
        /*for (int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(GCD(N,arr));*/
        System.out.println(gcd(3,39));

    }
    public static int gcd(int a,int b){
        while(a>0 && b>0){
            if(a>b)a=a%b;
            else b=b%a;
        }
        if(a==0)return b;
        return a;
    }

    private static int GCD(int n, int[] arr) {
        int result=arr[0];
        for (int i=1;i<n;i++){
           result= gcd(result,arr[i]);
            if (result==1)return 1;
        }
        return result;
    }
}