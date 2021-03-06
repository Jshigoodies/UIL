import java.util.*;
import java.io.*;

public class Teresa {
	public static void main(String args[]) throws IOException
	{
		//Her experimental operation first sorts within the columns and then across the rows. <_< WHYYYY.
		File data = new File("./teresa.dat");
		Scanner Input = new Scanner(data);
		
		int cases = Input.nextInt();
		Input.nextLine();
		
		for(int i = 0; i<cases; i++)
		{
			System.out.println(i +1 + ":");
			
			int rows = Input.nextInt();
			int col = Input.nextInt();
			int[][] matrix = new int[rows][col];
			
			//puts all the numbers in the array
			for(int j = 0; j<rows; j++)
			{
				for(int k = 0; k<col; k++)
				{
					matrix[j][k] = Input.nextInt();
				}
			}
			
			//sort columns
			for(int k = 0; k<matrix[0].length; k++)
			{
				int[] list = new int[matrix.length];
				for(int row = 0; row<matrix.length; row++)
				{
					list[row] = matrix[row][k];
				}
				Arrays.sort(list);
				for(int row = 0; row<matrix.length; row++)
				{
					matrix[row][k] = list[row];
				}
			}

			//sort rows - Literally the easiest one
			for(int k = 0; k<matrix.length; k++)
			{
				Arrays.sort(matrix[k]);
			}
			
			
			for(int x = 0; x < rows; x++)
			{
				for(int y = 0; y<col; y++)
				{
					System.out.print(matrix[x][y]+" ");
				}
				System.out.println();
			}
			System.out.println("++++++++++++");
			
		}
	}
}
