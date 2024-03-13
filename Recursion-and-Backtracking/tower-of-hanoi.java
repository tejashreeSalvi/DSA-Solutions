// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.io.*;

class towerOfHanoi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); 
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        toh(n, a, b, c);
    }
    
    public static void toh(int n, int a, int b, int c){
        if (n == 0){
            return;
        }
        toh(n-1, a, c, b);
        System.out.println("[" + a + "-->" + b + "]");
        toh(n-1, c, b, a);
    }
}