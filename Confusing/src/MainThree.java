import java.util.Set;
import java.util.TreeSet;

public class MainThree {

	public static void main(String[] args) {
		
		System.out.println("##Hall  oween**".trim()); //only trims from the outside of the string
		String word = "          a    b                ";
		System.out.println(word.trim());
		
		
		
		
		
		int x = 0;
		do {
			System.out.println("#");
		}
		while(x++<5);
		//x++ returns x first and then adds 1
		//0, 1, 2, 3, 4, 5. During when x = 0, it prints a '#'. During when x = 1, it prints a '#'. During when x = 5 when x return 4, it prints out a '#'
		
		
		
		
		int t = 1, y;
		/*
		 * Literally the same thing as 
		 * int t = 1;
		 * int y;
		 */
		System.out.println(t + " and 'y' is only initialized as an int");
		
		//I didn't really get this wrong, I just thought it might be good to know
		
		
		System.out.println(Byte.MIN_VALUE + " " + Byte.MAX_VALUE);
		
		
		
		
		
		//regex
//		[abc]	Find one character from the options between the brackets
//		[^abc]	Find one character NOT between the brackets
//		[0-9]	Find one character from the range 0 to 9
		
//		
//		|	Find a match for any one of the patterns separated by | as in: cat|dog|fish
//		.	Find just one instance of any character
//		^	Finds a match as the beginning of a string as in: ^Hello
//		$	Finds a match at the end of the string as in: World$
//		\d	Find a digit
//		\s	Find a whitespace character
//		\b	Find a match at the beginning of a word like this: \bWORD, or at the end of a word like this: WORD\b
//	    \ uxxxx	Find the Unicode character specified by the hexadecimal number xxxx
		
		
		
//		n+	Matches any string that contains at least one n
//		n*	Matches any string that contains zero or more occurrences of n
//		n?	Matches any string that contains zero or one occurrences of n
//		n{x}	Matches any string that contains a sequence of X n's
//		n{x,y}	Matches any string that contains a sequence of X to Y n's
//		n{x,}	Matches any string that contains a sequence of at least X n's
		
		String s = "abcde";
		for(int i = 0; i<s.length(); i++){
			System.out.print(s.substring(i,i+1).matches("[aeiou]*") + " "); //you can put |, ., $, \d, \s, \b in place of the x-or '^'
		}
		System.out.println();
		
		
		/* Question 36
		 * Weighted meanseach edge has a value. Directed means you can only travel one direction along an edge. This graph is not complete because not every pair of vertices are connected.
		 */
		
		
		
		
		Set<String> sList = new TreeSet<String>();
		//TreeSets automatically orders the strings
		sList.add("a");
		sList.add("c"); // out of order
		sList.add("d");
		sList.add("b");
		
		System.out.println(sList+ " " + sList.remove("b") + "removed 'b' " + sList);
		
		
		
	}

}
