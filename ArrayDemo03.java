package com.codegnan.javabasics.arrays;

class ArrayDemo03{
   public static void main(String args[]){
   	/*                 c0       c1
   	  first row  R0   10(0,0)   20(0,1)
   	  second row R1   30(1,0)   40(1,1)
   	*/
  //array of arrays

   int[][] mArray = new int[2][2];

    mArray[0][0]= 10;
    mArray[0][1]=20;
    mArray[1][0]=30;
    mArray[1][1]=40; 

// Use nested for loop to traverse the elements in multidimensional array

// outer for loop  - for rows

// inner for loop  - to retrieve element in the column of each row
   
    System.out.println(mArray.length);//2

 // outer for loop for rows
  for(int i =0; i<mArray.length; i++){

  	 for(int j=0; j<mArray[i].length; j++ ){

  	 	System.out.print(mArray[i][j]+" ");
  	 }
  	 System.out.println();
  }


i   i<mArray.length(i<2 )   j     j<mArray[i].length(2)  SOP(mArray[i][j])    j++   i++
0     t                     0            true             mArray[0][0]=10   1
0     t                     1            true             mArray[0][1] 20      2
1     t                     0              t              mArray[1][0] 30      1
1     t                     1              t              mArray[1][1] 40      2
2     f

   }
   



}