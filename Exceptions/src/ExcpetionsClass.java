
public class ExcpetionsClass {
	public static void main(String args[])
	{
		try {
			int one = 3/0;
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
		finally
		{
			System.out.println("this is the third step it goes through");
		}
	}
}
