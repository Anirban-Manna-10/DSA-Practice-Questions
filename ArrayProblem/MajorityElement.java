class Solution {
    public int majorityElement(int[] nums) {
        int element = nums[0]; // taking 1st one as majority
        int vote = 1;
        for(int i : nums){
            if(element == i) //if same then increase vote else decrease
                vote++;
            else
                vote--;

            if(vote == 0){ // if vote is 0 then new element will be the majority element
                element = i;
                vote = 1;
            }
        }
        return element;
    }
}