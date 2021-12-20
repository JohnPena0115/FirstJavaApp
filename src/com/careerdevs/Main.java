package com.careerdevs;

public class Main {

    public static void main(String[] args) {

        System.out.println(getFirstIndexValue(new int[] {3,1, 4}));

        System.out.println(getNextNum(6));

        System.out.println(search(new int[] {2,3,7},3));
    }

    public static int getFirstIndexValue(int[] arr) {

        return arr[0];
    }

    public static int getNextNum(int num) {

        return ++num;
    }

    public static int search(int arr[], int item){

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == item) {

                return i;
            }
        }

        return -1;
    }
}
