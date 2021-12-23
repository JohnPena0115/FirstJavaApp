package com.careerdevs;

 public class Main {

    public static void main(String[] args) {

        System.out.println(getFirstIndexValue(new int[] {3,1, 4}));

        System.out.println(getNextNum(6));

        System.out.println(search(new int[] {2,3,7},3));

        System.out.println(convert(12));

        System.out.println(countWords("We wish you a Merry Christmas and a Happy New Year"));

        System.out.println(reverse(true));

        System.out.println(existsHigher(new int[] {5, 3, 15, 22, 4}, 10));

        System.out.println(getCount("Mississippi Massachusetts Missouri Maine"));

        System.out.println(giveMeSomething("is amiss"));

        System.out.println(rev(-512));

        System.out.println("01:22".split(":")[0]);

        System.out.println(minutesToSeconds("07:59"));

        System.out.println(differenceMaxMin(new int[] {12, 15, -1, 7, 99}));

        System.out.println(doubleLetters("All"));

        System.out.println(doubleLetters("Lagoon"));

        System.out.println(doubleLetters("Aardvark"));

        System.out.println(doubleLetters("Enter"));
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
     curly brace in the process and Edabit's "Reached end of file while parsing" whispered sweet
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

    public static String giveMeSomething(String input) {

         return "something " + input;

    }

    /*

    Surprisingly, this gave me problems because I had written "string input" on as opposed
    to "String input". Still getting use to Java.
    */


         public static String rev(int n) {
             String reversedNumber = "";

             if (n < 0){

                 n = n * - 1;
             }

             while (n/10 > 0) {

                 reversedNumber += String.valueOf(n % 10);

                 n /= 10;
             }

             if (n < 10 ){

                 reversedNumber += String.valueOf(n);
             }

             return reversedNumber;

         }


        public static int minutesToSeconds(String tm) {


         int minutes = Integer.valueOf(tm.split(":")[0]);
         int seconds = Integer.valueOf(tm.split(":")[1]);

         if (seconds >= 60){

             return -1;
         }

         return minutes*60 + seconds;

        }

        public static int differenceMaxMin(int[] arr) {

         int max = arr[0];
         int min = arr[0];

         for (int i = 1; i < arr.length; i++){

             if (arr[i] > max) {

                 max = arr[i];
             }

             if (arr[i] < min ) {

                 min = arr[i];
             }


         }

         return max - min;

        }


          public static boolean doubleLetters(String word) {

             String lowercaseArg = word.toLowerCase();

             boolean doubleLetters = false;

             int previousIndex = 0;
             int currentIndex = 1;

             char previousChar = ' ';
             char currentChar = ' ';


             while (currentIndex < word.length()) {

                 previousChar = lowercaseArg.charAt(previousIndex);
                 currentChar = lowercaseArg.charAt(currentIndex);

                 if (previousChar == currentChar){

                     doubleLetters = true;
                     break;
                 }

                 previousIndex++;
                 currentIndex++;
             }

             return doubleLetters;

         }
     }






