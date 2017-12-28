
import java.util.Scanner;

public class Matrix {
	String name;
	int rows;    //Rows of a Matrix
	int columns; //Columns of a Matrix"
	int[][] matrix; //2-d Array for Matrix
	int value;   //value of each element of matrices
	
	//Constructor Method for Matrix Class to define a Matrix with given rows and columns;
	public Matrix(String nameMatrix, Scanner userInput, int conditionMatrix){
		int rowsMatrix, columnsMatrix;

// Set Name of the Matrix

		this.setName(nameMatrix);
		if(nameMatrix == "Matrix A"){
			System.out.println("Enter the No. of rows in Matrix A");
			this.rows = userInput.nextInt();
			System.out.println("Enter the No. of Columns in Matrix A");
			this.columns = userInput.nextInt();
	
		}
		else if(nameMatrix == "Matrix B"){
			
			int whileCounter = 0;
			do{
				if (whileCounter != 0 ){
					System.out.println("Entered row value for Matrix B is wrong. Rows of Matrix B should be equal to columns of Matrix A");
				}
				System.out.println("Enter the No. of rows in Matrix B");
				this.rows = userInput.nextInt();
				whileCounter++;
			}while(this.rows != conditionMatrix);
			
			System.out.println("Enter the No. of Columns in Matrix B");
			this.columns = userInput.nextInt();
		}
// 		Create Matrix using the inputs from User
		
		this.matrix = new int[this.rows][this.columns];
//		Enter values for the Matrix
		System.out.println("Enter the elements of the " + this.name);
		for(rowsMatrix = 0; rowsMatrix < this.rows; rowsMatrix++){
			for(columnsMatrix = 0; columnsMatrix < this.columns; columnsMatrix++){
				this.matrix[rowsMatrix][columnsMatrix] = userInput.nextInt();
			}
		}
		
	}
	
	public Matrix(int in_rows, int in_cols){
		this.rows = in_rows;
		this.columns = in_cols;
		this.matrix = new int[this.rows][this.columns];
	}
	
//Getter Setter Methods for instance variables
	
	
	public String getName() {
		return name;
	}

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}


	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	public void displayMatrix() {
		int	rowsMatrix, columnsMatrix;
		System.out.println("Values of " + this.name + " :");
		for(rowsMatrix = 0; rowsMatrix < this.rows; rowsMatrix++){
			for(columnsMatrix = 0; columnsMatrix < this.columns; columnsMatrix++){
				System.out.print(this.matrix[rowsMatrix][columnsMatrix] + " ");;
			}
			System.out.println();
		}
	}
	
}
