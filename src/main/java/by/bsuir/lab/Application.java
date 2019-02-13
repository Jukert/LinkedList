package by.bsuir.lab;

import by.bsuir.lab.list.LinkedList;
import by.bsuir.lab.parser.MonomialParser;

public class Application {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();
        list.add("asda");
        list.add("asda1");
        list.add("asda2");
        list.add("asda3");
        System.out.println(list.print());

        System.out.println();


        MonomialParser m = new MonomialParser();

        m.parse("7x8+20x+6");
    }
}
