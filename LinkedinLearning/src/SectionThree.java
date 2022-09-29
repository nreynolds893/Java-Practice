import java.util.Scanner;

public class SectionThree {

	public static void main(String[] args) {
		System.out.println("Select a number");
		Scanner scanner = new Scanner(System.in);
		
		//int numberSelected = scanner.nextInt();
		int numberSelected = 2;
		System.out.println("Your number is " + numberSelected);
		
		if (numberSelected < 5) {
			System.out.println("Have a good day!");
		} else {
			System.out.println("Unlucky");
		}
		
//		System.out.println("Do you want to repeat the song?");
//		Scanner scannerBoolean = new Scanner(System.in);
		Boolean repeatSong = true;
		
		while (repeatSong) {
			System.out.println("Do you want to repeat the song? Reply 'yes' ");
			Scanner scannerBoolean = new Scanner(System.in);
			String userInput = scannerBoolean.next();
			if (userInput.equals("yes")) {
				repeatSong = true;
				System.out.println("Repeating song");
			} else {
				repeatSong = false;
			}
			}
		System.out.println("Playing next song");
			
		} 

	}
	
