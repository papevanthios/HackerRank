package ProblemSolving.Algorithms;
import java.io.*;
import java.util.Scanner;

import javafiles.CleanTerminalFile;

/**
* The SolveMeFirst.java program implemented in Java for learning purposes.
*
* @author Evanthios Papadopoulos
* @since 3/3/2021
*/ 

public class SolveMeFirst {
    static int solveMeFirst(int a, int b) {
        return a + b;

 }

public static void main(String[] args) {

    CleanTerminalFile.main(args);

    Scanner in = new Scanner(System.in);
    int a;
    a = in.nextInt();
    int b;
    b = in.nextInt();
    int sum;
    sum = solveMeFirst(a, b);
    System.out.println(sum);
    in.close();
 }
}
