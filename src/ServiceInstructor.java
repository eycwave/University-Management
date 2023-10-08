import java.util.*;

public class ServiceInstructor {

    Set<Instructor> instructorList= new HashSet<>();
    Map<Integer,Instructor> numberPairing = new HashMap<>();
    Map<Instructor, Course> coursePairing = new HashMap<>();

    public void teachCourse(Instructor instructor, Course course){
        int flag = 0;
        for(Instructor instructors : instructorList){
            if(coursePairing.get(instructors)==course){
                flag = 1;
                System.out.println("Bu kursu veren başka bir eğitmen mevcut.");
            }
        }
        if(flag!=1){
            coursePairing.put(instructor,course);
            instructor.taughtCourses.add(course.getName());
        }
    }

    public void listInstructor(){
        for(Instructor instructors : instructorList){
            System.out.println("Ogretmen ismi: " + instructors.getName() + "  Verdiği dersler: " + instructors.taughtCourses);
        }
    }

}
