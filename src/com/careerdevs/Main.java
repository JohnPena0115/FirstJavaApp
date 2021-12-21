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

        System.out.println(existsHigher(new int[] {5, 3, 15, 22, 4}, 10));

        System.out.println(getCount("Mississippi Massachusetts Missouri Main"));
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


    public static boolean existsHigher(int[] arr, int n) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= n) {

                return true;
            }
        }

        return false;
    }


    public static int getCount(String str) {
        int vowelsCount = 0;
        char index;

        // Your code here

        for (int i = 0; i < str.length(); i++){

            index = str.charAt(i);

            if (index == 'a' || index == 'e' || index == 'i' || index == 'o'
                    || index =='u') {

                vowelsCount++;
            }
        }

        return vowelsCount;
    }

    /*
     This line was the bane of my existence for half an hour: index = str.charAt(i);
     I had originally written it as index = str.charAt[i]; and couldn't figure out what was
     wrong with my program. It was only when I copy-pasted my code from edabit to Intellij that
     I was able to spot the error

     Cannot find symbol was the relevant message for this error

     I then tried to rewrite the code with a switch statement. Unfortunately I deleted a closing
     curly brace in the process and edabit's "Reached end of file while parsing" whispered sweet
     nothings in my ear.

     public static int getCount(String str) {
    int vowelsCount = 0;
		char index;

    // Your code here

	for (int i = 0; i < str.length(); i++){

		index = str.charAt(i);

		switch(index) {

			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				vowelsCount++;
				break;

		 }
	 }
		return vowelsCount;
  }
}
     */

    /*

    Revision 1 =>

    Rewrote the switch statement to account for the frequency of appearance for English
    vowels:

    switch(index) {

			case 'e':
			    vowelsCount++;
				break;

			case 'a':
			    vowelsCount++;
				break;

			case 'i':
			    vowelsCount++;
				break;

			case 'o':
			    vowelsCount++;
				break;

			case 'u':
			    vowelsCount++;
				break;

			case 'E':
			    vowelsCount++;
				break;

			case 'A':
			    vowelsCount++;
				break;

			case 'I':
			    vowelsCount++;
				break;

			case 'O':
			    vowelsCount++;
				break;

			case 'U':
				vowelsCount++;
				break;

		 }

    */


  }

