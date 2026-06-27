import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;

        do{
            System.out.print("Enter number of subjects: ");
            n = sc.nextInt();

            if (n <= 0){
                System.out.println("Invalid input! Number of subjects must be greater than 0.");
            }
        } while (n <= 0);

        float sum = 0;
        float total = 0;
        for(int i=1;i<=n;i++){
            System.out.print("Enter marks of subject " + i + " : ");
            float s = sc.nextFloat();

            if (s < 0 || s > 100){
                System.out.println("Invalid marks! Please enter marks between 0 and 100");
                i--;
                continue;
            }
            sum = sum + s;
        }
        total = sum;
        int max_marks = n * 100;
        float percentage = (total/max_marks) * 100;

        String grade;
        String status;


        if ( percentage >= 90){
            grade = "A+";
        }
        else if (percentage >= 80){
            grade = "A";
        }
        else if (percentage >= 70){
            grade = "B";
        }
        else if (percentage >= 60){
            grade = "C";
        }
        else if (percentage  >= 50){
            grade = "D";
        }
        else if (percentage >= 40){
             grade = "E";
        }
        else{
            grade = "F";
            System.out.println("You need to practice well, better luck next time.");
        }
        
        if (percentage >= 40) {
            status = "PASS";
        } else {
            status = "FAIL";
        }

        System.out.println("---------------------------------");
        System.out.println("             RESULT              ");
        System.out.println("---------------------------------");
        System.out.println("Total marks              : " + total);
        System.out.printf("Percentage               : %.2f%%\n", percentage);
        System.out.println("Grade                    :  " + grade);
        System.out.println("Status                   : " + status);
        System.out.println("-----------------------------------");


        sc.close();


    }
    
}
