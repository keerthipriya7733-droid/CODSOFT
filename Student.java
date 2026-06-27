package Task5_StudentManagementSystem;
public class Student {
    private int studentID;
    private String admissionNumber;
    private String name;
    private int age;
    private String gender;
    private String grade;
    private String course;
    private String studentPhone;
    private String parentPhone;
    private String email;
    private String address;

    public Student(int studentID, String admissionNumber, String name, int age, String gender, String grade, String course, String studentPhone, String parentPhone, String email, String address){
        this.studentID = studentID;
        this.admissionNumber = admissionNumber;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
        this.course = course;
        this.studentPhone = studentPhone;
        this.parentPhone = parentPhone;
        this.email = email;
        this.address = address;
    }
    public int getStudentID(){
        return studentID;
    }
    public void displayStudentInfo(){
        System.out.println("Student ID             : " + studentID);
        System.out.println("Admission No           : " + admissionNumber);
        System.out.println("Name                   : " + name);
        System.out.println("Age                    : " + age);
        System.out.println("Gender                 : " + gender);
        System.out.println("Grade                  : " + grade);
        System.out.println("Course                 : " + course);
        System.out.println("Student Phone          : " + studentPhone);
        System.out.println("Parent Phone           : " + parentPhone);
        System.out.println("Email                  : " + email);
        System.out.println("Address                : " + address);
    }
    
    public void setAdmissionNumber(String admissionNumber){
        this.admissionNumber = admissionNumber;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }
    public void setCourse(String course){
        this.course = course;
    }
    public void setStudentPhone(String studentPhone){
        this.studentPhone = studentPhone;
    }
    public void setParentPhone(String parentPhone){
        this.parentPhone = parentPhone;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setAddress(String address){
        this.address = address;
    }
}
