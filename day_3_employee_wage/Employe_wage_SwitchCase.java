package day_3_employee_wage;

public class Employe_wage_SwitchCase {
	 public static void main(String[] args) {
		 int min = 0;
		    int max = 2;
		     
		    int FULL_TIME_WAGE_PER_HOUR =20;
		    int PART_WAGE_PER_HOUR=10;
		    int FULL_DAY_HOUR = 8;
		    int PART_TIME_HOUR= 8;
		    int MONTHLY_FULL_TIME_WAGE;

				int a  = (int)(Math.random()*(max-min+1)+min);
				System.out.println(a);

				int check =a;

				    switch (check) {
				   	case 1:
				   		System.out.println("Employee is present.");
					   	int CALCULATE_WAGE_PERDAY = FULL_TIME_WAGE_PER_HOUR * FULL_DAY_HOUR;
						System.out.println("Employee is Full day present, total wage is :"+" "+CALCULATE_WAGE_PERDAY);

						MONTHLY_FULL_TIME_WAGE=CALCULATE_WAGE_PERDAY*20;
						System.out.println("Monthly wages " +" "+MONTHLY_FULL_TIME_WAGE);

						int empWage = (FULL_TIME_WAGE_PER_HOUR *100);
						System.out.println("Full time employee wage for a month i.e 100hrs is "+ empWage);
					    break;
				   	case 2:
				   		System.out.println("Employee is present for part time.");
						int CALCULATE_WAGE_PERDAY1 = PART_WAGE_PER_HOUR* FULL_DAY_HOUR;
						System.out.println("Employee is Half day present ,total wage is :"+" "+CALCULATE_WAGE_PERDAY1);

						MONTHLY_FULL_TIME_WAGE=CALCULATE_WAGE_PERDAY1*20;
						System.out.println("Monthly wages " +" "+MONTHLY_FULL_TIME_WAGE);

						int empWage1 = (PART_WAGE_PER_HOUR*100);
						System.out.println("Full time employee wage for a month i.e 100hrs is "+ empWage1);
					break;
				   	default:
				   		System.out.println("Employee is absent.");
				   	}		
		        }
		    }

	
		
	
		 
		    
