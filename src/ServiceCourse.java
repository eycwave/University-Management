import java.util.*;

public class ServiceCourses {
    Set<Course> courseList= new HashSet<>();
    Map<Integer, Course> numberPairing = new HashMap<>();

    public void listCourses(){
        for(Course courses : courseList){
            System.out.println("Kurs ismi: " + courses.getName());
        }
    }
}
