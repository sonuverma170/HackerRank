// Input Format

// The first line contains an integer, , denoting the number of queries.
// Each line  of the  subsequent lines contains three space-separated integers describing the respective , , and  values for that query.

// Constraints

// Output Format

// For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.

// Sample Input

import java.util.Scanner;

public class testcase5 {
    
       public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
                int cal = a;
            for(int j=0;j<n;j++)
            {
                cal+=(Math.pow(2,j)*b);
                
                System.out.print(cal+" ");
            }
             System.out.println();
        }
        in.close();
    }
}
