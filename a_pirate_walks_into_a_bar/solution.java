package com.google.challenges;

public class Answer {

    public static int answer(int[] numbers) {
        int pre = numbers[0];
        int count = 0;

        while (true) {
            int next = numbers[pre];
            if (next < 0) {
                return next-count+1;
            }
            numbers[pre] = --count;
            pre = next;
        }
    }    
}
