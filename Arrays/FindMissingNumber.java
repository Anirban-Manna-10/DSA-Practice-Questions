public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = new int[] {6,1,5,3,2};
        int n = 6;
        //Find The missing no between 1 - n
        //Approach 2 - Formula - (sum of 1 - n = n(n-1) / 2)
        int sum = ( n * ( n + 1 ) ) / 2 ;
        System.out.print(sum);
        for(int i : arr){
            sum -= i;
        }
        System.out.println("Missing Value : " + sum);
        //Approach 2 - XOR oparetor
        int xor1 = 0, xor2 = 0;
        for(int i = 0 ; i < arr.length ; i++){
            xor1 = xor1 ^ (i+1);
            xor2 = xor2 ^ arr[i];
        }
        xor1 = xor1 ^ n;
        System.out.println("Missing Value : " + (xor1 ^ xor2));

    }
}
