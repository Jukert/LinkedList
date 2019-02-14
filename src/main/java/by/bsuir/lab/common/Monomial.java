package by.bsuir.lab.common;

public class Monomial {

    private int koefficient;
    private String parametr;
    private int power;
    private Operator operator;


    public int getKoefficient() {
        return koefficient;
    }

    public void setKoefficient(int koefficient) {
        this.koefficient = koefficient;
    }

    public String getParametr() {
        return parametr;
    }

    public void setParametr(String parametr) {
        this.parametr = parametr;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "Monomial{" +
                "koefficient=" + koefficient +
                ", parametr='" + parametr + '\'' +
                ", power=" + power +
                ", operator=" + operator +
                '}';
    }
}
