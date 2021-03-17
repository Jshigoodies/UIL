//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Stack;
import static java.lang.System.*;

public class SyntaxChecker
{
	private String exp;
	private Stack<Character> symbols;

	public SyntaxChecker()
	{
		setExpression(""); //who would ever want to instance a new object that has nothing in it. If there really was nothing in it, then put it in the parameters. obj = new SyntaxChecker("")
	}

	public SyntaxChecker(String s)
	{
		setExpression(s);
	}
	
	public void setExpression(String s)
	{
		exp = s;
		symbols = new Stack<Character>();
	}

	public boolean checkExpression()
	{
		String regex1 = "{(<[";
		String regex2 = "})>]";
		
		for(int i = 0; i<exp.length(); i++)
		{
			if(regex1.indexOf(exp.charAt(i)) > -1)
			{
				symbols.push(exp.charAt(i));
			}
			else if(regex2.indexOf(exp.charAt(i)) > -1)
			{
				if(symbols.isEmpty())
				{
					return false;
				}
				else
				{
					if(regex1.indexOf(symbols.pop()) != regex2.indexOf(exp.charAt(i))) //OMG WHY COULDN'T I SEE THIS. THIS '[' DOES NOT EQUAL ']' EVEN IF THEY ARE BOTH BRAKETS
					{
						return false;
					}
				}
			}
		}
		//System.out.println(symbols + "");
		return true;
	}

	//write a toString
	public String toString()
	{
		return exp + "";
	}
}