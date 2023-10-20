package array_2d;


/*
 * Question 1 :Print the number of 7’s that are in the 2d array.Example :Input - int[][] array =
 *  { {4,7,8},{8,8,7} };
 * Output - 2
 * 
 * 
 * Question 2 :Print out the sum of the numbers in the second row of the “nums” array.
 * Example :Input - int[][]nums = { {1,4,9},{11,4,3},{2,2,3} };Output - 18
 * 
 * 
 * 
 * Question 3 :Write a program to FindTransposeofa Matrix.What is Transpose?Transpose of a matrix is the      process ofswapping therows to columns. For a 2x3 matrix
 */

public class practiceQues {
    public static void printarray(int[][]matrix){
    for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[0].length; j++){
            System.out.print(matrix[i][j]+ " ");
        }
    }
    System.out.println();
}
    
    public static void main(String[] args) {

        //Question1 
        // -------------start-----------
    //     int[][] array= {{4,7,8},
    //                      {8,8,7}};

    //   int count=0;

    //   for(int i=0; i<array.length; i++){
    //     for(int j=0; j<array[0].length; j++){
    //         if(array[i][j]==7){
    //             count++;
    //         }
    //     }
    //   }
    //   System.out.println("count of seven is "+ count);

    //   ------------END--------------


    // Question2

    // ------------------Start----------------

    //    int[][]nums = { {1,4,9},{11,4,3},{2,2,3} };
    //     int sum=0;
    //    for(int i=0; i< nums[0].length; i++){
    //     sum+=nums [2][i];
    //    }

    //    System.out.println("sum is"+ sum);

    //    ----------------END--------------


    //Question 3


    // ------------------Start-------------

    int [][]matrix={{1,2,3},{4,5,6}};
     int Row=2, column=3;

    printarray(matrix);

    int[][] transpose= new int[column][Row];
       
    for(int i=0; i<Row; i++){
        for(int j=0; j<column; j++){
            transpose[i][j]=matrix[i][j];
        }
    }

    printarray(transpose);
    

    


        
}

//helper function



}