import java.util.*;

public class InstructorService {
    private Set<Instructor> instructorList = new HashSet<>();

    public void addInstructor(Instructor instructor){
        instructorList.add(instructor);
        System.out.println("Instructor added.");
    }

    public Instructor getInstructorByID(int id){
        for(Instructor i : instructorList){
            if(i.getNumber()==id){
                return i;
            }
        }
        return null;
    }

    public void setInstructorToCourse(Course course, int instructorID){
        if(course.getCourseInstructor() == null){
            getInstructorByID(instructorID).getTaughtCourses().add(course);
            course.setCourseInstructor(getInstructorByID(instructorID));
            System.out.println(getInstructorByID(instructorID).getName() + " set to " + course.getName());
        }else{
            System.out.println(course.getName() + " has already been set another instructor.");
        }
    }

    public Set<Instructor> getInstructorList() {
        return instructorList;
    }
}
