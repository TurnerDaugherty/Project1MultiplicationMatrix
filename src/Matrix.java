import java.util.Scanner;
class Matrix
{
	public static void main(String[] args)
   {
      int aRows, aColumns, bRows, bColumns, sum = 0, mRows, mColumns, C;
 
      Scanner in = new Scanner(System.in);
      System.out.println("How many Rows and Columns are in the first matrix?");
      aRows = in.nextInt();
      aColumns = in.nextInt();
      int firstInt[][] = new int[aRows][aColumns];
      System.out.println("Input the integers for the first matrix now!");
      for ( mRows = 0 ; mRows < aRows ; mRows++ )
         for ( mColumns = 0 ; mColumns < aColumns ; mColumns++ )
            firstInt[mRows][mColumns] = in.nextInt();
      System.out.println("How many rows and columns are in the second matrix?");
      bColumns = in.nextInt();
      bRows = in.nextInt();
      if ( aColumns!= bRows )
         System.out.println("ERROR! Matrices with entered orders can't be multiplied with each other.");
      else
      {
         int secondInt[][] = new int[bRows][bColumns];
         int multiply[][] = new int[aRows][bColumns];
         System.out.println("Enter the elements of second matrix");
         for ( mRows = 0 ; mRows < bRows ; mRows++ )
            for ( mColumns = 0 ; mColumns < bColumns ; mColumns++ )
               secondInt[mRows][mColumns] = in.nextInt();
         for ( mRows = 0 ; mRows < aRows ; mRows++ )
         {
            for ( mColumns = 0 ; mColumns < bColumns ; mColumns++ )
            {   
               for ( C = 0 ; C < bRows ; C++ )
               {
                  sum = sum + firstInt[mRows][C]*secondInt[C][mColumns];
               }
                multiply[mRows][mColumns] = sum;
               sum = 0;
            } }
         System.out.println("The entered matricies are:");
         for ( mRows = 0 ; mRows < aRows ; mRows++ )
         {
            for ( mColumns = 0 ; mColumns < bColumns ; mColumns++ )
            System.out.print(multiply[mRows][mColumns]+"\t");
            System.out.print("\n");
  } 
         }}}