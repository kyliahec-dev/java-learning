package StudentGradebook;
import java.util.Scanner;

public class StudentGradebook {
    public static void main(String[] args) {
        int[] grades = collectGrades();
    }
         public static int[] collectGrades() {
            //User input
            Scanner scanner = new Scanner(System.in);

            //Create container for grades
            int[] grades = new int[5];

            int newGrade;

            for(int count = 0;count<grades.length;count++){
                System.out.print("Enter grade number " + (count + 1) + ": ");
                newGrade = scanner.nextInt();
                grades[count] = newGrade;
            }
            return grades;
        }
}
