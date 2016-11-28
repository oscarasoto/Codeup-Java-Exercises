import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;
import java.lang.String;


/**
 * Display a sorted list of student scores.
 *
 * @author Oscar Soto on 11/28/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */
public class StudentScores {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String addMoreStudents;
        List<Student> students = new ArrayList<>();

        System.out.println("Welcome to the Students Application");

        do {

            students.add(getStudentData());

            System.out.println("Do you have another student? (yes/no)");
            addMoreStudents = input.nextLine();

        } while (addMoreStudents.equalsIgnoreCase("yes"));

        Collections.sort(students);

        showSortedResults(students);

    }

    // input
    private static Student getStudentData() {
        Scanner input = new Scanner(System.in);
        String lastName;
        String firstName;
        int score;

        System.out.println("Please enter Last Name: ");
        lastName = input.next();
        System.out.println("Please enter First Name: ");
        firstName = input.next();
        System.out.println("Please enter student score: ");
        score = input.nextInt();

        return new Student(lastName, firstName, score);
    }

    // output
    private static void showSortedResults(List<Student> students) {
        System.out.println("Sorted Result: ");
        for(Student student : students){
            System.out.println("=======================================");
            System.out.println("Student name: " + student.lastName + " score: " + student.score);
        }
    }


}
