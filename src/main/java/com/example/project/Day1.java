package com.example.project;
import java.util.Random;
public class Day1{
    private static String[] elf_names = {"Glitter", "Chocolate","Tiny","Snowflake","Frosty"};

    public static String generateElfName(String name){
        if (name == "" || name == null) {
            IllegalArgumentException s = new IllegalArgumentException("Name cannot be null or empty");
            throw s;
        } else {
            return elf_names[(int) Math.random() * 5] + " " + name;  
        }
    }
}