
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex2 {
    
    public static void main(String[] args) {
        
           String regex = "(?i)\\b(\\w+)(\\s+\\1)+\\b";
        Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences>0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
             boolean findMatch = true;
            while (m.find()) {
                input = input.replaceAll(regex,"$1");
                  findMatch = false;
            }
            System.out.println(input);
             numSentences--;
        }
        
        in.close();
    }
    }
