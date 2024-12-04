// 12S24057 - Laura Awise Sirumapea
// 12S24017 - Arya Pratama Sinambela

import java.util.*;
import java.lang.Math;

public class T06 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] buddy = new String[4];
        int n;

        n = 0;
        inisialisasi(buddy);
        n = func_input(buddy, n);
        output(buddy, n);
    }
    
    public static void inisialisasi(String[] buddy) {
        int e;

        for (e = 0; e <= 3; e++) {
            buddy[e] = "";
        }
    }
    
    public static int func_input(String[] buddy, int n) {
        int i;

        for (i = 0; i <= 3; i++) {
            buddy[i] = input.nextLine();
            if (buddy[i].equals("---")) {
                i = 4;
            } else {
                n = n + 1;
            }
        }
        
        return n;
    }
    
    public static void output(String[] buddy, int w) {
        int a;

        for (a = 0; a <= w - 1; a++) {
            System.out.println(buddy[a]);
        }
    }
}
