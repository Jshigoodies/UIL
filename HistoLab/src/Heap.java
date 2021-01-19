//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.List;
import java.util.ArrayList;
import static java.lang.System.*;

public class Heap
{
	private List<Integer> list;

	public Heap()
	{
		list = new ArrayList<Integer>();
	}

	public void add(int value)
	{
		list.add(value);
		swapUp(list.size()-1);
	}

   public void swapUp(int bot)
   {
	   while(bot>0)
	   {
		   int parent = (bot-1)/2;
		   if(list.get(parent) < list.get(bot))
		   {
			   swap(parent, bot);
		   }
		   else
		   {
			   break;
		   }
	   }
   }

	public void remove( )
	{
		list.set(0,list.get(list.size()-1));
		list.remove(list.size()-1);
		swapDown(list.size());
	}

	public void swapDown(int top)
	{
	}
	
	private void swap(int start, int finish)
	{
		int temporary = list.get(start);
		list.set(start, list.get(finish));
		list.set(finish, temporary);		
	}

	public void print()
	{
		out.println("\n\nPRINTING THE HEAP!\n\n");
		out.println();
	}

	public String toString()
	{
		return list.toString();
	}
}