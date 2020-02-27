package Degree;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static double input(String message){
        System.out.println(message);
        boolean exit = false;
        double degree = 0;
        while(!exit){
            try{
                Scanner scanner = new Scanner(System.in);
                degree = scanner.nextInt();
                exit = true;
            } catch (InputMismatchException e){
                System.out.println("Вы ввели не число!");
            }
        }
        return degree;
    }
    public static void main(String[] args) {
        double number = input("Введите число: ");
        double degree = input("Введите сепень: ");
        DegreeMaster degreeMaster = new DegreeMaster(number,degree);
        double answer = degreeMaster.numberToDegree();
        if(answer != -2){
            System.out.println(number + " в " + degree + " cтепени = " + answer);
        }

    }
}
