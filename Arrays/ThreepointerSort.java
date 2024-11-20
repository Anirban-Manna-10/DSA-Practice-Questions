public class ThreepointerSort {
    public static void main(String[] args) {
        int arr[]= {1, 0, 1, 0, 0, 2, 1, 0, 2, 1};
        int st = -1 , mid = 1 , end = arr.length;

        while(mid < end){
            if(arr[mid] == 0){
                st++;
                swap(arr, mid, st);
            }else if(arr[mid] == 2){
                end--;
                swap(arr, mid, end);
            }else{
                mid++;
            }
        }
        for(int i : arr){
            System.out.print(i + ", ");
        }
    }

    public static void swap(int arr[],int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] =  temp;
    }
}