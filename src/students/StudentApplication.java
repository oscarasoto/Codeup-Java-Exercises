package students;

import console.Console;
import validation.NonEmptyString;
import validation.NumberInRange;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StudentApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        PrintStream output = System.out;
        Console console = new Console(input, output);
        ArrayList<Student> students = new ArrayList<>();
        String moreStudents;

        do {
            String firstName = console.askForText(
                "Student first name: ",
                new NonEmptyString()
            );
            String lastName = console.askForText(
                "Student last name: ",
                new NonEmptyString()
            );
            int score = console.askForNumber(
                "Student score: ",
                new NumberInRange(1, 100)
            );

            Student newStudent = new Student(firstName, lastName, score);
            students.add(newStudent);

            moreStudents = console.askForText(
                "Do you want to add another students (y/n)",
                new NonEmptyString()
            );

        } while (moreStudents.equalsIgnoreCase("y"));

        students.sort(
            (firstStudent, secondStudent) -> firstStudent.compareTo(secondStudent)
        );

        for (Student student: students) {
            output.println(student.fullName() + " " + student.score());
        }
    }
}
