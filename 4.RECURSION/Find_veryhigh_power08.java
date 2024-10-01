import java.math.BigInteger;
import java.util.Scanner;

public class Find_veryhigh_power08 {
    public static BigInteger Powerofnum(BigInteger a, BigInteger b) {
        if (b.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        } else {
            BigInteger halfPower = Powerofnum(a, b.divide(BigInteger.valueOf(2)));
            BigInteger result = halfPower.multiply(halfPower);
            if (b.mod(BigInteger.valueOf(2)).equals(BigInteger.ONE)) {
                result = result.multiply(a);
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a and b");
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        BigInteger res = Powerofnum(a, b);
        System.out.println("The power of " + a + "^" + b + " is: " + res);
    }
}
