
package farah;
import java.util.Scanner;
public class TestScoresApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first test score: ");
        double score1 = scanner.nextDouble();

        System.out.print("Enter the second test score: ");
        double score2 = scanner.nextDouble();

        System.out.print("Enter the third test score: ");
        double score3 = scanner.nextDouble();

        TestScores testScores = new TestScores(score1, score2, score3);

        double average = testScores.calculateAverage();
        System.out.println("\nThe average of the test scores is: " + average);

    }
}    

