import java.io.*;
import java.util.*;
public class Arti {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f = new File("arti.dat");
		Scanner input = new Scanner(f);
		
		int c = input.nextInt();
		
		for(int i = 0; i<c; i++)
		{
			int num = input.nextInt();
			double num2 = Math.sqrt(num);
			System.out.print(num + " ");
			System.out.printf("%.3f", num2);
			System.out.println();
		}
		
	}

}
