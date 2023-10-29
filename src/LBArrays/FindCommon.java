package LBArrays;
import java.util.ArrayList;
class FindCommon {

    // This function prints common elements in ar1
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        int i = 0, j = 0, k = 0;
        ArrayList<Integer> res = new ArrayList<Integer>();
        int last = Integer.MIN_VALUE;

        while (i < n1 && j < n2 && k < n3)
        {
            if (A[i] == B[j] && A[i] == C[k] && A[i] != last)
            {
                res.add (A[i]);
                last = A[i];
                i++;
                j++;
                k++;
            }
            else if (Math.min (A[i], Math.min(B[j], C[k])) == A[i]) i++;
            else if (Math.min (A[i], Math.min(B[j], C[k])) == B[j]) j++;
            else k++;
        }
        return res;
    }

    // Driver code
    public static void main(String args[]) {
        FindCommon ob = new FindCommon();

        int ar1[] = {1, 5, 10, 20, 40, 80, 80};
        int ar2[] = {6, 7, 20, 80, 80, 100};
        int ar3[] = {3, 4, 15, 20, 30, 70, 80, 80, 120};

        System.out.print("Common elements are ");

        ob.commonElements(ar1, ar2, ar3,ar1.length,ar2.length,ar3.length);
    }}