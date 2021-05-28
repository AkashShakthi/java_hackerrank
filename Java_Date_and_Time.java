
/* 
The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.

You are given a date. You just need to write the method,getDay , which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Calendar;
import java.util.Arrays;
import java.util.List;

class Result {

  static List<String> days = Arrays.asList("SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY");
 
    public static String findDay(int month, int day, int year) {
        int y = year;
        int m = month;
        int d = day;
        
        Calendar c = Calendar.getInstance();
        c.set(y, m-1, d); 
            
        int p = c.get(Calendar.DAY_OF_WEEK);
        String s = days.get(p-1);
        return s;
        
        
    }

}
