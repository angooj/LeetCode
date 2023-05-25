class Solution {
    public boolean check(int[] nums) {
        int falsect = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>nums[(i+1)%nums.length] && falsect<=1)
            falsect++;
        }
        return(falsect<=1);
    }
}