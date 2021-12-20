package com.careerdevs;

public class Main {

    public static void main(String[] args) {

        System.out.println(getFirstIndexValue(new int[] {3,1, 4}));

        System.out.println(getNextNum(6));
    }

    public static int getFirstIndexValue(int[] arr) {

        return arr[0];
    }

    public static int getNextNum(int num) {

        return ++num;
    }
}
