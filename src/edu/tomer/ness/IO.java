package edu.tomer.ness;

import java.util.Scanner;

/**
 * Created by Dev on 28/03/2016.
 */
public class IO {
    static Scanner scan = new Scanner(System.in);

    static int getInt(String prompt){
        System.out.println(prompt);
        return scan.nextInt();
    }

    static Float getFloat(String prompt){
        System.out.println(prompt);
        return scan.nextFloat();
    }

    static String getString(String prompt){
        System.out.println(prompt);
        return scan.next();
    }
}
