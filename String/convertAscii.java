public class convertAscii {
    public static void main(String[] args) {
        //String
        int sum = 0; 
        String str = "aAbcd";
        for(char ch : str.toCharArray()){
            sum += ch;
        }
        System.out.println("The ASCII Value will be : " + sum);
    }
}




