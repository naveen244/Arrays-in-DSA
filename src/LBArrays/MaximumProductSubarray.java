package LBArrays;

public class MaximumProductSubarray {
    static long maxProduct(int[] arr, int n) {
        // code here
        long loc=1;
        long res=(long)Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            loc*=arr[i];
            res=Math.max(res,loc);
            if(loc==0) loc=1;
        }
        long loc2=1;
        for(int i=n-1;i>=0;i--){
            loc2*=arr[i];
            res=Math.max(res,loc2);
            if(loc2==0) loc2=1;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={-1,2,3,0,-4,12};
        long prod=maxProduct(arr, arr.length);
        System.out.println(prod);


    }
}
