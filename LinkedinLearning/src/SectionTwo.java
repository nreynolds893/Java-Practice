import java.util.*;

public class SectionTwo {

	public static void main(String[] args) {
		int studentAge = 22;
		double studentGPA = 3.45;
		boolean hasPerfectAttendance = true;
		String firstname = "Naomi";
		String lastname = "Reynolds";
		char studentFirstInitial = firstname.charAt(0);
		char studentLastInitial = lastname.charAt(0);

		System.out.println(firstname + ' ' + lastname +  " (" + studentFirstInitial + studentLastInitial + ") "
				+ "has a GPA of: " + studentGPA);
		
		System.out.println("What would you like to update GPA to? ");
		Scanner input = new Scanner(System.in);
		studentGPA = input.nextDouble();
		
		
		System.out.println(firstname + ' ' + lastname + " new GPA = " + studentGPA);
	}

}
