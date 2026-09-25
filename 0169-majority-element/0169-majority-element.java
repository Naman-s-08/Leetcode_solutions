class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int mid=nums.length/2;
        int midEl=nums[mid];
        return midEl;
        }
    }
