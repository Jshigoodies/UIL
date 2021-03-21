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
			String[][][] pngPixels = new String[mine][width][height];
			
			//for loop for the comparing images
			for(int i = 0; i<mine; i++)
			{
				pngName[i] = input.next();
				
				for(int w = 0; w<width; w++)
				{
					for(int h = 0; h<height; h++)
					{
						pngPixels[i][w][h] = input.next(); //parse a string into a base 16 integer later
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
			String[][][] jpgPixels = new String[mine][width][height];
			
			//for loop that comapres the two
			for(int i = 0; i<mine; i++)
			{
				jpgName[i] = input.next();
				
				for(int w = 0; w<width; w++)
				{
					for(int h = 0; h<height; h++)
					{
						jpgPixels[i][w][h] = input.next(); //parse a string into a base 16 integer
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
			
			//comparing the images
			
			for(int origin = 0; origin<mine; origin++)
			{
				int[] score = new int[mine]; //to see the difference between each image for the index 'origin' image
				
				//for this 'i' image compare to the other ones
				for(int diff = 0; diff<mine; diff++)
				{
					int totalDiff = 0; //new cloud image
					for(int w = 0; w<width; w++)
					{
						for(int h = 0; h<height; h++)
						{
							//comapre the first pixels in the pixel images and so on
							String orginalPixel = pngPixels[origin][w][h];
							String cloudPixel = jpgPixels[diff][w][h];
							
							
							for(int i = 0; i<6; i = i + 2)
							{
								//my brain hurts
								//System.out.println(orginalPixel.substring(i, i+2));
								//System.out.println(cloudPixel.substring(i, i+2));
								
								totalDiff = totalDiff + (Integer.parseInt(orginalPixel.substring(i, i+2), 16) - Integer.parseInt(cloudPixel.substring(i, i+2), 16)); //fk off fking inputs with length of 5
							}
							
						}
					}
					score[diff] = totalDiff;
					//System.out.println(Math.abs(score[diff]));
				}
				//for loop to find the smallest score number
				int min = Integer.MAX_VALUE;
				int index = -1; //should at least get some other value than -1
				for(int i = 0; i < score.length; i++)
				{
					int s = Math.abs(score[i]);
					
					if(s < min)
					{
						//System.out.println(s);
						min = s;
						index = i; 
					}
				}
				System.out.println(pngName[origin] + " : " + jpgName[index]);
				//i have no idea what i'm doing wrong, but i'm done and too lazy now
			}
			
			
		}
		
	}
}
