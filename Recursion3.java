/*
Function Description
Complete the factorial function in the editor below. Be sure to use recursion.

factorial has the following paramter:
int n: an integer

Returns
 
int: the factorial of n
Note: If you fail to use recursion or fail to name your recursive function factorial or Factorial, you will get a score of 0.

Input Format

A single integer, n (the argument to pass to factorial).

Constraints

2 <= n <= 12

Your submission must contain a recursive function named factorial.
Sample Input

3
Sample Output

6
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

public static final Scanner sc= new Scanner(System.in);
    // Complete the factorial function below.
    static int factorial(int n) {
        if(n<=1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    public static void main(String agrs[]){
        int a=sc.nextInt();
        System.out.println(factorial(a));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.factorial(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
