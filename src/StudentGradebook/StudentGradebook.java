package StudentGradebook;
import java.util.Scanner;

public class StudentGradebook {
    public static void main(String[] args) {
        int[] grades = collectGrades();
        double avg = calculateAverage(grades);
        int highest = findHighest(grades);
        int lowest = findLowest(grades);
    }
         public static int[] collectGrades() {
            //User input
            Scanner scanner = new Scanner(System.in);

            //Create container for grades
            int[] grades = new int[5];

            int newGrade;

            for(int count = 0;count < grades.length;count++){
                System.out.print("Enter grade number " + (count + 1) + ": ");
                newGrade = scanner.nextInt();
                grades[count] = newGrade;
            }
            return grades;
        }
        public static double calculateAverage(int[] grades){
            double total = 0;

            for (int count = 0; count < grades.length; count++){
                total = grades[count] + total;
            }
            return total / grades.length;
        }
        public static int findHighest(int[] grades) {
            int highest = grades[0];

            for (int count = 0; count < grades.length; count++){
                if (grades[count] > highest){
                    highest = grades[count];
                }
            }
            return highest;
        }
        public static int findLowest(int[] grades) {
            int lowest = grades[0];

            for (int count = 0; count < grades.length; count++){
                if (grades[count] < lowest){
                    lowest = grades[count];
                }
            }
            return lowest;
        }
    }
