//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
package labThree;
import static java.lang.System.*;

import ModuleLinkedListNode.ListNode; //Note to self: make sure to delete this

public class ListFunHouseTwo
{
	private ListNode theList;
	
	public ListFunHouseTwo()
	{
		theList = null; //nothing is in here
	}
	
	public void add(Comparable data)
	{
		
		theList = new ListNode(data, theList); //so it puts the it like ("node", null)
		//OHHH that is why you can only add it to the left and shift it to the right, you can't add it from the right
		//The starting number is the ending

	}
	
	//this method will return the number of nodes present in list
	public int nodeCount()
	{
		int count=0;

	   	ListNode list = theList;
	   	while(list!=null)
	   	{
	   		count++;
	   		list=list.getNext();
	   	}		
	
		return count;
	}
		
	//this method will create a new node with the same value as the first node and add this
	//new node at the front of the list.  Once finished, the first node will occur twice.
	public void doubleFirst()
	{
		ListNode list = new ListNode(theList.getValue(), theList.getNext());
		theList.setNext(list);
				
	}

	//this method will create a new node with the same value as the last node and add this
	//new node at the end.  Once finished, the last node will occur twice.
	
	public void doubleLast()//the most confusing one
	{
		ListNode list = theList;
		while(true)
		{
			if(list.getNext() == null)
			{
				break;
			}
			else
			{
				list = list.getNext();
			}
		}
		ListNode obj = new ListNode(list.getValue(), list.getNext());
		
		list.setNext(obj);
		//The reason why I can use list as the substitute for everything is because it is an object. 
		//The Objects point towards the same address. So if I change either of them, they both change regardless
		
	}
	
	//method skipEveryOther will remove every other node
	public void skipEveryOther()
	{



	}

	//this method will set the value of every xth node in the list
	public void setXthNode(int x, Comparable value)
	{



	
	}	

	//this method will remove every xth node in the list
	public void removeXthNode(int x)
	{

	
	}		
	//this method will return a String containing the entire list
   public String toString()
   {
	   	String output="";
	   	//almost forgot about this
	   	ListNode list = theList;
	   	while(list != null) //eventually the object reference will being null aka nothing in there
		{
			output += list.getValue() + " ";
			list = list.getNext();
		}
	   	return output;
	   	
   }			
	
}