package test.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {


        System.out.println(runTest("^a-z", "dog hey  are friendly"));
    }

    public static int runTest(String regex, String text){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int matches = 0;
        while(matcher.find()){
            matches++;
        }
        return matches;
    }

}
