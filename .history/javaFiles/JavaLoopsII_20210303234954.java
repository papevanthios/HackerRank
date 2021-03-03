package javafiles;

import java.util.Scanner;

/**
 * The JavaLoopsII.java program implemented in Java for learning purposes.
 *
 * @author Evanthios Papadopoulos
 * @since 3/3/2021
 */ 

public class JavaLoopsII {
    public static void main(String []argh){
        CleanTerminalFile.main(args);
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int sum = a;
            for(int j=0 ; j < n ; j++){
                sum += (int) Math.pow(2, j)*b;
                System.out.print(sum + " ");
            }
            System.out.println("");
            
        }
        in.close();
        
        
    }
}
