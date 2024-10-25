
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =  sc.nextLine();

        int i = 0, j = str.length()-1;
        while( i <= j){
            if(!(str.charAt(i++) == str.charAt(j--))){
                System.out.println("Not Palindrome");
                return;
            }
        }
        System.out.println("Palindrome");  
    }
}
