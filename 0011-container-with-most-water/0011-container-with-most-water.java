class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxVol=0;

        while(i<j){
            if(height[i]<height[j]){
                maxVol=Math.max((height[i]*(j-i)),maxVol);
                i++;
            }else{
                maxVol=Math.max((height[j]*(j-i)),maxVol);
                j--;
            }
        }
        return maxVol;
    }
}