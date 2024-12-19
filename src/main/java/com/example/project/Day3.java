package com.example.project;

public class Day3 {
      public static String[][] generateSnowflake(int size) { //you will be tested on this method
        String[][] grid = new String[size][size];
        for (int c = 0; c < size; c++){
          for (int count = 0; count < size; count++){
            if (c == size  / 2){
              grid [c][count] = "*";
            } else if (count == size/2) {
              grid [c][count] = "*";
            } else if (count == 0 + c) {
              grid [c][count] = "*";
            } else if (count == size - 1 - c) {
              grid [c][count] = "*";
            } else {
              grid [c][count] = " ";
            }
          }
        }
        return grid;
    }

    // Prints the snowflake  will be useful if tests fail (you will not be tested on this method)
    public static void printSnowflake(String[][] snowflake) {
      for (int c = 0; c < snowflake.length; c++){
        for (int count = 0; count < snowflake.length; count++){
          System.out.print(snowflake [c] [count]);
        }
        System.out.println();
      } 
    }

    // Test for the snowflake generation
    
}
