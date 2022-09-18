package day_6_logical_program;
public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.println("WELCOME TO THE FIBONACCI SERIES PROGRAM");
		 int n1=0,n2=1,n3,i,count=20;    
		 System.out.print(n1+" "+n2);    
		    
		 for(i=2;i<count;++i)   
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
		  
		}}  
	


