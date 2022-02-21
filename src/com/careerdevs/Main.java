package com.careerdevs;

import java.util.Locale;

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

        //2.5
        System.out.println(rev(-512));

        //2.6
        System.out.println(minutesToSeconds("07:59"));

        //2.7
        System.out.println(differenceMaxMin(new int[]{12, 15, -1, 7, 99}));

        //2.8
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
        str = str.toLowerCase();
        char index;

        for (int i = 0; i < str.length(); i++){

            index = str.charAt(i);

            switch(index) {

                case 'e':

                case 'u':

                case 'o':

                case 'i':

                case 'a':
                    vowelsCount++;
                    break;
            }
        }

        return vowelsCount;

    }


    //2.5

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

    //2.6

    public static int minutesToSeconds(String tm) {


        int minutes = Integer.valueOf(tm.split(":")[0]);
        int seconds = Integer.valueOf(tm.split(":")[1]);

        if (seconds >= 60) {

            return -1;
        }

        return minutes * 60 + seconds;

    }


    //2.7

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


    //2.8

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

        return age * 365;

    }


    // 3.4
    public static String helloName(String name) {


        String output = "Hello " + name + "!";

        return output;


    }


    //3.5
    public static String reverse(String str) {


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






