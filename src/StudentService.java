import java.util.*;

public class StudentService {
    private Set<Student> studentList = new HashSet<>();

    public void addStudent(Student student){
        studentList.add(student);
        System.out.println("Student added.");
    }

    public Student getStudentByID(int id){
        for(Student st : studentList){
            if(st.getNumber()==id){
                return st;
            }
        }
        return null;
    }

    public void enrollStudentToCourses(Course course, int studentID){
        if(!course.getEnrolledStudents().contains(getStudentByID(studentID))){
            getStudentByID(studentID).getEnrolledCourses().add(course);
            course.getEnrolledStudents().add(getStudentByID(studentID));
            System.out.println(getStudentByID(studentID).getName() + " enrolled to " + course.getName());
        } else{
            System.out.println(getStudentByID(studentID).getName() + " has already been enrolled this course.");
        }
    }

    public Set<Student> getStudentList() {
        return studentList;
    }
}
