public class Calculator{
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

 class Result{
    public static void main(String[] args) {

        Calculator calculator = new Calculator(65,25) ;


        System.out.println( "Wynik dodawnia "+ calculator.getA()+" + "+calculator.getB()+" = "+calculator.add());
        System.out.println("Wynik odejmowania "+calculator.getA()+" - "+calculator.getB()+" = "+ calculator.subtract());

    }
}
