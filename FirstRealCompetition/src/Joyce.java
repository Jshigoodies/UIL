import java.io.*;
import java.util.*;

public class Joyce {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("joyce.dat");
		Scanner input = new Scanner(f);
		
		int c = input.nextInt();
		input.nextLine();
		for(int i = 0; i < c; i++)
		{
			String ap = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
			String[] list = ap.split(" ");
			String phrase = input.nextLine();
			String[] phraseList = phrase.toLowerCase().replace(" ", "").split("");
			TreeMap<String, Integer> map = new TreeMap<>();
			for(int k = 0; k < 26; k++) {
				map.put(list[k], 1);
			}
			//System.out.println(Arrays.toString(phraseList));
			for(int k = 0; k < phraseList.length; k++) {
				if (map.containsKey(phraseList[k])) {
					map.put(phraseList[k], map.get(phraseList[k]).intValue()-1);
				}
			}
			String missing = "";
			boolean perfect = true;
			for(int k = 0; k < 26; k++) {
				if (map.get(list[k]).intValue()>0) {
					missing += list[k];
				} else if (map.get(list[k]).intValue()<0) {
					perfect = false;
				}
			}
			if (missing.length()==0 && perfect) {
				System.out.println("perfect pangram");
			} else if (missing.length()==0 && !perfect) {
				System.out.println("pangram");
			} else {
				System.out.println("missing " + missing);
			}
		}
	}
}


