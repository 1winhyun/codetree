import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int hap = A+B;
        double avg = (double)(A+B)/2;
        String result = String.format("%.1f", avg);

        System.out.println(hap + " " + result);
    }
}