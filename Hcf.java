package prime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Hcf 
		    {
		        public static void main(String args[])throws IOException
		        {
		        	int r,i,j;
				Scanner s=new Scanner(System.in);
				r=s.nextInt();
				System.out.println("Enter Row "+r);
				for(i=0;i<r;i++)
				{
					System.out.println(" ");

					for(j=0;j<=i;j++)
					{
						System.out.print("*");
					}
				
				}
				
			}

		}



