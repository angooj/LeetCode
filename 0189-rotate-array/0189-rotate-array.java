class Solution {
    public void rotate(int[] nums, int k) {
        int res[] = nums.clone();
        for(int i=0; i<nums.length; i++){
            nums[(i+k)%nums.length] = res[i];
            
        }
    }
}