public class fillisFunction {
    public static void main(String[] args) {
        int n = 3;
        System.out.println("Ans : " + fillsFunction(n));
    }
    public static int fillsFunction(int n){
        if(n <= 1)
            return 1;
        int part1 = fillsFunction(n - 1) + 7 * fillsFunction(n - 2) + (n / 4);
        int part2 = (int) Math.exp(9) + 7;
        return (part1 % part2);
    }
}
