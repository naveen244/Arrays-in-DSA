import java.io.*;
import java.util.*;
public class MinMoves {
    private static int Minmoves(int[] arr,int n) {
//        Arrays.sort(arr);
//        int median=n%2==0 ?(arr[n/2]+arr[n/2-1])/2 :arr[n/2];
//        int steps=0;
//        for (int i:arr){
//            steps+=Math.abs(i-median);
//        }
//        return steps;
        int i=0,j=n-1;
        int steps=0;
        while (j>i){
            steps+=(arr[j]-arr[i]);
            i++;
            j--;
        }
        return steps;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for (int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Minmoves(arr,N));

    }


}