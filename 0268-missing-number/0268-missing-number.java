class Solution {
    public int missingNumber(int[] nums) {
        int xor = 0;
        int i = 0;
        for(int num : nums){
            xor ^= i++ ^ num;
        }
        return xor ^ i;
    }
}