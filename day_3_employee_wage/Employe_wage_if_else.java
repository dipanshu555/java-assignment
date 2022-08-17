package day_3_employee_wage;

public class Employe_wage_if_else {
public static void main(String[] args) {
	int min = 0;
    int max = 2;
     
    int FULL_TIME_WAGE_PER_HOUR = 20;
    int PART_WAGE_PER_HOUR=10;
    int FULL_DAY_HOUR = 8;
    int PART_TIME_HOUR=8;

		int a  = (int)(Math.random()*(max-min+1)+min);
		System.out.println(a);

		int check =a;

		if(a==1){
		System.out.println("Employee is Full day present");
		int CALCULATE_WAGE_PER_HOUR_RESULT = FULL_TIME_WAGE_PER_HOUR * FULL_DAY_HOUR;
		System.out.println("Employee is Full day present total wage is :"+" "+CALCULATE_WAGE_PER_HOUR_RESULT);
		
		}else if(a==2){
			System.out.println("Employee is Half day present");
			int CALCULATE_WAGE_PER_HOUR_RESULT = PART_WAGE_PER_HOUR* FULL_DAY_HOUR;
			System.out.println("Employee is Half day present total wage is :"+" "+CALCULATE_WAGE_PER_HOUR_RESULT );
		}else{
		System.out.println("Employee is absent so daily wage is 0");
	}	
  }

}
	

	  
	    
	    
	   

