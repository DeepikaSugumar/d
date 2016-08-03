package prime;
import java.util.Scanner;
public class powerv 
{
	public static void main( String[] args)
	{ 
	int num1,num2;
	int sum=0;
		System.out.println("Enter a first number");
		Scanner s=new Scanner(System.in);
		num1=s.nextInt();
		System.out.println("Enter a second number");
		num2=s.nextInt();
		sum=num1+num2;
		System.out.println(sum);
	}
	}