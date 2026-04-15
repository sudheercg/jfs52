package com.codegnan.methoddemo; 
class Student{
	
  //instance varaibles
  int rollNo;
  String name;
  int age;
  String course; 


   public static void main(String args[]){


     //Syntax to create an object:
     //Classname objectReference = new Classname(); 

       //Student object. 
       Student studentRef = new Student(); 

       //initializing student object - provide values to student 
       studentRef.rollNo =100; 
       studentRef.name="Raj Kumar";
       studentRef.age=20;
       studentRef.course="Java";

       studentRef.display();


       Student studentRef2 = new Student();
       
       studentRef2.rollNo=101;
       studentRef2.name="Suresh Kumar";
       studentRef2.age=222;
       studentRef2.course="Java";

       studentRef2.display();



   }


 /*Syntax to create a method:

  accessmodifier returntype methodname(optional arguments){

  	// method body
  } 
*/

 //instance method
 public void  display(){

       System.out.println(rollNo);
       System.out.println(name);
       System.out.println(age);
       System.out.println(course);


 }





}