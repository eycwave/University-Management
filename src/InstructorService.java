import java.util.*;

public class InstructorService {
    Set<Instructor> instructorList = new HashSet<>();
    public void teachCourse(Instructor instructor, Course course){
        if(course.getCourseInstructor().isEmpty()){
            instructor.getTaughtCourses().add(course);
            course.getCourseInstructor().add(instructor);
        }else{
            System.out.println("Warning!! " + course.getName() + " course has taught from another instructor.\n");
        }

    }

    public void listInstructor(){
        for(Instructor instructors : instructorList){
            System.out.print("*Instructor name: " + instructors.getName() + " *Taught courses: ");
            for(Course courses : instructors.getTaughtCourses()) {
                System.out.print(courses.getName() + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}
