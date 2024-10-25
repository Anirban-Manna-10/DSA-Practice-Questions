
import java.util.Scanner;

public class MInMAx {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
        System.out.println("Enter values :");
        for(int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();
            min = Math.min(min,arr[i]);
            max = Math.max(max, arr[i]);
        }
        System.err.println("Min : " + min + 
        "  \n Max : " + max);
    }
}
