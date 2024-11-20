import java.util.HashSet;

public class findMaxProductPairWithSum18 {
    public static void main(String[] args) {
        int A[] = {20,16,2,1,5};
        int ans[] = new int[2];
        int max = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();
        int comp;
        for(int i : A){
            comp = 18 - i;
            if(set.contains(comp)){
                if(max < (i * comp)){
                    max = i * comp;
                    ans[0] = Math.max(i,comp);
                    ans[1] = Math.min(comp, i);
                }
                set.remove(comp);
            }else{
                set.add(i);
            }
        }
        System.out.println("Pair : " +  ans[0] + " , " +ans[1]);
    }
}
