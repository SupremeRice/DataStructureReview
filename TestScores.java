import java.util.Random;
import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int randomNum = random.nextInt(11) + 1;
        final int SIZE;
        SIZE = randomNum;
        int[] testScore = new int[SIZE];
        char[] letterGrades = new char[SIZE];
        System.out.println("Enter your " + SIZE + " test scores");

        for (int i = 0; i < testScore.length; i++) {
            System.out.println("Enter test " + i + " score: ");
            testScore[i] = scanner.nextInt();
        }

        for (int i = 0; i < testScore.length; i++) {
            letterGrades[i] = getLetterGrade(testScore[i]);
        }

        printGrades(testScore, letterGrades);
        printHighestScore(testScore);
        printLowestScore(testScore);
        printAverageScore(testScore);
        scanner.close();
    }

    public static char getLetterGrade(int score) {
        if (score >= 90 && score <= 100) {
            return 'A';
        } else if (score >= 80 && score < 90) {
            return 'B';
        } else if (score >= 70 && score < 80) {
            return 'C';
        } else if (score >= 60 && score < 70) {
            return 'D';
        } else {
            return 'F';
        }

    }

    public static void printAverageScore(int[] testScore) {
        int avg = 0;

        for (int i = 0; i < testScore.length; i++) {
            avg = avg + testScore[i];
        }
        double totalAvg = ((double) avg / testScore.length);
        System.out.println("Average: " + totalAvg);
    }


    public static void printLowestScore(int[] testScore) {
        int lScore = testScore[0];
        for (int i = 0; i < testScore.length; i++) {
            if (lScore > testScore[i]){
                lScore = testScore[i];
            }
        }
        System.out.println("The lowest score: " + lScore);

    }


    public static void printHighestScore(int[] testScore) {
        int hScore = testScore[0];
        for (int i = 0; i < testScore.length; i++) {
            if (hScore < testScore[i]) ;
            hScore = testScore[i];
        }
        System.out.println("The highest score: " + hScore);
    }

    public static void printGrades(int[] testScore, char[] letterGrades) {
        System.out.println("--------Score Grade--------");
        for (int i = 0; i < testScore.length; i++) {
            System.out.println(testScore[i] + "      " + letterGrades[i]);
        }


    }

}


