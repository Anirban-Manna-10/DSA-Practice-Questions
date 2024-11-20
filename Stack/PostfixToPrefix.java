import java.util.Scanner;
import java.util.Stack;

public class PostfixToPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // String str = "A B C * + D +";
        String s = str.replaceAll("\\s", "");
        Stack<String> stk = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'  || ch >= 'A' && ch <= 'Z' || ch >= '1' && ch <= '9' ){
                stk.push(""+ ch);
            }else{
                String o1 = stk.pop();
                String o2 = stk.pop();
                stk.push( ch + o2 + o1 + "");
            }
        }
        System.err.println("Prefix : " + stk.peek());
    }
}
