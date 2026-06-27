package Task5_StudentManagementSystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentManagementSystem system = new StudentManagementSystem();

        int choice;

        do {

            System.out.println("\n==============================");
            System.out.println(" STUDENT MANAGEMENT SYSTEM");
            System.out.println("==============================");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.println("==============================");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();


            switch(choice){

                case 1: {

                    System.out.print("Enter Student ID: ");
                    int studentID = sc.nextInt();

                    sc.nextLine(); // clear buffer

                    System.out.print("Enter Admission Number: ");
                    String admissionNumber = sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Gender: ");
                    String gender = sc.nextLine();

                    System.out.print("Enter Grade: ");
                    String grade = sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter Student Phone: ");
                    String studentPhone = sc.nextLine();

                    System.out.print("Enter Parent Phone: ");
                    String parentPhone = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter Address: ");
                    String address = sc.nextLine();


                    Student student = new Student(
                        studentID,
                        admissionNumber,
                        name,
                        age,
                        gender,
                        grade,
                        course,
                        studentPhone,
                        parentPhone,
                        email,
                        address
                    );


                    system.addStudent(student);

                    break;
                }


                case 2:
                    system.viewAllStudents();
                    break;


                case 3:
                    System.out.print("Enter Student ID: ");
                    int searchID = sc.nextInt();

                    system.searchStudent(searchID);
                    break;


                case 4:

                    System.out.print("Enter Student ID to update: ");
                    int updateID = sc.nextInt();
  
                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter New Age: ");
                    int age = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter New Gender: ");
                    String gender = sc.nextLine();

                    System.out.print("Enter New Grade: ");
                    String grade = sc.nextLine();

                    System.out.print("Enter New Course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter New Student Phone: ");
                    String studentPhone = sc.nextLine();

                    System.out.print("Enter New Parent Phone: ");
                    String parentPhone = sc.nextLine();

                    System.out.print("Enter New Email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter New Address: ");
                    String address = sc.nextLine();


                    system.updateStudent(
                        updateID,
                        name,
                        age,
                        gender,
                        grade,
                        course,
                        studentPhone,
                        parentPhone,
                        email,
                        address
                    );

                    break;


                case 5:
                    System.out.print("Enter Student ID to delete: ");
                    int deleteID = sc.nextInt();

                    system.deleteStudent(deleteID);
                    break;


                case 6:
                    System.out.println("Thank you for using Student Management System.");
                    break;


                default:
                    System.out.println("Invalid choice.");
            }


        } while(choice != 6);


        sc.close();
    }
}