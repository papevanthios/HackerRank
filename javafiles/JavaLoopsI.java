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

        int n = scanner.nextInt();
        
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }

        scanner.close();
    }
}
