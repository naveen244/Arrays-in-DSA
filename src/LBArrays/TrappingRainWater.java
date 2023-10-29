package LBArrays;
class TrappingRainWater{
    /*public int trap(int[] height) {
        int n=height.length;
        int[] prefix=new int[n];
        int[] suffix=new int[n];
        prefix[0]=height[0];
        for(int i=1;i<n;i++){
            prefix[i]=Math.max(prefix[i-1],height[i]);
        }
        suffix[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            suffix[i]=Math.max(suffix[i+1],height[i]);
        }
        int C=0;
        for(int i=0;i<n;i++){
            C+=Math.min(prefix[i],suffix[i])-height[i];
        }
        return C;
    }*/

    public int trap(int[] height) {
        int n=height.length;
        int left=0,right=n-1;
        int L_max=0,R_max=0;
        int C=0;
        while(left<=right){
            if(height[left]<=height[right]){
                if(L_max<height[left])L_max=height[left];
                else{
                    C+=L_max-height[left];
                }
                left++;
            }else{
                if(R_max<height[right])R_max=height[right];
                else{
                    C+=R_max-height[right];
                }
                right--;
            }
        }
        return C;
    }
}