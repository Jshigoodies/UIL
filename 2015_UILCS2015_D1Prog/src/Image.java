import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Image {
	public static void main(String args[]) throws IOException
	{
		File f = new File("image.dat");
		Scanner input = new Scanner(f);
		
		int c = input.nextInt();
		
		for(int go = 0; go<c; go++)
		{
			int mine = input.nextInt();
			int width = input.nextInt();
			int height = input.nextInt();
			//System.out.println(mine + " " + width + " " + height);
			
			String[] pngName = new String[mine];
			int[][][] pngPixels = new int[mine][width][height];
			
			//for loop for the comparing images
			for(int i = 0; i<mine; i++)
			{
				pngName[i] = input.next();
				
				for(int w = 0; w<width; w++)
				{
					for(int h = 0; h<height; h++)
					{
						pngPixels[i][w][h] = Integer.parseInt(input.next(), 16); //parse a string into a base 16 integer
					}
				}
			}
			
			/*
			for(int i = 0; i<mine; i++)
			{
				System.out.println(pngName[i]);
				
				for(int w = 0; w<width; w++)
				{
					for(int h = 0; h<height; h++)
					{
						System.out.println(pngPixels[i][w][h]);
					}
				}
			}
			*/
			
			
			String[] jpgName = new String[mine];
			int[][][] jpgPixels = new int[mine][width][height];
			
			//for loop that comapres the two
			for(int i = 0; i<mine; i++)
			{
				jpgName[i] = input.next();
				
				for(int w = 0; w<width; w++)
				{
					for(int h = 0; h<height; h++)
					{
						jpgPixels[i][w][h] = Integer.parseInt(input.next(), 16); //parse a string into a base 16 integer
					}
				}
			}
			
			/*
			for(int i = 0; i<mine; i++)
			{
				System.out.println(jpgName[i]);
				
				for(int w = 0; w<width; w++)
				{
					for(int h = 0; h<height; h++)
					{
						System.out.println(jpgPixels[i][w][h]);
					}
				}
			}
			*/
			
			
			
		}
		
	}
}
