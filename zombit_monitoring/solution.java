package com.google.challenges;

public class Answer {
    public static int answer(int[][] intervals) {
        if(intervals.length ==0) return 0;

        int startMin = Integer.MAX_VALUE;
        int endMax = 0;
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] < startMin) startMin = intervals[i][0];
            if (intervals[i][1] > endMax) endMax = intervals[i][1];
        }
        return endMax - startMin;
    }
}
