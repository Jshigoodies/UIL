//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
package labTwo;
import static java.lang.System.*;


/*
 * This whole thing is stupid, it's a list, but not really. It's just an object inside of an object of an object of an object until it reaches null
 */


public class ListFunHouse
{
	//this method will print the entire list on the screen
   public static void print(ListNode list)
   {
	   while(list != null) //eventually the object reference will being null aka nothing in there
	   {
		   System.out.print(list.getValue() + " ");
		   list = list.getNext();
	   }
   }		
	
	//this method will return the number of nodes present in list
	public static int nodeCount(ListNode list)
	{
		int count = 0;
		while(list != null) //eventually the object reference will being null aka nothing in there
		{
		   count++;
		   list = list.getNext();
		}	
		return count;
	}
		
	//this method will create a new node with the same value as the first node and add this
	//new node to the list.  Once finished, the first node will occur twice.
	public static void doubleFirst(ListNode list)
	{
		ListNode obj = new ListNode(list.getValue(), list.getNext()); //make the copy of the first object
		
		list.setNext(obj); //set the first object's "next" to contain the first object
		
	}

	//this method will create a new node with the same value as the last node and add this
	//new node at the end.  Once finished, the last node will occur twice.
	public static void doubleLast(ListNode list)
	{
		ListNode prev=null;
		while(true)
		{
			if (list.getNext() == prev)
			{
				break;
			}
			else
			{
				list = list.getNext();
			}
		}
		
		ListNode obj = new ListNode(list.getValue(), list.getNext()); //make a copy of the last object
		list.setNext(obj); //make the last object's next reference be the same object (that contains the next reference as null)
		
	}
		
	//method skipEveryOther will remove every other node
	public static void skipEveryOther(ListNode list)
	{
		while(list != null)
		{

			list.setNext(list.getNext().getNext()); 
			//OK THIS IS BIG BRAIN, I just figured out that if I set next the leading node before the node i need to delete 
			//then i can get the next object and then next object again (we can call "next next" object) and let it reference the "next next" object
			//if the "next" object or "next next: object referenced is null, then it would be null either way.
			list = list.getNext();
		}

		
	}

	//this method will set the value of every xth node in the list
	public static void setXthNode(ListNode list, int x, Comparable value)
	{
		int count=1;
		while(list != null)
		{
			if(count == x)
			{
				count = 0;
				list.setValue(value); //this was like the easiest thing to think of
			}
			else
			{
				count++;
				list = list.getNext();
			}
		}

	}	

	//this method will remove every xth node in the list
	public static void removeXthNode(ListNode list, int x)
	{
		int count=1;
		while(list != null)
		{
			if(count == 1)
			{
				count = 0;
				ListNode obj = list;
				for(int n = 0; n<x; n++)
				{
					obj = obj.getNext();
				}
				list.setNext(obj); 
				//OK THIS IS BIG BRAIN, I set next the leading node before the node i need to delete 
				//I first need to get the next object and then next object again (we can call "next next" object) and let it reference the "next next" object
				//if the "next" object or "next next: object referenced is null, then it would be null either way.
			}
			else
			{
				count++;
				list = list.getNext();
			}
			
		}
	}		
}