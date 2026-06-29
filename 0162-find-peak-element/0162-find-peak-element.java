class Solution {
    public int findPeakElement(int[] nums) {
        int left =0, right = nums.length-1;

        while (left <= right) {
            int mid = (right - left) / 2+left;

            boolean greaterThanLeft = mid <= 0 || nums[mid] > nums [mid -1];
            boolean greaterThanRight = mid >= nums.length -1 || nums[mid] > nums[mid+1];

            if (greaterThanLeft && greaterThanRight) {
                return mid;
            } else if (!greaterThanLeft){
                right = mid -1;
            } else {
                left = mid +1;
            }
        }
        return -1;
    }
}