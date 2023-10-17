import java.util.*;

public class CourseService {
    private Set<Course> courseList = new HashSet<>();

    public void addCourse(Course course){
        courseList.add(course);
        System.out.println("Course added.");
    }

    public Course getCourseByID(int id){
        for(Course c : courseList){
            if(c.getNumber()==id){
                return c;
            }
        }
        return null;
    }

    public Set<Course> getCourseList(){
        return courseList;
    }
}
