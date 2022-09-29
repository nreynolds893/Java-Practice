import java.util.*;

public class SectionFive {
	
	public static void builtInFunctions() {
		double result = Math.pow(2, 5);
		System.out.println(result);
	}
	
	public static double calculateMealPrice(double listedMealPrice, 
										  double tipRate,
										  double taxRate) {
		double tip = tipRate * listedMealPrice;
		double tax = taxRate * listedMealPrice;
		double result = tip + tax + listedMealPrice;		
		return result;
		
	}
	
	public static void announceTeaTime() {
		System.out.println("Waiting for tea time...");
		Scanner scanner = new Scanner(System.in);
		scanner.next();
		System.out.println("It's tea time!");
	}
	
	public static void main(String[] args) {
		
		//announceTeaTime();
		
//		double groupTotalMealCost = calculateMealPrice(100, 0.2, 0.08);
//		double individualCost = groupTotalMealCost / 5;
//		System.out.println("Your total meal price is £" + groupTotalMealCost);
//		System.out.println("£" + individualCost + " each");
		
		builtInFunctions();
	}

}
