
package students;

class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private int score;

    Student(String firstName, String lastName, int score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }

    void changeScore(int newScore) {
        if (1 > newScore || newScore > 100) {
            throw new IllegalArgumentException(
                "Score must be a number between 1 and 100"
            );
        }
        score = newScore;
    }

    public String fullName() {
        return firstName + " " + lastName;
    }

    public int score() {
        return score;
    }

    @Override
    public int compareTo(Student another) {
        int lastNameComparison = lastName.compareTo(another.lastName);

        if (lastNameComparison != 0) {
            return  lastNameComparison;
        }

        return firstName.compareTo(another.firstName);
    }
}
