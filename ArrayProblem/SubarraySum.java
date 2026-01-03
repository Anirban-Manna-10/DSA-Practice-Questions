class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int count = 0 , preSum = 0 ; 
        map.put(0,1); //for 1st iteration;
        for(int i = 0 ; i < nums.length ; i++){
            preSum += nums[i];

            int check = preSum - k;
            if(map.containsKey(check)){
                count += map.get(check);
            }
            map.put(preSum , map.getOrDefault(preSum , 0) + 1);
        }
        return count;
    }
}