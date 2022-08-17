package day_5_basic_program;
import java.util.Scanner;
public class PowerOf2 {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value between 0 to 31");
		int n=sc.nextInt();
		if(0<=n && n<31)
	{
			for(int i=0;i<n+1;i++)
		{
		System.out.println("2 to the power "+i+" is"+Math.pow(2, i));
		}
		}
		else
		{
			System.out.println("please enter a any value in given range");
		}
	}
}

