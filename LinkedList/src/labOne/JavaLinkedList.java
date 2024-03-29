package labOne;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 



/*
 * Linked List has similar methods to ArrayList - good to know
 */
import java.util.LinkedList;
import static java.lang.System.*;

public class JavaLinkedList
{
	private LinkedList<Integer> list;

	public JavaLinkedList()
	{
		list = new LinkedList<Integer>();
	}

	public JavaLinkedList(int[] nums)
	{
		list = new LinkedList<Integer>();
		for(int num : nums)
		{
			list.add(num);
		}
	}

	public double getSum(  )
	{
		double total=0;
		for(int i = 0; i < list.size(); i++)
		{
			total = total + list.get(i);
		}
		return total;
	}

	public double getAvg(  )
	{
		return this.getSum() /list.size();
	}

	public int getLargest()
	{
		int largest=Integer.MIN_VALUE; 
		//i think it's pretty funny how if we don't want to compare values, instead we just find the biggest number and compare that to the smallest value possible
		for(int i = 0; i<list.size(); i++)
		{
			if(list.get(i) > largest)
			{
				largest = list.get(i);
			}
		}
		return largest;
	}

	public int getSmallest()
	{
		int smallest = smallest=Integer.MAX_VALUE;
		
		for(int i = 0; i<list.size(); i++)
		{
			if(list.get(i) < smallest)
			{
				smallest = list.get(i);
			}
		}
		
		return smallest;
	}

	public String toString()
	{
		String output=
		  "SUM :: " + this.getSum() + "\n"
		+ "AVERAGE :: " + this.getAvg() + "\n"
		+ "SMALLEST :: " + this.getSmallest() + "\n"
		+ "LARGEST :: " + this.getLargest()+ "\n";
		return output;
	}
}