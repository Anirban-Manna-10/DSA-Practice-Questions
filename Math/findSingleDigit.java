public class findSingleDigit {
    public static void main(String[] args) {
        int n = 41;
        System.out.println("The code must be : " + convert(n));
    }

    public static int convert(int n) {
        int sum = 0;
        while(n > 0){
            sum += (n % 10);
            n /= 10; 
        }
        if(sum >= 10){
            return convert(sum);
        }else{
            return sum;
        }
    }
}
