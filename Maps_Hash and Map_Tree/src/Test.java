import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(new File("C:\\Users\\Jshi\\Desktop\\UIL\\Maps_Hash and Map_Tree\\src\\kelly.dat"));
		String code = " ABCDEFGHIJLMNOPQRSTUVWXYZ";
		while (s.hasNext()) {
			Scanner data = new Scanner(s.nextLine());
			while (data.hasNextInt())
			{
				int r = data.nextInt();
				int c = data.nextInt();
				if (r == 0) System.out.print(' ');
				else System.out.print(code.charAt((r - 1) * 5 + c));
			}
			System.out.println();
			data.close();
		}
		s.close();
	}
}

