
public class BitWise {
	public static void main(String args[])
	{
		System.out.println(Integer.toBinaryString(90));
		System.out.println(Integer.toOctalString(90));
		System.out.println(Integer.toHexString(90).toUpperCase());
		
		
		System.out.println(7&6);
		/*
		8 4 2 1
		0 1 1 1 = 7
		0 1 1 0 = 6
		_______
		0 1 1 0 = 6
		 */
		
		System.out.println(7|6);
		/*
		8 4 2 1
		0 1 1 1 = 7
		0 1 1 0 = 6
		_______
		0 1 1 1 = 7
		 */
		System.out.println(7^6); // has to be only one of them
		/*
		8 4 2 1
		0 1 1 1 = 7
		0 1 1 0 = 6
		_______
		0 0 0 1 = 1
		 */
		
		System.out.println(7<<1);
		/*
		16 8 4 2 1
		 0 0 1 1 1 = 7
		<< 1 time
		 0 1 1 1 0 = 14
		 */
		
		System.out.println(6>>1);
		/*
		8 4 2 1
		0 1 1 0 = 6
		>> 1 time
		0 0 1 1 = 3
		 */
	
		
		/*
PolishNotation:
		Infix: <operand><operator><operand>
		Prefix: <operator><operand><operand>
		Postfix: <operand><operand><operator>
		 */
		
	}
}
