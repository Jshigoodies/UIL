import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Books {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f = new File("./books.dat");
		Scanner input = new Scanner(f);
		
		int c = input.nextInt();
		
		for(int i = 0; i<c; i++)
		{
			double max = input.nextDouble();
			int numBooks = input.nextInt();
			
			double[] b = new double[numBooks];
			
			for(int k = 0; k<numBooks; k++)
			{
				b[k] = input.nextDouble();
			}
			
			Arrays.sort(b);
			
			/*
			for(double j : b)
			{
				System.out.println(j);
			}
			*/
			
			
			int take = 0;
			
			DecimalFormat obj = new DecimalFormat(".##");
			
			for(int j = 0; j<b.length; j++)
			{
				BigDecimal m = new BigDecimal(max);
				BigDecimal s = new BigDecimal(b[j]);
				//System.out.println(m.subtract(s).doubleValue());
				if(m.subtract(s).doubleValue() >= 0)
				{

					take++;
					double a = m.subtract(s).doubleValue();
					
					max = Double.parseDouble(obj.format(a));
					
				}
				else
				{
					break;
				}
			}
			
			System.out.println(take);
		}
		
		
		input.close();
	}

}
