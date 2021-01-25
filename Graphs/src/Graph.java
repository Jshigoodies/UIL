//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Map;
import java.util.TreeMap;

public class Graph
{
	private TreeMap<String, String> map;
	private boolean found;

	public Graph(String line)
	{
		map = new TreeMap<String, String>();
		String[] pairs = line.split("");
		
		for(int i = 0; i<pairs.length-1; i++)
		{
			String firstLet = pairs[i].substring(0,1);
			String lastLet = pairs[i].substring(1);
			
			//now i have both pairs of letters that are directly related
			//I have to see if there already existed a key for that
			
			
			//if there isn't, I have to add it on to that string
			//What i'm planning to do is have 1 (the key) letter contain all of the letters that are directly related to it
			
			
		}
	}

	public boolean contains(String letter)
	{
	   return true;
	}

	public void check(String first, String second, String placesUsed)
	{
	}

	public String toString()
	{
		return "";
	}
}