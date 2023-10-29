
package LBArrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MoreThanNDK {

    public static void main(String[] args) {
        int[] arr={1,1,1,1,1,2,2,2,2,2,2};
        int N= arr.length;
        int K=3;
        int D=N/K;
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i=0;i<N;i++){
            if (!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                int count=map.get(arr[i]);
                map.put(arr[i],count+1);
            }
        }
        for (Map.Entry i:map.entrySet()){
            Integer temp=(Integer) i.getValue();
            System.out.println("temp: "+temp);

            if (temp >D){
                System.out.println(i.getKey());

            }
        }

// Moore’s Voting Algorithm:
        /*int ansindex=0;
        int count =1;
        for(int i=1;i<N;i++){
            if (arr[i]==arr[ansindex]){
                count++;
            }else count--;
            if(count==0){
                ansindex=i;
                count=1;
            }
        }
        System.out.println(arr[ansindex]);*/
    }
}
