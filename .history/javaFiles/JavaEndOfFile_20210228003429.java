package javafiles;
import java.util.*;

/**
* The JavaEndOfFile.java program implemented in Java for learning purposes.
*
* @author Evanthios Papadopoulos
* @since 2/28/2021
*/ 

public class JavaEndOfFile {
    public static void main(String[] args) {
        CleanTerminalFile.main(args);
        Scanner sc = new Scanner(System.in);
        int line_num = 0;
        while(sc.hasNext())
            System.out.println(++line_num + " " + sc.nextLine());
        sc.close();
    }

}
