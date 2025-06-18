import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        int chu = 13;
        double moon = 0.165;
        String moons = String.format("%.6f",moon);
        
        double result = chu * moon;
        String results = String.format("%.6f",result);
        
        System.out.println(chu + " * " + moons + " = " + results);
    }
}