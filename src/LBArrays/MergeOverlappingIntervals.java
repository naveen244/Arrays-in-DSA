package LBArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class MergeOverlappingIntervals{
    public static int[][] merge(int[][] intervals)
    {
        List<int[]> result=new ArrayList<>();
        if (intervals.length==0){
            return result.toArray(new int[0][0]);
        }
        Arrays.sort(intervals,(a,b) ->a[0] -b[0]);
        int start=intervals[0][0];
        int end=intervals[0][1];
        for (int[] i:intervals){
            if(i[0]<=end){
                end=Math.max(end,i[1]);
            }
            else{
                result.add(new int[]{start,end
                });
                start=i[0];
                end=i[1];
            }
        }
        result.add(new int[]{start,end
        });
        return result.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] arr={{1,2},{2,5},{4,8},{12,36}};
        for (int[] i:merge(arr)){
            for (int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

}