import java.lang.reflect.Array;
import java.util.ArrayList;

public class Course {
    private String courseName;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;


    public Course (String name, Teacher aTeacher, ArrayList<Student> aArray){
        this.courseName = name;
        this.instructor = aTeacher;
        this.enrolledStudents = aArray;
    }


}
