package LBArrays;
import java.util.ArrayList;
import java.util.Collections;

class BigFactorial {
    static ArrayList<Integer> factorial(int N){
        java.math.BigInteger b = new java.math.BigInteger(N + "");
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 1; i < N; i++)
            b = b.multiply(new java.math.BigInteger(i +""));
        String s = String.valueOf(b);
        for (int i = 0; i < s.length(); i++)
            res.add(Character.getNumericValue(s.charAt(i)));
        return res;
    }
}