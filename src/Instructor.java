import java.util.*;

public class Instructor {

    String name;
    int number;
    String email;
    Set<String> taughtCourses = new HashSet<>();

    public Instructor(String name, int number, String email) {
        this.name = name;
        this.number = number;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getEmail() {
        return email;
    }
}
