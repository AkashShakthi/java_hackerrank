/*
Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string

Sample Input 0

anagram
margana
Sample Output 0

Anagrams
*/


import java.util.Scanner;

public class Solution {


    static boolean isAnagram(String a, String b) {
     if (a.length() != b.length()) return false;
         
     a =a.toLowerCase();
     b = b.toLowerCase();
    
     int [] temp = new int [Character.MAX_VALUE]; 
     int summ = 0;



        for (int i = 0; i < a.length(); i++){
            summ += ++temp [a.charAt(i)] <= 0 ? -1 : 1;
            summ += --temp [b.charAt(i)] >= 0 ? -1 : 1;
        }

        return summ == 0;
 
    }

    public static void main(String[] args) {
   
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}