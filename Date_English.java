import java.util.*;
import java.io.*;
public class Date_English 
{
    public static void main(String[] args) throws IOException
    {
    	 int day = 0 , month = 0 , year = 0;
    	 String English_Date = "";
    	 String english_day = "" , english_month = "" , english_year = "";
         Scanner sc = new Scanner(System.in);
         function_date f = new function_date();
         
         System.out.println("Enter the date in dd/mm/yyyy format");
         String date = sc.next();
         
         String var = date.charAt(0)+""+date.charAt(1);
         day = Integer.valueOf(var);
         var = date.charAt(3)+""+date.charAt(4);
         month = Integer.valueOf(var);
         var = date.charAt(6)+""+date.charAt(7)+""+date.charAt(8)+""+date.charAt(9);
         year = Integer.valueOf(var);
         
         if(day<=31 || month<=12 || ((year>=1000)&&(year<=2100)))
         {
        	 english_day = f.Day(day);
        	 english_month = f.month(month);
        	 english_year = f.year(year);
        	 English_Date = english_day + " " + english_month + " , " + english_year;
        	 System.out.println(English_Date);
         }
         else
         {
        	 System.out.println("You have printed a wrong date format!");
         }
         sc.close();
	}
}
