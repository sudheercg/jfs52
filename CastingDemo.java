public class CastingDemo{

   public static void main(String[] args){

      //declare a byte variable
   	     byte b =10;

   	  //cast into an int  - Widening casting byte->int
   	     int i =b;

   	   // widening casting int - > double

   	    double d =i;

        System.out.println("Widening");
        System.out.println("---------");
   	    System.out.println("byte Value: "+b);
   	    System.out.println("int Value: "+i);
   	    System.out.println("double Value: "+d);

        System.out.println();
        System.out.println("Narrowing");
        System.out.println("---------");
        //Narrowing
        double doubleVar = 25.75;

        //narrowing casting   double -> int
        int intVar = (int)doubleVar;

        //narrowing casting int - > byte
        byte byteVar = (byte)intVar; 
        System.out.println("double value: "+ doubleVar);
        System.out.println("int value: "+intVar);
		System.out.println("byte value"+ byteVar);



   }

}