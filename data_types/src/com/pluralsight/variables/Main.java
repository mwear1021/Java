package com.pluralsight.variables;

public class Main {
    public static void main(String[] args) {
        // Strongly typed language

        // int types:
        byte numberOfEnglishLetters = 26; // byte type range: -128 - 127
        short feetInAMile = 5280; // between -32768 - 32767
        int studentCount = 100; // -2 billion - +2 billion
        long milesInALightyear = 5879000000000L; // ends in L when assigned a value

        System.out.printf("\nByte type: Number of English Letters: %d\n", numberOfEnglishLetters);
        System.out.printf("Short type: Number of feet in a mile: %d\n", feetInAMile);
        System.out.printf("Int type: Number of students in a grade: %d\n", studentCount);
        System.out.printf("Long type: Number of miles in a light year: %d\n\n", milesInALightyear);

        // boolean type
        boolean hasACodingJob = false;
        System.out.printf("\nI currently have a coding job right now: %b\n\n", hasACodingJob);

        // floating point type & double
        float approximationOfPi = 3.14159f; // must end in f; 32 bit
        double doubleApproxOfPi = 3.14159d; // optionally ends in d; 64 bit
        System.out.printf("Float approximation of pi: %f\n", approximationOfPi);
        System.out.printf("Double approximation of pi: %f\n\n", doubleApproxOfPi);

        // char type
        char letterM = 'm'; // must be single quotes or else string
        System.out.printf("Char type (letter 'm'): %s\n\n", letterM);

        // constant (final)
        final int daysPerYear = 365;
        System.out.printf("\nDays per year: %d\n\n", daysPerYear);

    }
}