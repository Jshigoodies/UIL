import java.io.File;
import java.text.DecimalFormat;
import java.io.IOException;
import java.util.Scanner;

public class MainRunnerTwo {
	public static void main(String args[]) throws IOException
	{
		//Between 0 and 9525 0.10 tax
		//Between 9525 and 38700 0.12 tax
		//Between 38700 and infinity 0.22 tax
		File Data = new File("./deepa.dat");
		//trust me it works, the locations is not right, but it works
		Scanner Input = new Scanner(Data);
		
		int cases = Input.nextInt();
		
		String[] casesInfo = new String[cases]; //so i can later print it out the cases later
		
		Input.nextLine();
		for(int numCase = 0 ; numCase < cases ; numCase++)
		{
			
			int brackets = Input.nextInt();
			int[] array = new int[brackets*2]; //stores the percent and between values
			int index = 0; //used so i can keep track of it
			
			int totalMoney = Input.nextInt(); //total money
			
			Input.nextLine(); //goes to the brackets for taxes
			
			for(int i = brackets; i > 0 ; i--)
			{
				
				int min = Input.nextInt();
				
				int percent = Input.nextInt();
				
				array[index] = min;
				array[index + 1] = percent;
				Input.nextLine();
				index = index + 2;
				//after i make my array with pairs of values and tax percent, I can do the math and calculate
			}
			
			int even = 0; //contains the money value index wise (i know zero is not even, but whatever)
			int odd = 1; //contains the percent taxed index wise
			double taxed = 0; //total taxation
			int tempTotal = totalMoney;
			
			while(odd < (brackets * 2 -1)) //literally searches/stores through the whole thing and calculates it here
			{
				int withdraw = 0;
				withdraw = array[even + 2] - array[even];
				totalMoney = totalMoney - withdraw;
				if(totalMoney < 0) //just in case they run out of money
				{
					totalMoney = totalMoney + withdraw;
					break;
				}
				taxed = taxed + (withdraw * array[odd]);
						
				odd = odd + 2;
				even = even + 2;
			}
			taxed = taxed + (totalMoney * array[odd]); // left over money
			double taxPercent = (double)taxed/tempTotal;
			taxed =  (taxed * 0.01); //i forgot that percent needs to be divided by 100
			
			DecimalFormat pattern = new DecimalFormat(".###"); //formats the double variables in a specific way
			
			casesInfo[numCase] = "Case #" + (numCase+1) + ": " + pattern.format(taxed) + " " + pattern.format(taxPercent) + "%";
		}
		//finally can print it out now
		for(int i = 0 ; i < casesInfo.length; i++)
		{
			System.out.println(casesInfo[i]);
		}
	}
}


/*
2 cases:

	first case:
		3 brackets with $40000
		0 10  (i am wondering, what if the tax doesn't start at zero?, so i took consideration of this)
		9525 12
		38700 22
		
	second case:
		4 brackets with $9823
		0 10
		9525 12
		38700 22
		82500 24 <- i really don't think it will reach here but okay
*/