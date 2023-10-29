package LBArrays;

import java.util.Arrays;
import java.util.Scanner;

// Java code for the above approach
class Besttimetobuy {
    static int maxProfit(int n,int arr[]){
//        int first_buy = Integer.MIN_VALUE;
//        int first_sell = 0;
//        int second_buy = Integer.MIN_VALUE;
//        int second_sell = 0;

//        for(int i = 0; i < n; i++) {
//            first_buy = Math.max(first_buy,-arr[i]);
//            first_sell = Math.max(first_sell,first_buy+arr[i]);
//            second_buy = Math.max(second_buy,first_sell-arr[i]);
//            second_sell = Math.max(second_sell,second_buy+arr[i]);
//        }
//        return second_sell;

        int buy=Integer.MIN_VALUE;
        int sell=0;
        for(int i=0;i<n;i++){
            buy=Math.max(buy,-arr[i]);
            sell=Math.max(sell,buy+arr[i]);
        }
        return sell;
    }

    // Driver Code
    public static void main(String args[])
    {
//        int prices[] = { 10 ,22 ,5, 75 ,65 ,80};
//        int n = prices.length;
//        int max_profit = maxProfit(n,prices);
//        System.out.println(max_profit);
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for (int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxProfit(N,arr));
    }
}

// This code is contributed by Lovely Jain
