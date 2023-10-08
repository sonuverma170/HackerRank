

/**
 * InnerTestcase4
 */

import java.io.*;
public class Testcase4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
int i;
for(i=1;i<=10;i++){
   System.out.println(N+" x "+i+ " = "+i*N);
}
        bufferedReader.close();
    }
}


