class Student {
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

public class Tasksheet10 {
    public static void main(String[] args) {

        Student[] student = new Student[] {
            new Student("Morgan", "Freeman"),
            new Student("Brad", "Pitt"),
            new Student("Kevin", "Spacey")
        };

        for (Student s : student) {
            System.out.println(s.getFirstName() + " " + s.getLastName());
        }
    }
}