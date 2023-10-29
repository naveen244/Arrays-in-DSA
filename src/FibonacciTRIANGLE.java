public class FibonacciTRIANGLE {

    public static void main(String[] args) {
        int n=5;
        fibonacci(n);
    }

    private static void fibonacci(int n) {
        int N=n*(n+1)/2;
        int arr[]=new int[N];
        fiboval(arr,N);
        int k=0;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(arr[k++]+" ");
            }
            System.out.println();
        }
    }

    private static void fiboval(int[] arr, int n) {
        arr[0]=1 ;
        arr[1]=1;
        for(int i=2;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
    }
}
