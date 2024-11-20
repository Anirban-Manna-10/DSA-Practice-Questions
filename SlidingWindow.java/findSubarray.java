public class findSubarray {
    public static void main(String[] args) {
         int arr[] = {1,2,5,3};
         int count = 0;
         //find window where sum of corner 2 is equal to middile one
         if(arr.length < 3){
            System.out.println("Ans : " + count);
            return;
         }
         int pre = 0, curr = 1, next = 2;
         while(next < arr.length){
            if( arr[curr] == arr[pre] + arr[next]){
                count++;
            }
            pre = curr;
            curr = next;
            next++;
         }
        System.out.println("Ans : " + count);
    }
}
