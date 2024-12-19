package com.example.project;
import java.util.Random;

public class Day4 {
    
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    public static class Reindeer { // you must have at least a name, distance travelled, speed, run duration, and rest duration attribute
        private String name = "";
        private int DistanceTraveled = 0;
        private int speed = 0;
        private int runDuration = 0;
        private int restDuration = 0;
        private int time = 0;

        // Constructor 
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            this.name = name;
            this.speed = speed;
            this.runDuration = runDuration;
            this.restDuration = restDuration;
        }

        public int getDistanceTraveled(){ // this method is required
            return DistanceTraveled;
        }
        
        public String getName () {
            return name;
        }

        public void simulateSecond(){ //this method is required but not tested
            if (time < runDuration) {
                DistanceTraveled += speed;
            }
            time ++;
            time %= restDuration + runDuration;
        }

    }

    public static String simulateRace(int time, Reindeer[] reindeers){ //you will be tested on this method
        String winner = "";
        int max = 0;
        for (int c = 0; c < reindeers.length; c++) {
            for (int i = 0; i < time; i++) {
                reindeers[c].simulateSecond();
            }
            if (max < reindeers[c].getDistanceTraveled()) {
                max = reindeers[c].getDistanceTraveled();
                winner = reindeers[c].getName();
            }
        }
        return winner;
    }
}



