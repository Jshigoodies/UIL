import java.util.*;
import java.io.*;

public class Carol {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner kb = new Scanner(new File("carol.dat"));
        int numCases = kb.nextInt();
        for(int k = 0; k<numCases; k++)
        {
            String word = kb.next();
            word = word.toLowerCase();
            //System.out.println(word);
            int start = word.length()-1;
            //System.out.println(start);
            //System.out.println(word);
            String[] list = word.split("");
            for(int i = 1; i<list.length-1; i++)
            {
                if(list[i-1].equals(list[i+1]))
                {
                    start = i;
                }
            }
            //System.out.println(start);
            String front = word.substring(0,start);
            String back = word.substring(start+1);
            //System.out.println(front + "" + back);
            String[] f = front.split("");
            String[] b = back.split("");
            Arrays.sort(f);
            Arrays.sort(b);
            int totalDiff = Math.abs(f.length-b.length);
            for(int i = 0; i<Math.min(f.length, b.length); i++)
            {
                if(!(f[i].equals(b[i])))
                {
                    totalDiff++;
                }
            }
            System.out.println(totalDiff + " character(s) need to be added to convert " +word + "into a palindrome.");
        }
    }
}
