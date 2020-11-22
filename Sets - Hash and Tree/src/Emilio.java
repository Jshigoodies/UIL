import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Set; 
import java.util.ArrayList;
import java.text.DecimalFormat;
public class Emilio {
	public static void main(String args[]) throws IOException
	{
		File Data = new File("C:\\Users\\Jshi\\Desktop\\UIL\\Sets - Hash and Tree\\src\\emilio.dat"); //use file class and scanner to put in the values
		Scanner Input = new Scanner(Data);
		
		int numCase = Input.nextInt();
		
		for(int i = 1; i<=numCase; i++)
		{
			Input.nextLine();
			int values = Input.nextInt();
			ArrayList<Double> list = new ArrayList<Double>();
			Input.nextLine();
			
			for(int numRan = values; numRan>0; numRan--) //stores the data
			{
				if(Input.hasNextDouble())
				{
					list.add(Input.nextDouble());
				}
				else
				{
					Input.nextLine();
					list.add(Input.nextDouble());
				}
			}
			
			double sumShort = 0;
			double sumLong = 0;
			
			for(int times = 10; times>0; times--) //calculate the shortest runs
			{
				double smallest = list.get(0);
				int rmVal1 = 0;
				for(int index = 0; index < list.size(); index++)
				{
					
					if(smallest > list.get(index))
					{
						smallest = list.get(index);
						rmVal1 = index;
					}
				}
				list.remove(rmVal1);
				sumShort = sumShort + smallest;
			}
			for(int times = 10; times>0; times--) //calculate the longest run
			{
				double biggest = list.get(0);
				int rmVal1 = 0;
				for(int index = 0; index < list.size(); index++)
				{
					
					if(biggest < list.get(index))
					{
						biggest = list.get(index);
						rmVal1 = index;
					}
				}
				list.remove(rmVal1);
				sumLong = sumLong + biggest;
			}
			DecimalFormat pattern = new DecimalFormat(".#");
			System.out.println(i + ": " + pattern.format(sumLong/10) + "\n" + i + ": " + pattern.format(sumShort/10) + "\n------");
		}
		
	}
}


/*
3 - number of cases
25 - number of times he ran
5.6 3.3 3.5 6.2 4.1 6.3 6.4 - each number is a distance
6.1 7.6 4.4 3.0 7.8 4.2
4.6 3.4 8.5 4.2 6.6 9.5 9.7 9.3 3.5 7.2
5.5 3.5
35 - number of times he ran
8.5
5.9 8.5 9.9 9.8 8.3 7.2 6.9
3.8 9.3 6.2 7.7
4.2 7.1 3.4 7.2 4.5 3.2 5.9
5.2 6.8 7.7
9.6 5.5 8.1 10.0
6.2 3.7 5.2 5.8 3.7 4.3 9.1 9.1
3.9
27 - number of times he ran
7.7 6.2 9.3 9.7 8.5 8.2 8.2 3.4
3.3 9.8 9.2 6.8 3.1 9.7 8.6 7.5
6.1 8.5 5.6 6.1 9.9 5.7 3.7 5.2
4.5 10.0
8.3
*/