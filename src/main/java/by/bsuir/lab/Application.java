package by.bsuir.lab;


import by.bsuir.lab.common.Monomial;
import by.bsuir.lab.list.LinkedList;
import by.bsuir.lab.parser.PolynomialParser;

public class Application {
    public static void main(String[] args) {
        PolynomialParser m = new PolynomialParser();

       LinkedList<Monomial> first = m.parse("7x^8+20x+6");
       LinkedList<Monomial> second = m.parse("7x^7+20x^9+6x");

       LinkedList<Monomial> third = first.summ(second);
        System.out.println(third.print());

        SumMonomial sumMonomial = new SumMonomial();
        System.out.println(sumMonomial.formatter(third));
    }
}
