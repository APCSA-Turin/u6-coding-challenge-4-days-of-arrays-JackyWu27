
package com.example.project;
import java.util.Random;

public class Day2{
    public static String[][] nameSort(String[] names){ // your will be tested on this method
        String [] a = new String [names.length];
        String [] b = new String [names.length];
        int countA = 0;
        int countB = 0;
        for (int c = 0; c < names.length; c++){
            int or = (int) Math.random() * 2;
            if (or == 0) {
                a[countA] = names[c];
                countA++;
            } else {
                b[countB] = names[c];
                countB++;
            }
        }
        
        String [][] d = {a,b};
        return d; //you must return a two dimensional string array
    }

    public static void main(String[] args) {

    }
}