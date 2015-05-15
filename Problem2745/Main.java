package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner standardInputScanner = new Scanner(System.in);
        String inputNumber = standardInputScanner.next();
        int radix = standardInputScanner.nextInt();
        standardInputScanner.close();

        BigInteger inputData = new BigInteger(inputNumber, radix);
        System.out.println(inputData);
    }
}
