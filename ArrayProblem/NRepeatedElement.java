class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length / 2;
        Set<Integer> set = new HashSet<Integer>();
        for(int i : nums){
            if(!set.add(i)){
                return i;
            }
        }
        return nums[0];
    }
}