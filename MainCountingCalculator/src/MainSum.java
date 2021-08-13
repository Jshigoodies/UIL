import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MainSum {
	public static void main(String[] args) throws IOException
	{
		File f = new File("file.dat");
        Scanner input = new Scanner(f);

        int sum = 0;
        while(input.hasNextLine())
        {
            String data = input.nextLine();
            int cut = data.indexOf(':');
            data = data.substring(cut + 2); //extra space
            sum = sum + Integer.parseInt(data);
        }
        System.out.println(sum);
	}
}
