import java.util.*;

public class Course {
    private String name;
    private int number;
    private Set<Instructor> courseInstructor = new HashSet<>();
    private Set<Student> enrolledStudents = new HashSet<>();

    public Course() {
    }

    public Course(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Set<Instructor> getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(Set<Instructor> courseInstructor) {
        this.courseInstructor = courseInstructor;
    }

    public Set<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(Set<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
}
