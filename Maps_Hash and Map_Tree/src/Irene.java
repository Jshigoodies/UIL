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

public class Irene {
	public static void main(String argsp[]) throws IOException
	{
		File data = new File("C:\\Users\\Jshi\\Desktop\\UIL\\Maps_Hash and Map_Tree\\src\\irene.dat");
		
		File loopDataTemp = new File("C:\\Users\\Jshi\\Desktop\\UIL\\Maps_Hash and Map_Tree\\src\\irene.dat"); //don't worry about this
		
		Scanner Input = new Scanner(data);
		
		Scanner loopInputTemp = new Scanner(loopDataTemp); //don't worry about this too
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		while(Input.hasNextInt())
		{
			boolean condition = true;
			double num = Input.nextInt();
			
			for(int i = 2; i<=Math.sqrt(num); i++)
			{
			//checks for factors
				if(num%i == 0) //if there are
				{
					//checks the first number if it can still factor
					for(int j = 2; j<=Math.sqrt((double)i); j++)
					{
						if(num%j == 0)
						{
							map.put((int)num, "NOT SEMIPRIME");
							condition = false;
						}
					}
					//checks the second number if it can still factor
					int product = (int) (num/i); //the second number
					for(int j = 2; j<=Math.sqrt((double)product); j++)
					{
						if(product%j == 0)
						{
							map.put((int)num, "NOT SEMIPRIME");
							condition = false;
						}
					}
					//there are no factors for the factors so
					//is a semiprime number or discrete number?
					if(condition == true)
					{
						if(product == i)
						{
							//is discrete semiprime
							map.put((int)num, "SEMIPRIME");
						}
						else if(product != i)
						{
							//is semiprime
							map.put((int)num, "DISCRETE SEMIPRIME");
						}	
					}			
				}
				else
				{	
					//if there are no factors other than 1 or itself, then regardless, it's not a semi prime number
					//but i don't have to print anything out for numbers like that
					
					//map.put((int)num, "NOT SEMIPRIME");
				}
			}	
			
			Input.nextLine();
			
		}
		
		while(loopInputTemp.hasNextInt())
		{
			int num = loopInputTemp.nextInt();
			if(map.get(num) != null) //so i don't print out numbers like 2, 3, 5, 7, etc.
			{
				System.out.println(num + " " +map.get(num));
			}
			loopInputTemp.nextLine();
		}
	}
}
