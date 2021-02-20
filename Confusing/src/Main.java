import java.io.IOException;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]) throws IOException //it is throws, not throw
	{
		//goes in order with a condition after the do{}
		String s = "algerbra";
		int i = 0;
		System.out.println("???");
		do
		{
			System.out.println("here");
			++i;
		}
		while(s.charAt(i) != 'a');
		
		//i goes first
		System.out.print(i++);
		
		//it adds it from the right
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		System.out.println(list.get(0));
		int[] array = new int[9];
		int x = array.length;
		
		//ascii
		System.out.println('a' > 'b');
		//A = 65
		//a = 97 goes up as the alphabet goes up
		
		
		
		
		//nodes tree is printing out from top to bottom and going to the left if possible and making right as a last resort
		//left first if possible and then right side if possible
		
		//split() method is weird. I think i should just use common sense. Like the left matters only if there is something else in it. The right does not matter
		String word = "0x1x2x3x4x5x";
		String[] chop = word.split("x");
		System.out.println(chop.length);
		System.out.println(chop[1].toString() + "?");
		
		word = "0x1x2x3x4x5x6xxxxxx";
		String[] chop2 = word.split("x");
		System.out.println(chop2.length);
		System.out.println(chop2[1].toString() + "?");
		
		word = "xxxxxxx1";
		String[] chop3 = word.split("x");
		System.out.println(chop3.length);
		System.out.println(chop3[0].toString() + "?");
		
		
		//O(notation)
		//O(1) is the fastest. By itself
		//O(n) is linear, but bigger than log(n)
		// log(n) is smaller than n = more branches is saved time
		// (log(n))^2 is bigger than log(n) = going back up the branch. takes more time but still smaller than O(n)      
		//Either way, just know that what O notation is bigger and smaller
		
		
		
		
		// '~' I understand what this means, but It going to take a while to explain here. So to simplfy. Invert the bits for the base 16 number and shift it by 1 to the left
		// Basically invert the number
		int z = 6;
		int y = ~z;
		System.out.println(z+" "+y);
		
		
		
		
		
//		32 bit integer for 10 is = 000000000000000...1010
//
//
//				8 4 2 1
//				1 0 1 0 = 10 in base ten
//				invert
//				0 1 0 1
//
//				a 32 bit integer for the inverted number is (left most bit is negative) ->11111111111111111111...0101
//
//				you could add it all together, or you can
//		        use this equation: ~x equals (-x)-1
				//if i want to invert 6, it would be -6 - 1, which equals -7
		
		
		
		
		//Hexadecimal
		System.out.println(000000000000000000037 ^ 0x28); //if there is a '0' in front of a nubmer, it is in base 8. 0x28 is hexadecimal, so base 16. At this point is just conver to binary and follow the xor operator
	}
}

//constructor problem
class Animal
{
	public Animal()
	{
		this(4); //this calls the constructor. this.variable calls the instance variables
	}
	public Animal(int numAnimals)
	{
		System.out.print(numAnimals);
	}
}

class Zoo extends Animal
{
	public Zoo()
	{
		System.out.print(8); //goes to the Animal Constructor first and the Zoo constructor to print out 8, so it will print out "48"
	}
}

