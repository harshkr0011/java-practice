class Solution {
    public int maxArea(int[] height) {
        int low=0,high=height.length-1,max_area=0,area;
        while(low < high){
            if(height[low]<height[high]){
                area=height[low]*(high-low);
                low+=1;
            }
            else{
                area=height[high]*(high-low);
                high-=1;
            }
            if(area > max_area){
                max_area=area;
            }
        }
        return max_area;
    }
}