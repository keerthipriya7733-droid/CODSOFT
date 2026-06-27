package Task5_StudentManagementSystem;
import java.util.ArrayList;
import java.util.Iterator;
public class StudentManagementSystem {
    private ArrayList<Student> students;

    public StudentManagementSystem(){
        students = new ArrayList<>();
    }
    public void addStudent(Student student){
        students.add(student);
        System.out.println("Student added Successfully. ");
    }
    public void viewAllStudents(){
        if(students.isEmpty()){
            System.out.println("No Students found. ");
            return;
        }
        for(Student  student : students){
            student.displayStudentInfo();
        }
    }
    public void searchStudent(int studentID){
        for(Student student : students){
            if(student.getStudentID() == studentID){
                student.displayStudentInfo();
                return;
            }
        }
        System.out.println("Student not found. ");
    }
    
    public void deleteStudent(int studentID){
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            if(student.getStudentID() == studentID){
                iterator.remove();
                System.out.println("Student deleted successfully. ");
                return;
            }
        }
        System.out.println("Student not found. ");
    }
    public void updateStudent(int studentID, String name, int age, String gender, String grade, String course, String studentPhone, String parentPhone, String email, String address){
        for(Student student : students){
            if(student.getStudentID() == studentID){
                student.setName(name);
                student.setAge(age);
                student.setGender(gender);
                student.setGrade(grade);
                student.setCourse(course);
                student.setStudentPhone(studentPhone);
                student.setParentPhone(parentPhone);
                student.setEmail(email);
                student.setAddress(address);

                System.out.println("Student updated successfully.");

                return;
            }
        }
        System.out.println("Student not found. ");

    }
}
