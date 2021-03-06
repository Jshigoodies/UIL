import java.util.*;
import java.io.*;
public class Willie {

	public static void main(String args[]) throws IOException {
	    File data = new File("./willie.dat");
        Scanner Input = new Scanner(data);


        //test cases
        int testCase = Input.nextInt();
        for (int run = 0; run < testCase; run++) {
            ArrayList<String> list = new ArrayList<String>();
            int grid = Input.nextInt();

            while (grid != 0) {
                String s = Input.nextLine();

                if (s.indexOf("|") != -1) {
                    s = s.replaceAll(" Q ", "1");
                    s = s.replaceAll("   ", "0");
                    s = s.replace("|", "");

                    list.add(s);

                    //System.out.println(s);
                    grid--;
                }


            }


            System.out.print(check(list)); //where i can determine if it is a solution or not


            Input.nextLine(); //for the last --------------
            Input.nextLine(); //for the ************
            System.out.println(); //for organization purposes
        }
        Input.close(); //good practice to do that

    }

    public static String check(ArrayList<String> board) {
        int[] list = new int[board.size()];
        for (int i = 0; i < board.size(); i++) {
            //horizontal
            //System.out.print(board.get(i).indexOf("1"));
            if(board.get(i).indexOf("1") == board.get(i).lastIndexOf("1"))
            {
                list[i] = board.get(i).indexOf("1"); //stores data of queens position and only the positions. The rows would be the index of those numbers in the array
            }
            else
            {
                return "incorrect attempt";
            }

        }

        for(int i = 0; i<list.length; i++)
        {
            //vertical
            for(int index = i + 1; index < list.length; index++)
            {
                if(list[i] == list[index])
                {
                    return "incorrect attempt";
                }
            }
            //diagonal right
            int numAdd = list[i] + 1;
            for(int index = i + 1; index < list.length; index++)
            {
                if(list[index] == numAdd)
                {
                    return "incorrect attempt";
                }
                else
                {
                    numAdd++;
                }
            }

            //diagonal left
            int numSubtract = list[i] - 1;
            for(int index  = i + 1; index < list.length; index++)
            {
                if(list[index] == numSubtract)
                {
                    return "incorrect attempt";
                }
                else
                {
                    numSubtract--;
                }
            }
        }

        return "valid solution";
    }
}
