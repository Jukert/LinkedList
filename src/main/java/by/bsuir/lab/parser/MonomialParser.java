package by.bsuir.lab.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MonomialParser {

    private static final String REGEX = "[0-9]*x?[0-9]*";

    public void parse(String str) {

        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(str);
    }
}
