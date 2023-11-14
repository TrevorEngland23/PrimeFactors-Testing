import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter an integer between 0-1000: ");
        Scanner scanner = new Scanner(System.in);

        int userInput = scanner.nextInt();

        List<Integer> primeFactors = getPrimeFactors(userInput);

        System.out.println(primeFactors);

        scanner.close();
    }

    public static List<Integer> getPrimeFactors(int number){
        PrimeFactors determinePrimeFactors = new PrimeFactors();
        return determinePrimeFactors.resolve(number);
    }

}
