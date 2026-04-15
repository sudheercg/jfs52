import java.util.Scanner;

public class StudentInfoScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking input
        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Grade: ");
        char grade = sc.next().charAt(0);

        //Enter grade: A

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        System.out.print("Passed (true/false): ");
        boolean isPassed = sc.nextBoolean();

        // printing output
        System.out.println("\n--- Student Details ---");
        System.out.println("Student Name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Marks: " + marks);
        System.out.println("Passed: " + isPassed);

        sc.close();
    }
}