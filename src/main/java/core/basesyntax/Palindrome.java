package core.basesyntax;

public class Palindrome {
    public boolean isPalindrome(String text) {
        text = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuffer reversedText = new StringBuffer(text).reverse();
        return text.equals(reversedText.toString());
    }
}
