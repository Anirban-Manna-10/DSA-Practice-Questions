class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<Integer>();
        for(int n : nums){
            if(numSet.contains(n)){
                return true;
            }
            numSet.add(n);
        }
        return false;
    }
}