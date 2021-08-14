import java.util.ArrayLists;
import java.util.List;

public class Orginal_raw_code {

    public static void main(String[] args) {

        String ourpalindrom = "O, ty z Katowic, Iwo? Tak, Zyto.";
        String ourpalindrom2 = "O, z Katowic, Iwo? Nie, Zyto.";
        boolean ourpalindromisPalidrom;
        int PaliInt;
        PaliInt = 12321;

        List<Object> list = new ArrayList<Object>();
        list.add(ourpalindrom);
        list.add(PaliInt);
        list.add(ourpalindrom2);
        list.add(12343);

        if (list.get(0)  instanceof  String) {
            ourpalindromisPalidrom = isThisTextIsPallondrome(ourpalindrom);
            String palindromText ="This \""+ourpalindrom+"\" is a \"  "+ourpalindromisPalidrom + "\" palindome";
            System.out.println(palindromText);
        } else{

            ourpalindromisPalidrom = isThisNumberIsPallondrome(((Integer) list.get(0)));
            String palindromText ="This \" "+list.get(0).toString()+ "\" is a \""+ourpalindromisPalidrom+ "\" palindome";
            System.out.println(palindromText);
        }
        if (list.get(1)  instanceof  String) {
            ourpalindromisPalidrom = isThisTextIsPallondrome(list.get(1).toString());
            System.out.println("This \""+list.get(1).toString()+"\" is a \""+ourpalindromisPalidrom+ "\" palindome");
        } else{
            ourpalindromisPalidrom = isThisNumberIsPallondrome(PaliInt);
            if( ourpalindromisPalidrom ){
                System.out.println("This\"" + PaliInt + "\" is a \"" + true + "\"palindome");
            }else{
                System.out.println("This\"" + PaliInt + "\" is a \"" + false + "\" palindome");
            }
        }

        if (list.get(2)  instanceof  String) {
            ourpalindromisPalidrom = isThisTextIsPallondrome(ourpalindrom2);
            String palindromText ="This \""+ourpalindrom2+"\" is a \"  "+ourpalindromisPalidrom + "\" palindome";
            System.out.println(palindromText);
        } else{

            ourpalindromisPalidrom = isThisNumberIsPallondrome(((Integer) list.get(0)));
            String palindromText ="This \" "+list.get(0).toString()+ "\" is a \""+ourpalindromisPalidrom+ "\" palindome";
            System.out.println(palindromText);
        }
        if (list.get(3)  instanceof  String) {
            ourpalindromisPalidrom = isThisTextIsPallondrome(list.get(1).toString());
            System.out.println("This \""+list.get(1).toString()+"\" is a \""+ourpalindromisPalidrom+ "\" palindome");
        } else{
            ourpalindromisPalidrom = isThisNumberIsPallondrome((Integer) list.get(3));
            if( ourpalindromisPalidrom ){
                System.out.println("This \"" + (Integer) list.get(3) + "\" is a \"" + true + "\"palindome");
            }else{
                System.out.println("This \"" + 12343 + "\" is a \"" + false + "\" palindome");
            }
        }
    }

    public static boolean isThisTextIsPallondrome(String someText){

        var ReverseContainer = "";
        String ReverseStr = "";
        var noComma =someText.replace(",", "");
        var noDotNoQuestion = noComma.replace(".", "").replace("?", "");
        String Nospaces= noDotNoQuestion.replace(" ", "");
        int strLength = Nospaces.length();

        for (int i = (strLength - 1); i >=0; --i) {
            ReverseStr = ReverseStr + Nospaces.charAt(i);
        }

        boolean ifThisisPalindrome;

        if(Nospaces.toLowerCase().equals(ReverseStr.toLowerCase())){
            ifThisisPalindrome = true;
        } else {
            ifThisisPalindrome = false;
        }
        return ifThisisPalindrome;
    }

    public static boolean isThisNumberIsPallondrome(int someText){


        int reversedNum = 0;
        int remainder;
        int originalNum = someText;
        boolean valForText;
        while (someText != 0) {
            remainder = someText % 10;
            reversedNum = reversedNum * 10 + remainder;
            someText /= 10;
        }

        if (originalNum == reversedNum) {
            valForText = true;
        }else{
            valForText = false;
        }
        return valForText;
    }

}