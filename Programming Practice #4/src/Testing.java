import java.util.Arrays;

public class Testing {
	public static void main(String args[])
	{
		int[][] mat = new int[][] {{4,6,2,3},{7,8,98,10},{59,51,46,27}};
		
		int[] list = new int[mat[0].length];
		Arrays.sort(mat[0]);
		for(int i = 0; i<3; i++)
		{
			for(int c = 0; c<4; c++)
			{
				System.out.print(mat[i][c]+ " ");
			}
			System.out.println();
		}
	}
}
