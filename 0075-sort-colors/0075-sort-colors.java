class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int i= 0;
        while(i<=high){
            if(nums[i]==0){
                swap(nums, low++, i);
            }
            if(nums[i]==2){
                swap(nums, i--, high--);
            }
            i++;
        }
    }
    public void swap(int[] nums, int low, int high){
        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
    }
}