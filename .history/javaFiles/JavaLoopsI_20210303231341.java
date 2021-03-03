package javafiles;

import java.util.Scanner;

/**
 * The JavaLoopsI.java program implemented in Java for learning purposes.
 *
 * @author Evanthios Papadopoulos
 * @since 3/3/2021
 */

public class JavaLoopsI {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CleanTerminalFile.main(args);

        int N = scanner.nextInt();
        Scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        for(int i = 1; i <= 10; i++){
            System.out.println(N + " x " + i + " = " + N*i);
        }

        scanner.close();
    }
}
