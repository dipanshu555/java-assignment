package day_5_basic_program;

public class FlipCoin {
	public static void main(String args[]){
		
     for(int i=0 ; i<9 ; i++) {
		double randomvalue;
     randomvalue = Math.random();
		System.out.println(randomvalue);

		if(randomvalue < 0.5){
		System.out.print("TAILS");
		}
		else{
		System.out.print("HEADS");
		  }
	   }
	}
}