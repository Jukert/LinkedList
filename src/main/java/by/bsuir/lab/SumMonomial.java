package by.bsuir.lab;

import by.bsuir.lab.common.Monomial;
import by.bsuir.lab.list.LinkedList;

public class SumMonomial {

    public LinkedList<Monomial> sum(LinkedList<?> f, LinkedList<?> s) {

        LinkedList<Monomial> fMonomial = (LinkedList<Monomial>) f;
        LinkedList<Monomial> sMonomial = (LinkedList<Monomial>) s;

        int fSize = fMonomial.size();

        for (int i = 0; i < fSize; i++) {
            int sSize = sMonomial.size();
            for (int j = 0; j < sSize; j++) {



            }
        }

        return null;
    }

}
