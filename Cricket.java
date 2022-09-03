import java.util.Scanner;
public class Cricket {
	public static void main(String[] args) {
		String[] players = new String[11];
	    	int[] scores = new int[11];

	        Scanner scanner = new Scanner(System.in);

	        for (int i = 0; i < 11; i++) {
	            System.out.println("Enter cricketer name  :");
	            String name = getStringInput(scanner);
	            players[i] = name;

	            System.out.println("Enter score of ODI  :");
	            int score = getIntegerInput(scanner);
	            scores[i] = score;
	        }

	        int totalScore = 0;

	        for (int score : scores) {
	            totalScore = totalScore + score;
	        }

	        System.out.println("Total score  :" + totalScore);

	        double avg = totalScore / 11d;

	        double avgRounded = Math.round(avg*100.0)/100.0;

	        System.out.println("Average score  :" + avgRounded );
	    }

	    private static String getStringInput(Scanner scanner) {
	        return scanner.nextLine();
	    }

	    private static int getIntegerInput(Scanner scanner) {
	        try {
	            return Integer.parseInt(scanner.nextLine().trim());
	        } catch (NumberFormatException e) {
	            System.out.println("You have entered wrong input, please enter a number :-");
	            return getIntegerInput(scanner);
	        }
	    }
	}

