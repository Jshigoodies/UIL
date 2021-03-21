import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Image {
	public static void main(String args[]) throws IOException
	{
		File f = new File("image.dat");
		Scanner input = new Scanner(f);
		
		int c = input.nextInt();
		
		for(int go = 0; go<c; go++)
		{
			int mine = input.nextInt();
			int width = input.nextInt();
			int height = input.nextInt();
			
			String[][] imagePixelsOriginal = new String[width][height];
			String[][] imaginePixelsDifferent = new String[width][height];
			
			
			//for loop for my images
			
			
			
			
			//for loop for comparing the images
		}
		
	}
}
