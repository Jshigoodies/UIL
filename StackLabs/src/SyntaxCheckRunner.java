//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Stack;
import static java.lang.System.*;

public class SyntaxCheckRunner
{
	public static void main ( String[] args )
	{
		//add test cases
		SyntaxChecker obj = new SyntaxChecker("{<html[value=4]*(12)>{$x}}");
		System.out.println(obj + " is a " + obj.checkExpression() + " expression");
	}
}