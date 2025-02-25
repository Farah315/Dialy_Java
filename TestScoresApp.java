//فرح خليل حسن طبل
package farah;
import java.util.Scanner;
public class TestScoresApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter three test scores
        System.out.print("Enter the first test score: ");
        double score1 = scanner.nextDouble();

        System.out.print("Enter the second test score: ");
        double score2 = scanner.nextDouble();

        System.out.print("Enter the third test score: ");
        double score3 = scanner.nextDouble();

        // Create a TestScores object
        TestScores testScores = new TestScores(score1, score2, score3);

        // Calculate and display the average of the test scores
        double average = testScores.calculateAverage();
        System.out.println("\nThe average of the test scores is: " + average);

        scanner.close();
    }
}    

