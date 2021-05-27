/*
In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes. An if-else statement has the following logical flow:

Task
Given an integer,n , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  2 to 5, print Not Weird
If  is even and in the inclusive range of 6 to 20, print Weird
If  is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format

A single line containing a positive integer, n.

Constraints

1<=n<=100


*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        
        if(N % 2 == 0){
            if((2 <= N) && ( N <= 5 )){
                System.out.println("Not Weird");
            }
            if((6<=N) && (N<=20)){
                System.out.println("Weird");
            }
            if(20<N){
                System.out.println("Not Weird");
            }
        }else{
            System.out.println("Weird");
        }
    }
}
