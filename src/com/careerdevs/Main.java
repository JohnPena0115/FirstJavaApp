package com.careerdevs;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        System.out.println(getFirstIndexValue(new int[] {3,1, 4}));

        System.out.println(getNextNum(6));

        System.out.println(search(new int[] {2,3,7},3));

        System.out.println(convert(12));

        System.out.println(countWords("We wish you a Merry Christmas and a Happy New Year"));

        System.out.println(reverse(true));
    }


    public static int getFirstIndexValue(int[] arr) {

        return arr[0];
    }


    public static int getNextNum(int num) {

        return ++num;
    }


    public static int search(int[] arr, int item){

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == item) {

                return i;
            }
        }

        return -1;
    }


    public static int convert(int minutes){

         return minutes * 60;

    }


    public static int countWords(String s) {
        int words = 1;
        for (int i = 0; i < s.length(); i++){

            if (s.charAt(i) == ' '){

                words++;

            }
        }

        return words;
    }

    /*
     Another ways of tackling the problem:

      int count = 1;
      for(int i = 0; i < s.length(); i++)
        if(Character.isWhitespace(s.charAt(i)))
          count++;
      return count;

      public static int countWords(String s) {
      return s.split(" ").length;
    }

   */

    public static boolean reverse(boolean b) {

        return !b;

    }


}
