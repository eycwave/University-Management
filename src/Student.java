import java.util.HashSet;
import java.util.Set;

public class Student {
    private String name;
    private int number;
    private String email;
    private Set<String> enrolledCourses = new HashSet<>();

    public Student() {
        this.name = "Bilinmiyor";
        this.number = 0;
        this.email = "Bilinmiyor";
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<String> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(Set<String> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }
}
