class Solution {
    public int removeDuplicates(int[] nums) {
        int res = 1;
        int m = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] != nums[i]){
                nums[res++] = nums[i];
                m=1;
            }
            else{
                if(++m == 2){
                    nums[res++] = nums[i];
                }
            }
        }
        return res;
    }
}