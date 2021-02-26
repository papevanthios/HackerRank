package javafiles;
import java.util.*;

/**
* The JavaStdinAndStdoutI.java program implemented in Java for learning purposes.
*
* @author Evanthios Papadopoulos
* @since 2/26/2021
*/ 

public class JavaStdinAndStdoutI {
    public static void main(String[] args) {
        CleanTerminalFile.main(args);
        
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
     
}
