/* Poprawione zostały najważniejsze błędy w kodzie. Wykonano m.in.: ujednolicenie klauzuli "if", usystematyzowanie
nazw zmiennych i metod, usunięcie zbędnych zmiennych, wprowadzenie krótszych zamienników dla niektórych komend. */

import java.util.ArrayList;
import java.util.List;

public class Main {

    static boolean isThisTextIsPalindrome(String someText){

        StringBuilder ReverseStr = new StringBuilder();
        var noComma =someText.replace(",", "");
        var noDotNoQuestion = noComma.replace(".", "").replace("?", "");
        String noSpaces= noDotNoQuestion.replace(" ", "");
        int strLength = noSpaces.length();

        for (int i = (strLength - 1); i >=0; --i) {
            ReverseStr.append(noSpaces.charAt(i));
        }

        boolean isPalindrome;

        isPalindrome = noSpaces.equalsIgnoreCase(ReverseStr.toString());
        return isPalindrome;
    }

    static boolean isThisNumberIsPalindrome(int someText){

        int reversedNum = 0;
        int remainder;
        int originalNum = someText;
        while (someText != 0) {
            remainder = someText % 10;
            reversedNum = reversedNum * 10 + remainder;
            someText /= 10;
        }

        return originalNum == reversedNum;
    }



    public static void main(String[] args) {

        String text = "O, ty z Katowic, Iwo? Tak, Zyto.";
        String text2 = "O, z Katowic, Iwo? Nie, Zyto.";
        int number = 12321;
        int number2 = 12343;

        boolean ourpalindromeisPalindrome;

        List<Object> list = new ArrayList<>();
        list.add(text);
        list.add(number);
        list.add(text2);
        list.add(number2);

        for (Object o : list) {
            if (o instanceof String) {
                ourpalindromeisPalindrome = isThisTextIsPalindrome((String) o);
            } else {
                ourpalindromeisPalindrome = isThisNumberIsPalindrome((Integer) o);
            }
            System.out.println("This " + "'" + o + "'" + " is a " + ourpalindromeisPalindrome + " palindrome.");
        }

    }

}