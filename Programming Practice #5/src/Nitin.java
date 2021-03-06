import java.util.*;
import java.io.*;
public class Nitin {
	public static void main(String args[]) throws IOException
	{
		File data = new File("./nitin.dat");
		Scanner Input = new Scanner(data);
		
		
		Queue<String> dog = new LinkedList<String>();
		Queue<String> cat = new LinkedList<String>();
		
		int numPets = Input.nextInt();
		//put the pets in a queue array
		for(int pets = 0; pets<numPets; pets++)
		{
			
			String name = Input.next();
			String type = Input.next();
			//System.out.println(name + " " + type); //just checking if this worked
			
			if(type.equals("D")) //it's a dog
			{
				dog.add(name);
			}
			else //it's a cat then
			{
				cat.add(name);
			}
		}
		
		//now for the people
		int people = Input.nextInt();
		for(int p = 0; p<people; p++)
		{
			String name = Input.next();
			String typeWant = Input.next();
			
			//System.out.println(name + " " + typeWant);
			
			if(typeWant.equals("D"))
			{
				if(!dog.isEmpty())
				{
					System.out.println(name + " DOG " + dog.remove());
				}
				else
				{
					System.out.println(name + " WAIT LIST DOG");
				}
			}
			else //wants a cat
			{
				if(!cat.isEmpty())
				{
					System.out.println(name + " CAT " + cat.remove());
				}
				else
				{
					System.out.println(name + " WAIT LIST CAT");
				}
			}
			
		}
		Input.close();
	}
}
