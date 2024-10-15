import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Exam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();

        double h = 1/(w * Math.sqrt(1 + 5 * Math.pow(w, 2) + 4 * Math.pow(w, 3)));

        System.out.println(h);
    }
}
