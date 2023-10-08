// The first line contains an integer, , denoting the number of test cases.
// Each test case, , is comprised of a single line with an integer, , which can be arbitrarily large or small.

// Output Format

// For each input variable  and appropriate primitive , you must determine if the given primitives are capable of storing it. If yes, then print:

// n can be fitted in:
// * dataType
// If there is more than one appropriate data type, print each one on its own line and order them by size (i.e.: ).

// If the number cannot be stored in one of the four aforementioned primitives, print the line:

// n can't be fitted anywhere.

import java.util.Scanner;

public class Testcase6 {
       public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)
                System.out.println("* byte");
                   if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE){System.out.println("* short");}
                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE){System.out.println("* int");}
                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE){System.out.println("* long");}
                
                //Complete the code
                
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
