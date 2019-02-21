package by.bsuir.lab.parser;

import by.bsuir.lab.common.Monomial;
import by.bsuir.lab.common.Operator;
import by.bsuir.lab.list.LinkedList;

public class PolynomialParser {

    public void parse(String str) {

        str = str.replace("+", "+{p}").replace("-", "-{m}");
        if (!str.startsWith("-")) {
            str = "+{p}" + str;
        }
        String data[] = str.split("[+,-]");


        LinkedList<Monomial> momials = new LinkedList<>();
        for (String s : data) {
            if (s != null && s != "" && !s.isEmpty()) {
                momials.add(parseMonomial(s));
            }
        }
        System.out.println(momials.print());
    }

    private Monomial parseMonomial(String str) {

        Monomial monomial = new Monomial();

        monomial.setOperator(str.contains("{p}") ? Operator.PLUS : Operator.MINUS);
        str = str.replace("{p}", "").replace("{m}", "");

        if (str.contains("x")) {
            monomial.setParameter("x");
            if (str.contains("^")) {
                try {
                    String data[] = str.split("\\^");
                    monomial.setPower(Integer.valueOf(data[1]));
                } catch (ClassCastException e) {
                    throw new ClassCastException("Power has syntax error");
                }
            }

            String data[] = str.split("x");
            try {
                monomial.setKoefficient(data[0] != "" && !data[0].isEmpty() ? Integer.valueOf(data[0]) : null);
            } catch (ClassCastException e) {
                throw new ClassCastException("Error in cast koefficient");
            }
        } else {
            try {
                monomial.setKoefficient(Integer.valueOf(str));
            } catch (ClassCastException e) {
                throw new ClassCastException("Error in cast koefficient");
            }
        }
        return monomial;
    }
}
