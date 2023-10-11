import java.util.*;

public class CourseService {
    Set<Course> courseList = new HashSet<>();

    public void listCourse(){
        for(Course course : courseList){
            System.out.print("*Course name: " + course.getName() + " *Course instructor: ");
            for(Instructor instructor : course.getCourseInstructor()){
                System.out.print(instructor.getName() + " *Enrolled students: ");
                for(Student students : course.getEnrolledStudents()){
                    System.out.print(students.getName() + " ");
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}
