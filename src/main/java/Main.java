package main.java;

public class Main{
    public static void main(String[] args) {

        Calculator calculator = new Calculator(65,25) ;


        System.out.println( "Wynik dodawnia "+ calculator.getA()+" + "+calculator.getB()+" = "+calculator.add());
        System.out.println("Wynik odejmowania "+calculator.getA()+" - "+calculator.getB()+" = "+ calculator.subtract());

    }
}