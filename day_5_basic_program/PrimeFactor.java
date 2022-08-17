package day_5_basic_program;
import java.util.Scanner;
public class PrimeFactor {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in); // create object

	        System.out.println("Enter number");

	        int n = sc.nextInt();

	        System.out.println("Prime factors for the given numbers:");

	        // using for loop

	        for(int i=2;i<=n;i++)
	        {
	            // using while loop

	            while(n%i==0)

	            {
	                n=n/i;

	                System.out.println(i+"");
	            }
	        }

	    }
	}

