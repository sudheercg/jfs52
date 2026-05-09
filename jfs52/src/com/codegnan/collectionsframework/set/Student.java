package com.codegnan.collectionsframework.set;

public class Student {
	
	int id;//unique
	String name;


  Student(int id, String name){
	  this.id=id;
	  this.name =name; 
	  
  }
  
  public String toString() {
	  return "ID: "+id +" Name: "+name;
  }

 
  public int hashCode() {
	  return id; 
  }

  
  public boolean equals(Object obj) { 
	  Student s = (Student)obj;
	  return this.id== s.id;
	  
  }

}
