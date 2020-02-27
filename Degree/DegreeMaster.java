package Degree;

public class DegreeMaster {
    private double number;
    private double degree;

    public DegreeMaster(double number, double degree){
        this.number = number;
        this.degree = degree;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public double getDegree() {
        return degree;
    }

    public void setDegree(double degree) {
        this.degree = degree;
    }

    public double numberToDegree(){
        try{
            return Math.pow(number,degree);
        } catch (Exception e){
            System.out.println("Ошибка: " + e);
            return -2;
        }
    }
}
