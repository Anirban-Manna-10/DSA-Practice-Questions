class Solution {
    public void sort012(int[] arr) {
        int low = 0 , p = 0 , high = arr.length - 1 , temp;
        while(p < arr.length && p <= high){
            if(arr[p] < 1){
                temp = arr[low];
                arr[low] = arr[p];
                arr[p] = temp;
                low++;
                p++;
            }else if(arr[p] > 1){
                temp = arr[high];
                arr[high] = arr[p];
                arr[p] = temp;
                high--;
            }else{
                p++;
            }
        }
    }
}