import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Deepa {

    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("C:\\Users\\Jshi\\Desktop\\UIL\\Programming Practice #1\\dat files\\deepa.dat"));
            int cases = s.nextInt();

            Map<Integer, Integer> brackets = new HashMap<>();

            for (int i = 0; i < cases; i++) {

                int countBrackets = s.nextInt();
                int income = s.nextInt();
                int[] bracketAmounts = new int[countBrackets];
                double[] bracketPercents = new double[countBrackets];
                for (int j = 0; j < countBrackets; j++) {
                    bracketAmounts[j] = s.nextInt();
                    bracketPercents[j] = s.nextInt() / 100.0;
                }
                double taxed = applyTax(bracketAmounts, bracketPercents, income);
                System.out.printf("Case #%d: $%.2f %.3f%%\n", i+1, taxed, ((taxed/income)*100));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static double applyTax(int[] ba, double[] bp, int income) {
        double balance = income;
        double tax = 0;
        for (int i = 0; i < ba.length - 1 && balance >= 0; i++) {
            int taxableAmount = ba[i + 1]-ba[i];
            double percent = bp[i];
            double oldBalance = balance;
            balance=Math.max(0, balance-taxableAmount);
            double diff = oldBalance-balance;
            tax+=diff*percent;
        }
        tax+=balance*bp[bp.length-1];
        return tax;
    }
}
