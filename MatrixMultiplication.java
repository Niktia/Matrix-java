// Program for Matrix Multiplication

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
// Create scanner object for accepting user input		
		Scanner userInput = new Scanner(System.in);
		int conditionMatrix = 0; // Local variable to check Matrix multiplication condition
// Creating the object for first Matrix and accepting user input
		Matrix firstMatrix = new Matrix("Matrix A" , userInput, conditionMatrix);
		conditionMatrix = firstMatrix.getColumns();
// Creating object for second Matrix and accepting user input		
		Matrix secondMatrix = new Matrix("Matrix B", userInput, conditionMatrix);
// Display First Matrix with details entered by user			
		firstMatrix.displayMatrix();
// Display Second Matrix with details entered by user
		secondMatrix.displayMatrix();
		
// Closing Scanner object as user Input is not required anymore.		
		userInput.close();	

// Create result Matrix with required dimensions as per logic		
		Matrix resultMatrix = new Matrix(firstMatrix.getRows(),secondMatrix.getColumns());
// 		Declare variables for Matrix calculation		
		int rowCounter = 0, columnCounter = 0,loopCounter = 0;
// Perform Matrix multiplication		
		for(rowCounter = 0;rowCounter < firstMatrix.getRows();rowCounter++){
			for(columnCounter = 0;columnCounter < secondMatrix.getColumns(); columnCounter++ ){
				for(loopCounter = 0; loopCounter < firstMatrix.getColumns();loopCounter++){
					resultMatrix.matrix[rowCounter][columnCounter] += 
							firstMatrix.matrix[rowCounter][loopCounter] * secondMatrix.matrix[loopCounter][columnCounter];
				}
			}
		}
// Print Output of the Matrix Multiplication:
		System.out.println("Output of the Matrix Multiplication:");
		resultMatrix.setName("Product of " + firstMatrix.getName() + " and " + secondMatrix.getName() + " is: ");
		resultMatrix.displayMatrix();		
// End of Program	
	}
}

