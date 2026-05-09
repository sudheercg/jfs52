package com.codegnan.strings;

public class Demo {
	
	public static void main(String[] args) {
		
		
		
        //String creation using new keyword
		String institute = new String("Codegnan");
		String course = new String("Java");
		String myInstitute= new String("Codegnan");
		
		boolean result =institute.equals(course);
		System.out.println(result);
		System.out.println(institute.equals(myInstitute));
		
		//== operator
		boolean result1 = institute==course; 
		System.out.println(result1);
		
		String myCourse ="Java";
		String otherCourse ="Python";
		String myFavouriteCourse ="Java";
		
		System.out.println(myCourse.equals(otherCourse));
		System.out.println(myCourse.equals(myFavouriteCourse));
		
	    //== operator
		System.out.println(myCourse==otherCourse);		
		System.out.println(myCourse==myFavouriteCourse);//true
		
		
		
		
		
		
	}

}


















