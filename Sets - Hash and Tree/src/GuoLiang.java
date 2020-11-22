import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Set; 
import java.util.ArrayList;
import java.text.DecimalFormat;
public class GuoLiang {
	public static void main(String args[]) throws IOException
	{
		File data = new File("C:\\Users\\Jshi\\Desktop\\UIL\\Sets - Hash and Tree\\src\\guoliang.dat");
		Scanner Input = new Scanner(data);
		
		String regex = "";
		String word = "";
		try
		{
			while(true)
			{
				if(Input.hasNext())
				{
					regex =  regex + Input.next() + " ";
				}
				else
				{
					Input.nextLine();
				}
			}
		}
		catch(java.util.NoSuchElementException e)
		{
			String[] array = regex.split(" ");
			for(int i = 0; i < array.length; i++)
			{
				if(isIsogram(array[i]))
				{
					word = word + array[i] + "\n";
				}
			}
		}
		finally
		{
			System.out.println(word);
		}
	}


	public static boolean isIsogram(String s)
	{
		for(int j = 0; j < s.length(); j ++)
		{
			char letter = s.charAt(j);
			for(int i = j + 1; i < s.length(); i++)
			{
				if(letter == s.charAt(i))
				{
					return false;
				}
			}
		}
		return true;
	
	}


}