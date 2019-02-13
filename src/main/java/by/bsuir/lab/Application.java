package by.bsuir.lab;

import by.bsuir.lab.list.LinkedList;

public class Application {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();
        list.add("asda");
        list.add("asda1");
        list.add("asda2");
        list.add("asda3");
        System.out.println(list.print());
    }
}
