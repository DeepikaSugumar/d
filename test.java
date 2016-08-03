package prime;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
				int i;
				Scanner s=new Scanner(System.in);
				i=s.nextInt();
				int fact=1;
				if(i==0)
				{
					System.out.println("Factorial is 1");
				}
				else
				{
					do
					{
						fact=fact*i;
						i--;
					}
					while(i>0);
				}
				System.out.println("Factorial is "+fact);



				

			}

		}