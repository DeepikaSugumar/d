package prime;

import java.util.Scanner;

public class powerv {

	public static void main(String[] args) {
		 int num = 0;
	        int pow = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
        pow=sc.nextInt();
        
        System.out.println(Math.pow(num,pow));


	}

}
