package arraysdemo;

public class MatrixDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declare 2d matrix - 3 *3
				int a[][] = { {11,22,33},
							  {22,44,99},
							  {77,89,34}
							};
				
				int b[][] = { 	{11,22,33},
						  		{22,44,99},
						  		{77,89,34}
							};
				
				int sum[][]=new int[3][3]; // matrix with 3 rows and 3 cols
				
				System.out.println("The Addition 2 Matrices is :");
				// addition of 2 matrices
				for (int i = 0; i < 3; i++) {     //  0       1       2  -row
					
					for (int j = 0; j < 3; j++) { // 0 1 2   0 1 2   0 1 2  -column
						
						sum[i][j] = a[i][j] + b[i][j]; // addition of 2 matrices
						
						System.out.print(sum[i][j]+" ");
					}
					System.out.println();
				}

	}

}
