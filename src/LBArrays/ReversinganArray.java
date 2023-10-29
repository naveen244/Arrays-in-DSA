package LBArrays;

public class ReversinganArray {
    public static void reversearray(int[] arr,int i,int k){
        int temp;
        while (i<k){
            temp =arr[k];
            arr[k]=arr[i];
            arr[i]=temp;
            i++;
            k--;
        }

    }
    public static void main(String[] args){
        int[] arr={2,4,1,8};
        for (int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        //reversing the array
        int start=0;
        int end=arr.length -1;
        reversearray(arr,start,end);
        for (int i:arr){
            System.out.print(i+" ");
        }


    }
}
