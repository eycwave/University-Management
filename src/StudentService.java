import java.util.*;

public class StudentService {
    Set<Student> studentList = new HashSet<>();

    public void enrollCourse(Student student, Course course){
        student.getEnrolledCourses().add(course);
        course.getEnrolledStudents().add(student);
    }

    public void listStudent(){
        for(Student students : studentList){
            System.out.print("*Student name: " + students.getName() + " *Enrolled courses: ");
            for(Course courses : students.getEnrolledCourses()) {
                System.out.print(courses.getName() + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

}
