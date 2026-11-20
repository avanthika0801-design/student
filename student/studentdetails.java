
import java.util.Scanner;

public class studentdetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Store student details
        System.out.println("===== STUDENT DETAILS =====");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter College Name: ");
        String college = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        // Display student details
        System.out.println("\n===== STUDENT INFORMATION =====");

        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNo);
        System.out.println("Department   : " + department);
        System.out.println("College Name : " + college);
        System.out.println("Age          : " + age);
        System.out.println("Marks        : " + marks);

        sc.close();
    }
}

