import java.util.HashMap;
public class function_date 
{
     public String Day(int day_input)
     {
    	 String day_english ="";
    	 
    	 HashMap <Integer, String> map1 = new HashMap <Integer , String> ();     // For Unit's Place
    	 
    	 HashMap <Integer, String> map2 = new HashMap <Integer , String> ();     // For Ten's Place
    	 
    	 HashMap <Integer, String> map3 = new HashMap <Integer , String> ();     // For Taking the Day from 11 to 19
    	 
    	 map1.put(0,"");
    	 map1.put(1,"one");
    	 map1.put(2,"two");
    	 map1.put(3,"three");
    	 map1.put(4,"four");
    	 map1.put(5,"fifth");
    	 map1.put(6,"six");
    	 map1.put(7,"seven");
    	 map1.put(8,"eight");
    	 map1.put(9,"nine");
    	 
    	
    	 map2.put(2,"twenty");
    	 map2.put(3,"thirty");
    	 
    	 map3.put(1,"eleven");
    	 map3.put(2,"twelve");
    	 map3.put(3,"thirteen");
    	 map3.put(4,"fourteen");
    	 map3.put(5,"fifteen");
    	 map3.put(6,"sixteen");
    	 map3.put(7,"seventeen");
    	 map3.put(8,"eighteen");
    	 map3.put(9,"nineteen");
    	 
    	 int unit_day = day_input % 10;
    	 int Tens_day = day_input / 10;
    	 
    	 if(Tens_day == 1 && unit_day == 0)
    	 {
    		 day_english = "Tenth";
    	 }
    	 else
    	 if(Tens_day == 1)
    	 {
    		 day_english = map3.get(unit_day);
    	 }
    	 else
         if(Tens_day == 0)
    	 {
    		 day_english = map1.get(unit_day);	 
         }
    	 else
    	 {
    		 day_english = map2.get(Tens_day)+""+map1.get(unit_day);
    	 }  	 
    	 
    	 return day_english;
     }
   
     
     public String month(int month_input)
     {
    	 String month_english = "";
    	 
    	 HashMap <Integer , String> map1 = new HashMap<Integer , String>();
    	 
    	 HashMap <Integer , String> map2 = new HashMap<Integer , String>();
    	 
    	 map1.put(1, "January");
    	 map1.put(2, "February");
    	 map1.put(3, "March");
    	 map1.put(4, "April");
    	 map1.put(5, "May");
    	 map1.put(6, "June");
    	 map1.put(7, "July");
    	 map1.put(8, "August");
    	 map1.put(9, "September");
    	 
    	 map2.put(0 , "October");
    	 map2.put(1, "November");
    	 map2.put(2, "December");
    	 
    	 int unit_month = month_input % 10;
    	 int Tens_month = month_input / 10;
    	 
    	 if(Tens_month == 1)
    	 {
    		 month_english = map2.get(unit_month);
    	 }
    	 else
    	 {
    		 month_english = map1.get(unit_month);
    	 }
    	     	 
    	 return month_english;
     }
     
     
     public String year(int year_input)
     {
    	 String year_english = "";
    	 
    	 HashMap<Integer , String> map1 = new HashMap<Integer , String> ();
    	 
    	 HashMap<Integer , String> map2 = new HashMap<Integer , String> ();
    	 
    	 HashMap<Integer , String> map3 = new HashMap<Integer , String> ();
    	 
    	 HashMap<Integer , String> map4 = new HashMap<Integer , String> ();
    	 
    	 map1.put(0,"");
    	 map1.put(1,"one");
    	 map1.put(2,"two");
    	 map1.put(3,"three");
    	 map1.put(4,"four");
    	 map1.put(5,"five");
    	 map1.put(6,"six");
    	 map1.put(7,"seven");
    	 map1.put(8,"eight");
    	 map1.put(9,"nine");
    	     	
    	 map2.put(2,"twenty");
    	 map2.put(3,"thirty");
    	 map2.put(4,"forty");
    	 map2.put(5,"fifty");
    	 map2.put(6,"sixty");
    	 map2.put(7,"seventy");
    	 map2.put(8,"eighty");
    	 map2.put(9,"ninety");

    	 map3.put(0, "");
    	 map3.put(1,"Eleven");
    	 map3.put(2,"Twelve");
    	 map3.put(3,"Thirteen");
    	 map3.put(4,"Fourteen");
    	 map3.put(5,"Fifteen");
    	 map3.put(6,"Sixteen");
    	 map3.put(7,"Seventeen");
    	 map3.put(8,"Eighteen");
    	 map3.put(9,"Nineteen");
    	 
    	 map4.put(1, "One Thousand");
    	 map4.put(2,"Two Thousand");
    	 
    	 int unit_year = year_input % 10;
         int Tens_year = (year_input / 10) % 10;
         int Hundreds_year = ((year_input / 10)/10) % 10;
         int Thousands_year = (((year_input / 10)/10)/10) % 10;
         
         if(Hundreds_year == 0 && Tens_year == 0 && unit_year ==0)
         {
        	 year_english = map4.get(Thousands_year);
         }
         else
         if(Thousands_year == 2 && Tens_year == 1)
         {
        	 year_english = map4.get(2) + " and " + map3.get(unit_year);
         }
         else
         if(Thousands_year == 2 && Tens_year == 1 && unit_year==0)
         {
        	 year_english = map4.get(2) + " and Ten";
         }
         else
         if(Tens_year == 1 && Hundreds_year != 0)
         {
        	 year_english = map3.get(Hundreds_year) +" hundred and "+ map2.get(Tens_year) +" "+ map1.get(unit_year);
         }
         else
         if(Thousands_year == 1 && Hundreds_year == 0 && Tens_year == 1 & unit_year == 0)
         {
        	 year_english = map4.get(1) + " and ten";
         }
         else
         if(Thousands_year == 1 && Tens_year == 1 & unit_year == 0)
         {
        	 year_english = map3.get(Hundreds_year) + " hundred and ten";
         }
         if(Thousands_year == 1 && Tens_year == 1)
         {
        	 year_english = map3.get(Hundreds_year) + " hundred "+ map3.get(Tens_year); 
         }
         else
         if(Thousands_year == 1 && Tens_year == 0)
         {
        	 year_english = map3.get(Hundreds_year) + " hundred "+ map1.get(unit_year);
         }
         else
         if(Thousands_year == 1)
         {
        	 year_english = map3.get(Hundreds_year) + " hundred "+ map2.get(Tens_year) +" "+ map1.get(unit_year);
         }
         
    	 return year_english;
    	 
     }
     
     
}
