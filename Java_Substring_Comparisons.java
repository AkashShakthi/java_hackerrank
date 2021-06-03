/*
Given a string, s , and an integer, k, complete the function so that it finds the lexicographically smallest and largest substrings of length k.

Function Description

Complete the getSmallestAndLargest function in the editor below.

getSmallestAndLargest has the following parameters:

string s: a string
int k: the length of the substrings to find

Returns

string: the string ' + "\n" + ' where and are the two substrings
Input Format

The first line contains a string denoting s .
The second line contains an integer denoting k.

Sample Input 0
welcometojava
3

Sample Output 0
ava
wel
*/
import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        
        String substring = s.substring(0, k);
        String smallest = substring;
        String largest = substring;
        
        for (int i = 1; i <= s.length() - k; i++) {
            // Create a substring of length 'k'
            substring = s.substring(i, i + k);
                
            // If current substring is lexicographically smaller than 'smallest'
            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }
            
            // If current substring is lexicographically larger than 'largest'
            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}