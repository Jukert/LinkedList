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

                if ((fMonomial.get(i).getParameter() == null && sMonomial.get(j).getParameter() == null)) {

                    fMonomial.get(i).setKoefficient(fMonomial.get(i).getKoefficient() + sMonomial.get(j).getKoefficient());
                    sMonomial.remove(sMonomial.get(j));

                    break;
                }
                if ((fMonomial.get(i).getParameter() != null && sMonomial.get(j).getParameter() != null)) {
                    if (fMonomial.get(i).getParameter().equals(sMonomial.get(j).getParameter()) &&
                            fMonomial.get(i).getPower() == sMonomial.get(j).getPower()) {

                        fMonomial.get(i).setKoefficient(fMonomial.get(i).getKoefficient() + sMonomial.get(j).getKoefficient());
                        sMonomial.remove(sMonomial.get(j));

                        break;
                    }
                }

            }
        }

        return fMonomial;
    }

}
