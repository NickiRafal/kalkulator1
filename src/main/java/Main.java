package main.java;

public class Main{
    public static void main(String[] args) {

        Calculator calculator = new Calculator() ;


        System.out.println( "Wynik dodawnia to : "+ calculator.add(20,30));
        System.out.println("Wynik odejmowania to : "+ calculator.subtract(50,40));

    }
}

class Calculator{

    public int add(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }

}