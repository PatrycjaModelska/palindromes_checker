import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void isThisNumberIsPalindrome_12321_True() {
        Main object = new Main();
        int someNum = 12321;
        Assert.assertTrue(object.isThisNumberIsPalindrome(someNum));
    }

    @Test
    public void isThisNumberIsPalindrome_12343_False() {
        Main object = new Main();
        int someNum = 12343;
        Assert.assertFalse(object.isThisNumberIsPalindrome(someNum));
    }

    @Test
    public void isThisNumberIsPalindrome_minus12321_False() {
        Main object = new Main();
        int someNum = -12321;
        Assert.assertFalse(object.isThisNumberIsPalindrome(someNum));
    }

    @Test
    public void isThisTextIsPalindrome_Zyto_True() {
        Main object = new Main();
        String someText = "O, ty z Katowic, Iwo? Tak, Zyto.";
        Assert.assertTrue(object.isThisTextIsPalindrome(someText));
    }
}