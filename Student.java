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

       System.out.println(studentRef.rollNo);
       System.out.println(studentRef.name);
       System.out.println(studentRef.age);
       System.out.println(studentRef.course);


   }





}