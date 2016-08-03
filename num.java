package prime;

import java.util.Scanner;

public class alphabet {
	public static void print_sums()
	{
				int sum = 0 ;
				int num;
				System.out.println("Enter the number");
				Scanner s=new Scanner(System.in);
				num=s.nextInt();
		         for(int i = 1 ; i <= num ; i++){
		                sum = sum + i ;
		             }
		             System.out.println( sum) ;
		             sum = 0 ;
		         }

		   

		    public static void main(String args[])
		    {
		        print_sums() ;


		    }
		}