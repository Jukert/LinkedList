package by.bsuir.lab.common;

public class Monomial {

    private int koefficient = 1;
    private String parameter;
    private int power;
    private Operator operator;

    public int getKoefficient() {
        return koefficient;
    }

    public void setKoefficient(int koefficient) {
        this.koefficient = koefficient;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
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
                ", parameter='" + parameter + '\'' +
                ", power=" + power +
                ", operator=" + operator +
                '}';
    }
}
