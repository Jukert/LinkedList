package by.bsuir.lab;


import by.bsuir.lab.parser.PolynomialParser;

public class Application {
    public static void main(String[] args) {
        PolynomialParser m = new PolynomialParser();

        m.parse("7x^8+20x+6");
    }
}
