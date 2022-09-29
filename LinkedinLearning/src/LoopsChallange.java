import java.util.Scanner;

public class LoopsChallange {

	public static void main(String[] args) {
		String question = "What month is Halloween in?";
		String answer1 = "September";
		String answer2 = "October";
		String answer3 = "November";
		String correctAnswer = answer2.toLowerCase();
		
		Boolean isAnswerCorrect = false;
		
		while (!isAnswerCorrect) {
			System.out.println(question + " Answer with the corresponding answer number");
			System.out.println("1. " + answer1);
			System.out.println("2. " + answer2);
			System.out.println("3. " + answer3);
			Scanner scanner = new Scanner(System.in);
			String userAnswer = scanner.next();
			if (correctAnswer.equals(userAnswer.toLowerCase()) ) {
				isAnswerCorrect = true;
			}
			else {
				System.out.println("Tough luck! That was wrong.");
			}
		}
		System.out.println("Congrats! That's correct.");
		}
		

	}
