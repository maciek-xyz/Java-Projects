package Lesson9;


public class LambdaTester {
    public static void main(String[] args) {
        final String defaultText = "This is a test text";
        TextModification upperCase = String::toUpperCase;
        TextModification lowerCase = String::toLowerCase;
        TextModification firstLetter = txt -> String.valueOf(txt.charAt(0));
        TextModification lastLetter = txt -> String.valueOf(txt.charAt(txt.length()-1));

        String modifiedString = modifyString(defaultText, lastLetter);

        System.out.println(modifiedString);

        TextCounting length = txt -> txt.length();
        TextCounting noWords = txt -> txt.split(" ").length;

        Integer countedString = countString(defaultText, noWords);

        System.out.println(countedString);

    }

    static String modifyString(String string, TextModification text) {
        return text.doSomething(string);
    }

    static Integer countString(String string, TextCounting text) {
        return text.doSomething(string);
    }
}
