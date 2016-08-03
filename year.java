import java.util.Scanner;

public class alphabet {

   public static void main(String args[])
   {
        boolean isLeapYear = false;
        int year;
        System.out.println("Enter a year");
        Scanner s=new Scanner(System.in);
        year=s.nextInt();
		if(year % 400 == 0)
        {
            isLeapYear = true;
        }
        else if (year % 100 == 0)
        {
            isLeapYear = false;
        }
        else if(year % 4 == 0)
        {
            isLeapYear = true;
        }
        else
        {
            isLeapYear = false;
        }
 
        //Output the test result
        if(isLeapYear)
        {
            System.out.println("Year "+year+" is a Leap Year");
        }
        else
        {
            System.out.println("Year "+year+" is not a Leap Year");
        }
 