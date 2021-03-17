import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Base {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("base.dat");
		Scanner input = new Scanner(f);
		
		
		
		while(input.hasNextInt()) {
			int num = input.nextInt();
			int numbackup = num;
//			System.out.println(num);
			String line = "";
			
			int prev = 1;
			int front = 2;
			
			int index = 2; //just in case the number is like 2 so i can subtract the index to be 1
			
			int[] list = new int[1000];
			list[0] = prev;
			list[1] = front;
			
			for(int i = 0 ; i < list.length-2 ; i++)
			{
				//get the numbers
				if(front>num)
				{
					index = i + 2;
					break;
				}
				prev = front;
				front = list[i] + list[i+1];
				list[i+2] = front;
				
			}
			
			/*
			for(int k:list)
			{
				System.out.print(k + " ");
			}
			*/
			
			while(num != 0)
			{
				if((num - list[index-1]) >= 0)
				{
					num = num - list[index-1];
					
					
					line = line + list[index-1];
					if(num != 0)
					{
						line = line + " + ";
					}
					
				}
				index--;
				/*
				if(index == 0)
				{
					System.out.println("Should not be here");
					break;
				}
				*/
			}
			
			System.out.println(numbackup + " = " + line);
				

				
			
			
		}
		input.close();
			
	}

}
