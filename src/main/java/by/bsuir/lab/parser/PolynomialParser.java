package by.bsuir.lab.parser;

import by.bsuir.lab.common.Monomial;

public class PolynomialParser {

    public void parse(String str) {

        str = str.replace("+", "+{p}").replace("-", "-{m}");
        if (!str.startsWith("-")) {
            str = "+{p}" + str;
        }
        String data[] = str.split("[+,-]");

        for (String s : data) {



            System.out.println(s);
        }

    }

    private Monomial parseMonomial(String str) {

        Monomial monomial = new Monomial();

        if (str.contains("x")) {

            if (str.contains("^")) {

            }

        }
        return  monomial;
    }
}
