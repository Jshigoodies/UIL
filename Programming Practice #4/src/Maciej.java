import java.io.File;

import java.io.FileNotFoundException;

import java.io.IOException;

import java.util.Scanner;

import java.util.ArrayList;

import java.text.DecimalFormat;

import java.lang.Math;

import java.io.*; //i should've done this first
import java.util.*; //i should've done this first

public class Maciej {
	public static void main(String args[]) throws IOException
	{
		File data = new File("./maciej.dat");
		Scanner Input = new Scanner(data);
		
		int TestCases = Input.nextInt();
		Input.nextLine();
		
		for(int num = 1; num<=TestCases; num++) //obviously
		{
			String first = Input.next(); //There is always 6 numbers. In 2 pairs is one of the RGB values
			String second = Input.next();
			
			int[] RGB1 = convert(first); //use the convert method to convert a string to an int in an array
			int[] RGB2 = convert(second);
			
			int[] combine = new int[3];
			
			for(int i = 0; i < 3; i++)
			{
				//now to take the average for each R, G, and B
				combine[i] = (RGB1[i] + RGB2[i]) / 2; //no doubles, only ints
			}
			System.out.println("Case #" + num + " #" + toHex(combine));
		}
		
		
		
	}
	
	public static int[] convert(String hex)
	{
		int notImportant = 7;
		assert notImportant == 7; /*I understand how this works, it's like an if statement 
		except that if statment does nothing except return true and false. It throws a runtime error if it's false. The point is, 
		i don't see why you need to check that unless they give you a hex number that goes past the length.... is that possible for a color?*/
		
		
		
		
		int[] result = new int[3]; //because there is 3 RGB int values
		for(int i = 0; i<3; i++) // runs 3 times because there is 3 RGB values
		{
			/*
			 * ok so i want 1,3 3,5 and 5,end
			 */
			String s = hex.substring(1 + i * 2, 1 + i*2 + 2 ); //1 + i * 2 makes sense because i*2 would give even numbers including zero, but +1 makes it odd
			result[i] = Integer.parseInt(s, 16 /*16 is decimal format*/); //parseInt is a way to convert strings to any number format
		}
			
		return result;
		
	}
	
	public static String toHex(int[] array)
	{
		//i have no idea what kind of power is happening on the answer sheet, but i'll just do my way
		String hexWord = "";
		for(int i = 0; i < 3; i++)
		{
			int num = array[i];
			hexWord = hexWord + Integer.toHexString(num); //now that's way easier to read on the eyes
		}
		hexWord = hexWord.toUpperCase(); //needs to be uppercase
		return hexWord;
	}
}
