package LBArrays;
// Move all negative numbers to beginning and positive to end

public class MoveNegNums {
    static int[] moveNegNum(int[] arr, int n){
        int temp,j=0;
        for (int i=0;i<n;i++){
            if (arr[i]<0){
                if (i != j){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j] =temp;
                }
                j++;
            }
        }
        return arr;
    }
    static void printarr(int[] arr){
        for (int i:arr)
        {
            System.out.print(i+" ");
        }}
    public static void main(String[] args){
        int[] arr={12,-8,69,14,-78,-14,-3,6};
        moveNegNum(arr,arr.length);
        printarr(arr);



    }
}
