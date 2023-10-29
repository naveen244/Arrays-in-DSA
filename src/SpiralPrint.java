import java.io.*;
import java.util.*;

public class SpiralPrint {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int g=sc.nextInt();

        int[][] arr1=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr1[i][j]= sc.nextInt();
            }
        }
        int r1=0,r2=n-1;
        int c1=0,c2=n-1;
        while (r1<=r2 && c1<=c2){
            for (int c=c1;c<=c2;c++){
                System.out.print(arr1[r1][c]+" ");
            }
            for (int i=r1+1;i<=r2;i++){
                System.out.print(arr1[i][c2]+" ");
            }
            if (r1<r2 && c1<c2){
                for (int c=c2-1;c>c1;c--){
                    System.out.print(arr1[r2][c]+" ");
                }
                for (int r=r2;r>r1;r--){
                    System.out.print(arr1[r][c1]+" ");
                }
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
    }
}