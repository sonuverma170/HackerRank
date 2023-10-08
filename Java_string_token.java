
// Using Regex, we can easily match or search for patterns in a text. Before searching for a pattern, we have to specify one using some well-defined syntax.

// In this problem, you are given a pattern. You have to check whether the syntax of the given pattern is valid.

// Note: In this problem, a regex is only valid if you can compile it using the Pattern.compile method.

// Input Format

// The first line of input contains an integer , denoting the number of test cases. The next  lines contain a string of any printable characters representing the pattern of a regex.

// Output Format

// For each test case, print Valid if the syntax of the given pattern is correct. Otherwise, print Invalid. Do not print the quotes.

// Sample Input

// 3
// ([A-Z])(.+)
// [AZ[a-z](a-z)
// batcatpat(nat
// Sample Output

// Valid
import java.util.Scanner;

public class Java_string_token {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
         scan.close();
        
        s = s.trim(); // so that .split() works properly
        
        /* Check special cases */
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }
        
        /* Split on all non-alphabetic characters */
        String [] words = s.split("[^a-zA-Z]+");
        
        /* Print output */
        System.out.println(words.length);
        for (String word : words) {
            System.out.println(word);
        }
        scan.close();
    }
}

