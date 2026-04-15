//program to demonstrate unary operators

class UnaryOperatorsDemo{
	

   public static void main(String[] args) {
   	
   	int x =10;
   	int y = --x;

    //Post increment operator x++ will use the current value of x, then increment
   	// x++ means x=x+1;
    //x-- means x=x-1;
    //Pre increment operator, first increments then  assign  the incremented value. 

   	System.out.println(x); //9
    System.out.println(y);//9

   }





}