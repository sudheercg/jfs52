import java.util.Scanner;

//Program to demonstrate input and output

public class IODemo{
	
   public static void main(String[] args) {
   	 
     //classname objectref= new classname();
   	Scanner sc = new Scanner(System.in);
    System.out.print("Please enter your age: ");
    int age= sc.nextInt(); 
    
    System.out.print("Enter your salary: ");
    double salary = sc.nextDouble();
  // 300.34 \n
    sc.nextLine(); 
    System.out.print("Enter your name: ");
    String name=sc.nextLine(); 

    System.out.println("You have entered: "+age);
    System.out.println("You have entered the salary: "+salary);
    System.out.println("You have entered the name: "+ name);

   }







}