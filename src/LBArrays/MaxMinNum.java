package LBArrays;

public class MaxMinNum {
    static int Min;
    static int Max;
    public static void FindMinMax(int[] arr,int size){
        if (size == 1){
            Min =arr[0];
            Max =arr[0];
            System.out.println("Min is: "+Min+",max is: "+Max);
        }
        if (arr[0] > arr[1]){
            Min = arr[1];
            Max =arr[0];
        }else
        {
            Min=arr[0];
            Max =arr[1];
        }
        for (int i=2;i<size;i++) {
            if (arr[i] > Max){
                Max = arr[i];
            }else if (arr[i] < Min){
                Min = arr[i];
            }
        }
        System.out.println("Min is: "+Min+",max is: "+Max);
    }


    public static void main(String[] args){
        int[] arr={11,67,45,9};
        int n= arr.length;
        FindMinMax(arr,n);

    }
}

