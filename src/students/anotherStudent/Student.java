package students.anotherStudent;

/**
 * students.anotherStudent.Student Data
 *
 * @author Oscar Soto on 11/28/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */

class Student implements Comparable<Student> {
    String lastName;
    String firstName;
    int score;

    //constructor

    Student(String lastName, String firstName, int score){
        this.lastName = lastName;
        this.firstName = firstName;
        this.score = score;

    }


    @Override
    public int compareTo(Student other) {

        return (this.score < other.score ? -1 :
                (this.score == other.score ? 0 : 1));

        // return -1 if the other student has a better score than this
        // return 0 if students are equal
        // return 1 if this student has a greater score thant the other


    }
}
