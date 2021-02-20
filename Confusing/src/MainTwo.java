import java.util.Arrays;

public class MainTwo {
	public static void main(String args[])
	{
		int right = 6;
		int wrong = -2;
		int skip = 0;
		char ch = 97;
		String pts = "Points";
		System.out.printf("%d pts and get %s wrong %c \n", right, wrong, ch);

//		%a	floating point (except BigDecimal)	Returns Hex output of floating point number.
//		%b	Any type	"true" if non-null, "false" if null
//		%c	character	Unicode character
//		%d	integer (incl. byte, short, int, long, bigint)	Decimal Integer
//		%e	floating point	decimal number in scientific notation
//		%f	floating point	decimal number
//		%g	floating point	decimal number, possibly in scientific notation depending on the precision and value.
//		%h	any type	Hex String of value from hashCode() method.
//		%n	none	Platform-specific line separator.
//		%o	integer (incl. byte, short, int, long, bigint)	Octal number
//		%s	any type	String value
//		%t	Date/Time (incl. long, Calendar, Date and TemporalAccessor)	%t is the prefix for Date/Time conversions. More formatting flags are needed after this. See Date/Time conversion below.
//		%x	integer (incl. byte, short, int, long, bigint)	
//		Hex string.
		
		
		
		
		
		
		
		
		byte nibble = 0; //eventually it does
		
		//nibble /= nibble; //Divide by Zero exception
		
		
		
		
		
		
		
		
		//question 10
		int[] alpha = new int[2];
		alpha[0] = 99;
		alpha[1] = alpha[0]++;
		System.out.println(Arrays.toString(alpha));
		
		//something i was curious about and forgot it
		int[] beta = alpha;
		beta[0] = 20;
		
		System.out.println(Arrays.toString(alpha)); //ah so it does change
		
		
		
		
		
		
		
		
		//Java primitive data types: number of bits of storage in memory
		
//		byte	8 bits	-128 .. 127
//		short	16 bits	-32,768 .. 32,767
//		int	    32 bits	-2,147,483,648 .. 2,147,483,647
//		long	64 bits	-9,223,372,036,854,775,808 .. 9,223,372,036,854,775,807
//		float	32 bits	3.40282347 x 1038, 1.40239846 x 10-45
//		double	64 bits	1.7976931348623157 x 10308, 4.9406564584124654 x 10-324
		
//		byte unique
//		short unique
//		int pair1
//		float pair1
//		long pair2
//		double pair2
		
		
		
		
		
		
		
		
		
		System.out.println(Integer.parseInt("0111111111", 2));
		System.out.println(Integer.parseInt("0111111", 2)); //>>3 deletes the rest
		System.out.println(511>>3);
		
		//On a side note start
		//(2n)!/((n+1)! * n!) All unique possible trees
		
		//Permutations and Combinations
		
		//On a side note end
		
		
		
		
		
		
		
		System.out.println(Integer.toString(999999, 3)); //convert base 10 number into base 3
		
		
		
		
		/*
		 * Don't forget, when Arrays.sort( 'some string array') it sorts by ascii value
		 * A = 65
		 * a = 97
		 */
		
		
		
		Alpha obj = new Alpha(); //duh
		Alpha obj1 = new Beta("hiii");
		Beta obj2 = new Beta("hi"); //duh
		//Beta obj3 = new Alpha(); //wrong
		
		
		
		
		//Boolean-Logic-And-Basic-Logic-Gates.png
	}
}

class Alpha
{
	private String id;
	public Alpha()
	{
		id = "Echo";
	}
}

class Beta extends Alpha //think of it like this: Alpha branches off to Beta, so Alpha is the main tree trunk while Beta is the branch
{
	private String id;
	public Beta(String _id)
	{
		id = _id;
	}
}