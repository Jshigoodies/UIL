//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Stack;
import static java.lang.System.*;

public class StackTester
{
	private Stack<String> stack;

	public StackTester()
	{
		setStack("");
	}

	public StackTester(String line)
	{
		setStack(line);
	}
	
	public void setStack(String line)
	{
		stack = new Stack<String>();
		String[] list = line.split(" ");
		for(int i = 0; i<list.length; i++)
		{
			stack.push(list[i]);
		}

		
	}

	public void popEmAll()
	{
		while(!stack.isEmpty())
		{
			System.out.print(stack.pop()+ " ");
		}
	}

	//add a toString
	public String toString()
	{
		return stack +"";
		/*
		String all = "";
		for(int i = 0; i < stack.size(); i++)
		{
			all = all + stack.get(i) + " ";
		}
		return all;
		*/
	}
}