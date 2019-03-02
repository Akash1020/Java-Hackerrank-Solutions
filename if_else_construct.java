import java.util.Scanner;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Created by cvikas10 on 2/22/2019.
 */
public class if_else_construct {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main (String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        if (N % 2 != 0) {
            System.out.println("Weird");
        }
        if ((N % 2 == 0) & (N >= 2) & (N <= 5)) {
            System.out.println("Not Weird");
        }
        if ((N % 2 == 0) & (N >= 6) & (N <= 20)) {
            System.out.println("Weird");
        }
        if ((N % 2 == 0) & (N > 20)) {
            System.out.println("Not Weird");
        }
    }
}
