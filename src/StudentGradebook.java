import java.util.Scanner;

public class StudentGradebook {
    public static void main(String[] args) {
        //Create object for user input
        Scanner scanner = new Scanner(System.in);

        //Create container for grades
        int[] grades = new int[5];

        //User input
        int input = 0; //counter

        //Variables used to store and calculate sum and average
        int total = 0;

        //Loop to collect user input for 5 grades
        while (input < 5) {
            System.out.print("Enter grade number " + (input + 1) + ": ");
            grades[input] = scanner.nextInt();
            input++; //increment input to stop prompting the user after receiving 5 grades
            total += input;
        }
        int avg = (total / grades.length);
        System.out.print("Average of grades is: " + avg);
    }
}
