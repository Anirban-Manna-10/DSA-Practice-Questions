import java.util.*;
public class findDuplicate {
    public static  List<Integer> findDuplicates(int[] nums) { // if the input is limited or known 
        List<Integer> ans = new ArrayList<>();
        boolean arr[] = new boolean[nums.length];
        for(int i : nums){
            if(arr[i-1] == true){
                ans.add(i);
            }else{
                arr[i-1] = true;
            }
        }
        return ans;
    }
       
    // 2 2 3 4 5 69 100 100 200
    public static void findDuplicates2(int[] nums) {
        Arrays.sort(nums);
        int pre = 0;
        int i = 1;
        for(; i < nums.length ; i++ ){
            if( nums[i] == nums[pre]){
                if( i - pre == 1){
                    System.out.println(nums[i]);
                }
            }else{
                pre = i;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 10, 10, 100, 2, 10, 11, 2, 11, 2};
        // findDuplicates(arr);
        findDuplicates2(arr);
    }
    
}
