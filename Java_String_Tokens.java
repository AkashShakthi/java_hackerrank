/*
Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.

Note: You may find the String.split method helpful in completing this challenge.

Sample Input

He is a very very good boy, isn't he?
Sample Output

10
He
is
a
very
very
good
boy
isn
t
he
*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        scan.close();
        
        if(s.length() == 0){
            System.out.println(0);
        }
        else{
            // Strip out non-word characters and replace with whitespace, trim leading/trailing whitespace
            s = s.replaceAll("[^\\p{Alpha}]+", " ").trim();
            
            if(s.isEmpty()) {
                // String contains no valid tokens
                System.out.println(0);
            }
            else {
                // Split the string into valid tokens
                String[] strings = s.split("\\p{Space}+");
                
                // Print number of tokens
                System.out.println(strings.length);
                
                // Print each token
                for(String str : strings){
                    System.out.println(str);
                }
            }
        }
    }
}

