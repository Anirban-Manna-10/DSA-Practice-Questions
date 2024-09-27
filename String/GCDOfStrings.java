class GCDOfStrings {

    // Function to find the greatest common divisor of two strings
    public String gcdOfStrings(String str1, String str2) {
        // Check if str1 + str2 equals str2 + str1
        // This ensures both strings can form a common divisor
        if ((str1 + str2).equals(str2 + str1)) {
            // Find the substring of str2 from index 0 to the gcd of their lengths
            return str2.substring(0, gcd(str1.length(), str2.length()));
        } else {
            // If the concatenated strings don't match, return an empty string
            return "";
        }
    }

    // Compute the greatest common divisor (GCD) of two integers
    public static int gcd(int a, int b) {
        // Base case: if b is 0, return a
        // Otherwise, recursively compute gcd(b, a % b)
        return (b == 0) ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        GCDOfStrings solution = new GCDOfStrings();

        // Test case 1
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println("GCD of \"" + str1 + "\" and \"" + str2 + "\" is: " + solution.gcdOfStrings(str1, str2));

        // Test case 2
        String str3 = "ABABAB";
        String str4 = "ABAB";
        System.out.println("GCD of \"" + str3 + "\" and \"" + str4 + "\" is: " + solution.gcdOfStrings(str3, str4));

        // Test case 3
        String str5 = "LEET";
        String str6 = "CODE";
        System.out.println("GCD of \"" + str5 + "\" and \"" + str6 + "\" is: " + solution.gcdOfStrings(str5, str6));
    }
}
