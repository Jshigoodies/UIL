import java.io.File;

import java.io.FileNotFoundException;

import java.io.IOException;

import java.util.Scanner;

import java.util.ArrayList;

import java.text.DecimalFormat;

import java.lang.Math;

import java.util.Iterator;

import java.util.Map;

import java.util.HashMap;


public class Kelly {
	public static void main(String args[]) throws IOException
	{
		File data = new File("C:\\Users\\Jshi\\Desktop\\UIL\\Maps_Hash and Map_Tree\\src\\kelly.dat");
		
		Scanner Input = new Scanner(data);
		
		String[][] list = new String[][] {{" "                          }, 
			                              {null, "A", "B", "C", "D", "E"}, 
		                                  {null, "F", "G", "H", "I", "J"}, 
		                                  {null, "L", "M", "N", "O", "P"}, 
		                                  {null, "Q", "R", "S", "T", "U"}, 
		                                  {null, "V", "W", "X", "Y", "Z"} 
		                                 };
		
		                             
		                             
		
		while(Input.hasNext()) //?????? guess: if there is anything on that line, then return true
		{
			String s = Input.nextLine();	////????????		Google: The nextLine() method of java. util. Scanner class advances this scanner past the current line and returns the input that was skipped.
			Scanner c = new Scanner(s); //????????? <--- so the line that was skipped is the data
			while(c.hasNextInt())
			{
				int index1 = c.nextInt();
				int index2 = c.nextInt();
				System.out.print(list[index1][index2]);
			}
			System.out.println();
		}
		Input.close(); ////???????? I have so many questions

	}

	

}
	
