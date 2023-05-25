package main.java;
class Calculator{
    private int a;
    private int b;

    public int  getA(){
        return this.a;
    }
    public int getB(){
        return this.b;
    }
    public Calculator(int a, int b){
        this.a = a;
        this.b =b;
    }

    public int add(){
        return a+b;
    }

    public int subtract(){
        return a-b;
    }

}
