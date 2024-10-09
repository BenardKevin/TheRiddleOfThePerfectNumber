import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger nb = BigInteger.ZERO;
        do {
            System.out.print("Enter number : ");
            String nbStr  = sc.nextLine();
            nb = new BigInteger(nbStr);

            if (isPerfect(nb)) System.out.print(nb + " is perfect.\n");
            else System.out.print(nb + " is not perfect.\n");

        } while(!nb.equals(BigInteger.ZERO));
        sc.close();
    }

    public static boolean isPerfect(BigInteger nb) {
        BigInteger somDiv = BigInteger.ZERO;
        for (BigInteger i = BigInteger.ONE; i.compareTo(nb) < 0; i = i.add(BigInteger.ONE)) if (nb.mod(i).equals(BigInteger.ZERO)) somDiv = somDiv.add(i);
        return somDiv.equals(nb);
    }
}