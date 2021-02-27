package javafiles;
import java.util.*;

/**
* The JavaIfElse.java program implemented in Java for learning purposes.
*
* @author Evanthios Papadopoulos
* @since 2/28/2021
*/ 

public class JavaIfElse {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CleanTerminalFile.main(args);

            int N = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    
    if(N%2!=0){
            System.out.print("Weird");
        }
        else if(N%2==0 && N>=2 && N<=5){
            System.out.print("Not Weird");
        }
        else if(N%2==0 && N>=6 && N<=20){
            System.out.print("Weird");
        }
        else if(N%2==0 && N>20){
            System.out.print("Not Weird");
        }
    
    
            scanner.close();
    }
}
