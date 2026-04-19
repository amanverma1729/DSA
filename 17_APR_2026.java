// link: https://leetcode.com/problems/single-number/

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        
        for (int num : nums) {                // for (int i = 0; i < nums.length; i++) {
              result ^= num;                 //  int num = nums[i]; // This is what the for-each loop does automatically
                                            // result ^= num;
                                          //}

        }
        
        return result;
    }
}