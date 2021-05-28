
/* 

In this problem you will test your knowledge of Java loops. Given three integers a, b, and n, output the following series:
a+20b,a+20b+21b,......,a+20b+21b+...+2n−1b
Input Format
The first line will contain the number of integers, t. Each of the next t lines will have three integers, a, b, and n.
Constraints:
0≤a,b≤50
1≤n≤15
Output Format
Print the answer to each test case in seperate lines.

*/
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int value;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int calc = a;
            for(int j=0;j<n;j++)
            {
                calc+=(Math.pow(2,j)*b);
                System.out.print(calc+" ");
            }
            System.out.println();
       
        }
        
        
        in.close();
    }
}
