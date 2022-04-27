package com.dziekan30;

public class NumberToWords {
    public static int reverse(int number) {
        int reverseNumber = 0;

        while (number != 0) {
            // First you need calculate last digit of the number
            int lastDigit = number % 10;
            // If you have last digit you need calculate reverse number. Reverse number was
            // calculated in this pattern actual reverseNumber = reverseNumber * 10 + last Digit.
            reverseNumber = (reverseNumber * 10) + lastDigit;
            //The last step you need to take is to delete the last digit from the number
            //Simpler way: number = number / 10
            number /= 10;
        }
        return reverseNumber;
    }
}
