public class Merge_Strings_Alternately {
        // Function to merge two strings alternately
        public String mergeAlternately(String word1, String word2) {
            int i = 0;
            int max = Math.min(word1.length(), word2.length()); // Find the length of the shorter string
            StringBuilder sb = new StringBuilder(""); // Use StringBuilder for efficient string concatenation
            
            
            while (i < max) {
                sb.append(word1.charAt(i)); // Append character from word1
                sb.append(word2.charAt(i++)); // Append character from word2 and increment index
            }
    
            // Append remaining characters of word1 if any
            while (i < word1.length()) {
                sb.append(word1.charAt(i++));
            }
    
            // Append remaining characters of word2 if any
            while (i < word2.length()) {
                sb.append(word2.charAt(i++));
            }
    
            // Return the merged string
            return sb.toString();
        }
    
        public static void main(String[] args) {
            Merge_Strings_Alternately solution = new Merge_Strings_Alternately();
    
            // Test case 1
            String word1 = "abc";
            String word2 = "pqr";
            System.out.println("Merged string: " + solution.mergeAlternately(word1, word2)); // Expected output: "apbqcr"
    
            // Test case 2
            String word3 = "ab";
            String word4 = "pqrs";
            System.out.println("Merged string: " + solution.mergeAlternately(word3, word4)); // Expected output: "apbqrs"
    
            // Test case 3
            String word5 = "abcd";
            String word6 = "pq";
            System.out.println("Merged string: " + solution.mergeAlternately(word5, word6)); // Expected output: "apbqcd"
        }
}
