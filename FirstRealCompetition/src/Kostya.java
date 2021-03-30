import java.util.*;
import java.io.*;

public class Kostya {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner kb = new Scanner(new File("kostya.dat"));
        int numCases = kb.nextInt();
        for(int i = 0; i < numCases; i++) {
            int numOfPairs = kb.nextInt();
            int amountHeld = kb.nextInt();
            int numOfSocks = (numOfPairs*2)-amountHeld;
            double prob = (numOfSocks-amountHeld)/(numOfSocks+0.0);
            System.out.printf("%.4f", prob);
            System.out.println();
        }
    }
}
