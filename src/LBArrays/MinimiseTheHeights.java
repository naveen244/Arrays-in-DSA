package LBArrays;

import java.util.*;
public class MinimiseTheHeights {
    public static void main(String[] args) {
        int[] arr = { 7, 4, 8, 8, 8, 9 };
        int k = 6;
        int ans = getMinDiff(arr, arr.length, k);
        System.out.println(ans);
    }

    private static int getMinDiff(int[] arr, int length, int k) {
        if(length<=1)return 0;
        Arrays.sort(arr);
        int Min,Max;
        int diff=arr[length-1]-arr[0];
        for (int i=1;i<length;i++){
            if ((arr[i]-k)<0)continue;
            Min=Math.min(arr[0]+k,arr[i]-k);
            Max=Math.max(arr[length-1]-k,arr[i-1]+k);
            diff=Math.min(diff,Max-Min);
        }
        return diff;
    }
}

