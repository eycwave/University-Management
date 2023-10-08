import java.util.*;

public class ServiceStudent{

    Set<Student> studentList= new HashSet<>();
    Map<Integer,Student> numberPairing = new HashMap<>();

    public void enrollCourse(Student student, Course course){
        student.enrolledCourses.add(course.getName());
    }

    public void listStudent(){
        for(Student students : studentList){
            System.out.println("Ogrenci ismi: " + students.getName() + "  Aldığı dersler: " + students.enrolledCourses);
        }
    }

}
