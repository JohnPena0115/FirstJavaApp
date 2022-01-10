package com.careerdevs;

public class Main {

    public static void main(String[] args) {
        //1.1
        System.out.println(getFirstIndexValue(new int[]{3, 1, 4}));

        //1.2
        System.out.println(getNextNum(6));

        //1.3
        System.out.println(search(new int[]{2, 3, 7}, 3));

        //1.4
        System.out.println(convert(12));

        //1.5
        System.out.println(giveMeSomething("is amiss"));


        //2.1
        System.out.println(reverse(true));

        //2.2
        System.out.println(countWords("We wish you a Merry Christmas and a Happy New Year"));


        //2.3
        System.out.println(existsHigher(new int[]{5, 3, 15, 22, 4}, 10));

        //2.4
        System.out.println(getVowelCount("Mississippi Massachusetts Missouri Maine"));

        System.out.println(rev(-512));

        System.out.println("01:22".split(":")[0]);

        System.out.println(minutesToSeconds("07:59"));

        System.out.println(differenceMaxMin(new int[]{12, 15, -1, 7, 99}));

        System.out.println(doubleLetters("All"));

        System.out.println(doubleLetters("Lagoon"));

        System.out.println(doubleLetters("Aardvark"));

        System.out.println(doubleLetters("Enter"));

        //3.1
        System.out.println(sum(7, -9));

        //3.2
        System.out.println(isNumSame(7, -7));

        //3.3
        System.out.println(calcAge(27));

        //3.4
        System.out.println(helloName("Aes Sedai"));

        //3.5
        System.out.println(reverse("Desserts"));
        System.out.println(reverse("Flow"));
        System.out.println(reverse("Tort"));

        //4.1
        System.out.println(makesTen(-11, 21));

        //4.2
        System.out.println(numberSyllables("wop-ba-ba-lu-mop-a-wap-bam-boom"));

        //4.3
        System.out.println(match("head", "heal"));
        System.out.println(match("apple", "Apple"));

        //4.4
        System.out.println(hackerSpeak("Whatcha takin' bout Willis!"));
    }

    // 1.1
    public static int getFirstIndexValue(int[] arr) {

        return arr[0];
    }

    // 1.2
    public static int getNextNum(int num) {

        return ++num;
    }

    // 1.3
    public static int search(int[] arr, int item) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == item) {

                return i;
            }
        }

        return -1;
    }


    // 1.4
    public static int convert(int minutes) {

        return minutes * 60;

    }

    // 1.5
    public static String giveMeSomething(String input) {

        return "something " + input;

    }

    /*

    Surprisingly, this gave me problems because I had written "string input" on as opposed
    to "String input". Still getting use to Java.
    */

    // 2.1
    public static boolean reverse(boolean b) {

        return !b;

    }


    // 2.2
    public static int countWords(String s) {
        int words = 1;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') {

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

    // 2.3
    public static boolean existsHigher(int[] arr, int n) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= n) {

                return true;
            }
        }

        return false;
    }

    // 2.4
    public static int getVowelCount(String str) {
        int vowelsCount = 0;
        char index;

        // Your code here

        for (int i = 0; i < str.length(); i++) {

            index = str.charAt(i);

            if (index == 'a' || index == 'e' || index == 'i' || index == 'o'
                    || index == 'u') {

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


    public static String rev(int n) {
        String reversedNumber = "";

        if (n < 0) {

            n = n * -1;
        }

        while (n / 10 > 0) {

            reversedNumber += String.valueOf(n % 10);

            n /= 10;
        }

        if (n < 10) {

            reversedNumber += String.valueOf(n);
        }

        return reversedNumber;

    }


    public static int minutesToSeconds(String tm) {


        int minutes = Integer.valueOf(tm.split(":")[0]);
        int seconds = Integer.valueOf(tm.split(":")[1]);

        if (seconds >= 60) {

            return -1;
        }

        return minutes * 60 + seconds;

    }

    public static int differenceMaxMin(int[] arr) {

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {

                max = arr[i];
            }

            if (arr[i] < min) {

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

            if (previousChar == currentChar) {

                doubleLetters = true;
                break;
            }

            previousIndex++;
            currentIndex++;
        }

        return doubleLetters;

    }

    // 3.1
    public static int sum(int a, int b) {

        return a + b;

    }

    // 3.2
    public static boolean isNumSame(int x, int y) {

        if (x == y) {

            return true;

        } else {

            return false;

        }
    }

    // 3.3
    public static int calcAge(int age) {

		/*
		Use 365 days as the length of a year for this challenge.
        Ignore leap years and days between last birthday and now.
        Expect only positive integer inputs.
		*/

        return age * 365;

    }

    // 3.4
    public static String helloName(String name) {

		/*

		Create a function that takes a name and returns a greeting in
		the form of a string.

		helloName("Gerald") ➞ "Hello Gerald!"

		helloName("Tiffany") ➞ "Hello Tiffany!"

		helloName("Ed") ➞ "Hello Ed!"

		*/

        String output = "Hello " + name + "!";

        return output;


    }

    //3.5
    public static String reverse(String str) {

        /*
         String reversed = new StringBuffer(str).reverse().toString();

         return reversed;

         */


        String reversed = "";
        char letter;


        for (int i = str.length() - 1; i >= 0; i--) {

            if (i == str.length() - 1) {

                letter = Character.toUpperCase(str.charAt(i));
                reversed += letter;


            } else if (i != 0) {

                reversed += str.charAt(i);


            } else {

                letter = Character.toLowerCase(str.charAt(i));
                reversed += letter;

            }
        }

        return reversed;

    }


    //4.1
    public static boolean makesTen(int a, int b) {

        return a == 10 || b == 10 || a + b == 10 ? true : false;

    }

    //4.2
    public static int numberSyllables(String word) {

        int syllables = 1;

        if (word.length() == 0)
            return 0;

        for (int i = 0; i < word.length(); i++){

            if (word.charAt(i) == '-')
                syllables++;
        }
        return syllables;
    }


    //4.3
    public static boolean match(String str1, String str2) {
        boolean match = true;

        String one = str1.trim().toLowerCase();
        String two = str2.trim().toLowerCase();

        if (one.length() != two.length()) return false;

        for (int i = 0; i < one.length(); i++) {

            if ( one.charAt(i) != two.charAt(i) ){

                match = false;
                break;
            }
        }
        return match;
    }

    //4.4
    public static String hackerSpeak(String str) {
        String output = "";

        for (int i = 0; i < str.length(); i++){

            switch ( str.charAt(i) ) {

                case 'e':
                    output += '3';
                    break;

                case 'a':
                    output += '4';
                    break;

                case 'i':
                    output += '1';
                    break;

                case 'o':
                    output += '0';
                    break;

                case 's':
                    output += '5';
                    break;

                default:
                    output += str.charAt(i);
            }

        }
        return output;
    }


}






