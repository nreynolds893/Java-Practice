import java.util.*;

public class FunctionChallange {
	
	public static double calculateSalary(double hoursWorkedPerWeek,
										 double ratePerHour,
										 int holidays) {
		
		if (hoursWorkedPerWeek < 0) {
			return -1;
			
		}
		
		if (ratePerHour < 0) {
			return -1;
		}

		
		double salary = hoursWorkedPerWeek * ratePerHour;
		double unpaidTime = holidays * ratePerHour * 8;
		return (salary * 52) - unpaidTime;
		
	}
	
	public static void main(String[] args) {
		
//		Scanner getHours = new Scanner(System.in);
//		double userHours = getHours.nextDouble();
//		
//		Scanner getHours = new Scanner(System.in);
//		double userHours = getHours.nextDouble();
//		
		
		double salaryTotal = calculateSalary(40, 15, 8);
		System.out.println("Your salary this year is £" + salaryTotal);

	}

}
