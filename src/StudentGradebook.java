import java.util.Arrays;
import java.util.Scanner;

public class StudentGradebook {
    public static void main(String[] args) {
        //Create object for user count
        Scanner scanner = new Scanner(System.in);

        //Create container for grades
        int[] grades = new int[5];

        //User count
        int count = 0; //counter
        int newGrade = 0;

        //Variable used to store and calculate sum and average
        int total = 0;

        //Loop to collect 5 grades
        while (count < 5) {
            System.out.print("Enter grade number " + (count + 1) + ": ");
            newGrade = scanner.nextInt();
            grades[count] = newGrade;
            total += newGrade;
            System.out.println("Total: " + total);
            count++; //increment count to stop prompting the user after receiving 5 grades
    }
        System.out.println("Grades: " + Arrays.toString(grades));
        int avg = (total / grades.length);
        System.out.print("Average of grades is: " + avg);
    }
}
