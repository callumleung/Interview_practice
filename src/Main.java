import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {


        // printFib( 90);
        //System.out.println(checkPrime(10));
        //System.out.println(checkPrime(2));
        //System.out.println(checkPrime(71));

        //System.out.println(checkPalindrom("car"));
        //System.out.println(checkPalindrome("boob"));

        /*System.out.println(checkIntPalindrome(1001));
        System.out.println(checkIntPalindrome(1234321));
        System.out.println(checkIntPalindrome(314159265));*/

        /*System.out.println(checkArmstrong(153));
        System.out.println(checkArmstrong(55));
        System.out.println(checkArmstrong(70));*/

       /* System.out.println(calcFactorial(3));
        System.out.println(calcFactorial(10));
        System.out.println(calcFactorial(12));
        System.out.println(calcFactorial(5));*/

       /* System.out.println(reverseString("hello"));
        System.out.println(reverseString("test"));
        System.out.println(reverseString("racecar"));*/

       /*char[] testChar = {'a','b','c','a','b'};
       System.out.println(removeDuplicates(testChar));*/

       //String[] testString = {"hello", "there", "general", "kenobi", "hello", "there"};
       /* int[]  testInt = {1,2,3,4,5,6};
        int[] reversed = reverseArray(testInt);
        for (int i: reversed){
            System.out.println(i);
        }*/

      /* String testString = "Hello there, General Kenobi.";
       System.out.println(reverseSentence(testString));*/






    }

    private static void printFib(int limit){

        int a = 1;
        int b = 1;
        System.out.println(a +"\n" +b);

        while( b+a < limit){

            int initialB = b;
            b = a+b;
            a = initialB;
            System.out.println(b);

        }

    }

    private static boolean checkPrime(int num){

        //check all numbers from 2 up to num/2
        //if one then number is not prime

        for (int i = 2; i < num/2; i++){
            //divides
            if (num%i == 0){
                return false;
            }
        }

        return true;

    }

    private static boolean checkPalindrome(String input){

        for (int i = 0; i < input.length(); i++){

            //complementary char at the other end of string
            int j =  input.length() - i -1;

            //not matching, therefore not palindromic
            if (input.charAt(i) != input.charAt(j)){
                return false;
            }

        }

        //if not exited yet, must be true
        return  true;
    }

    private static boolean checkIntPalindrome(int value){

        //store a copy
        int copy = value;
        int reverse = 0;

        while (copy != 0){

            int remainder = copy % 10;
            reverse = reverse*10 + remainder;
            copy = copy/10; //int so remainder is tossed

        }

        if (value == reverse){
            return true;
        } else {
            return false;
        }

    }

    private static boolean checkArmstrong(int value){

        int input = value;
        ArrayList<Integer> digits = new ArrayList<>();

        while (input != 0){

            int remainder = input % 10;
            digits.add(remainder);
            input = input/10;
        }

        int sum = 0;
        for (int i: digits){
            sum += i*i*i;
        }

        if (sum == value){
            return true;
        } else {
            return false;
        }
    }

    private static int calcFactorial(int value){

        int sum = 1;

        while (value != 0){

            sum = sum*value;
            value--;

        }
        return sum;

    }

    private static String reverseString(String input){

        int j = input.length();
        String reversed = "";

        for (int i =0; i < j ; i ++){

            reversed+= input.charAt(j - i -1);

        }

        return reversed;

    }

    private static char[] removeDuplicates(char[] input){

        String returnString = "";

        for (int i = 0; i < input.length; i ++){
            String currentChar = Character.toString(input[i]);

            if (!returnString.contains(currentChar)){
                returnString+=currentChar;
            }
        }

        return returnString.toCharArray();
    }

    private static String[] removeDuplicates(String[] input){

        ArrayList<String> tempArray = new ArrayList<>();

        for (int i = 0; i < input.length; i ++){

            if (!tempArray.contains(input[i])){
                tempArray.add(input[i]);
            }
        }

        String[] returnArray = tempArray.toArray(new String[tempArray.size()]);
        return returnArray;
    }

    private static int[] reverseArray(int[] input){

        for (int i = 0; i < input.length/2 ; i ++){

            int a = input[i];
            int b = input[input.length - i-1];

            input[i] = b;
            input[input.length - i - 1] = a;
        }

        return input;
    }

    private static String reverseSentence(String input){

        String[] words = input.split(" ");
        String out = "";

        for (int i = 0; i < words.length; i ++){

          out += words[words.length - i -1];
          out += " ";
        }

        return out;
    }














}
