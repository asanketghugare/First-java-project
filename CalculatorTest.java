 class Calculator{
    public int add(int a, int b){
        return a+b;
    }

    public int substract(int a, int b){
        return a-b;
    }
    
}


public class CalculatorTest {

    public static void main(String[] args) {
        
        Calculator calculator = new Calculator();
        System.out.println("Result : "+calculator.add(20, 40));
        System.out.println("Result : "+calculator.substract(20, 40));
    }
}