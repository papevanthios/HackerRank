package javafiles;
import java.util.Scanner;

/**
* The JavaStdinAndStdoutII.java program implemented in Java for learning purposes.
*
* @author Evanthios Papadopoulos
* @since 2/26/2021
*/ 

public class JavaStdinAndStdoutII {
    public static void main(String[] args) {
        CleanTerminalFile.main(args);

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        scan.close();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
