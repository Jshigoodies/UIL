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
			   bot = parent;
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
		int root = 0;
		while(root < top)
		{
			int max = 0;
			int left = root * 2 + 1;
			int right = root * 2 + 2;
			
			if(left < top)
			{
				if(right < top)
				{
					if (list.get(left) <= list.get(right))
					{
						max = right;
					}
					else{
						max = left;
					}
				}
				else
					max = left;
			}
			else break;
			
			if (list.get(root) < list.get(max))
			{
				swap(root, max);
				root=max;
			}
			else break;
		}
	}
	
	private void swap(int start, int finish)
	{
		int temporary = list.get(start);
		list.set(start, list.get(finish));
		list.set(finish, temporary);		
	}

	public void print()
	{
		int x = 0;
		out.println("\n\nPRINTING THE HEAP!\n\n");
		for(int i = 1; i<list.size(); i*= 2)
		{
			for(int s = 1; s<list.size()-i; s++)
			{
				System.out.print(" ");
			}
			
			for(int j = 0; j<= i-1&&x<list.size(); j++)
			{
				System.out.print(list.get(x++)+ "  ");
			}
			System.out.println();
			if(x==list.size()-1)
			{
				out.print(list.get(x++)+"  ");
			}
		}
		out.println();
	}

	public String toString()
	{
		return list.toString();
	}
}