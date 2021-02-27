package javafiles;
import java.util.Scanner;

/**
* The JavaOutputFormatting.java program implemented in Java for learning purposes.
*
* @author Evanthios Papadopoulos
* @since 2/28/2021
*/ 

public class JavaOutputFormatting {
    public static void main(String[] args) {
        CleanTerminalFile.main(args);

        Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                
                System.out.print( String.format("%-15s", s1) + String.format("%03d", x) + "\n"  );
       
            }
            System.out.println("================================");
            sc.close();
    }
}
