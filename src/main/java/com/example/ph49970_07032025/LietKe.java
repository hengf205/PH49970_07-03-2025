package com.example.ph49970_07032025;

public class LietKe {
    public static int lietNumber1To100(int[] number) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] <= 100) {
                return number[i];
            }
        }
        return number[number.length - 1];
    }
}
