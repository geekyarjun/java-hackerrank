import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat nF = NumberFormat.getCurrencyInstance(Locale.US);
        String us = nF.format(payment);
        System.out.println("US: " + us);

        nF = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = nF.format(payment);
        System.out.println("India: " + india);

        nF = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = nF.format(payment);
        System.out.println("China: " + china);

        nF = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nF.format(payment);
        System.out.println("France: " + france);
    }
}