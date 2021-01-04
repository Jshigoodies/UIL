import java.io.*;
import java.util.Scanner;

public class Madison {

	public static void main(String[] args) throws IOException{
		File data = new File("./Madison.dat");
		Scanner Input = new Scanner(data);
		
		while(Input.hasNext())
		{
			String row = Input.nextLine();
			String[] list = row.split(" ");
			
			String operator = list[0];
			String boolInt = list[1];
			

			String op = changeOperator(operator, boolInt);
			//System.out.println(op);

		}
	}
	
	public static String changeOperator(String op, String booleanValues)
	{
		int index = 0;
		String newOp = "";
		for(int i = 0; i<op.length(); i++)
		{
			if(op.charAt(i) == 'A' || op.charAt(i) == 'B' || op.charAt(i) == 'C')
			{
				newOp = newOp + booleanValues.charAt(index);
				index++;
			}
			else
			{
				newOp = newOp + op.charAt(i);
			}
		}
		return newOp;
	}
	
	public static String simplfy(String oper)
	{
		// () - duh, ! - not, * - and, ^ - xor, + - or
		// 1 = true, 0 = false
		while(oper.length() != 1)
		{
			//this is gonna be a whole lot of substrings
			for(int i = oper.indexOf('('); i<oper.indexOf(')'); i++)
			{
				//do the stuff in there
				simplfy(oper.substring(oper.indexOf('(') + 1, oper.indexOf(')')));
				//then replace that string with that simplified number if you know what i mean
			}
			if(oper.indexOf('!') != -1)
			{
				//check the number to the right is 0, then replace that whole thing with 1, else 0
			}
			else if(oper.indexOf('*') != -1)
			{
				//check the number to the right of * and left of *, if they are both 1, then replace that whole thing with 1, else 0
			}
			else if(oper.indexOf('^') != -1)
			{
				//check the number to the right of ^ and left of ^, if one of the is 1 and other is 0, then replace that whole thing with 1, else 0
			}
			else if(oper.indexOf('+') != -1)
			{
				//check the number to the right of + and left of +, if one of them is 1 or both is 1, then replace that whole thing with 1, else 0
			}
		}
		
		return oper;
		
	}

}
