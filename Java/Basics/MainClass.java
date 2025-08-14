import java.util.Scanner;
class calculator {
    public void sum(double a, double b) {
        System.out.println("sum = " + (a + b));
    }
}
public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        double num1 = input.nextDouble();
        System.out.println("Enter Second  Number : ");
        double num2 = input.nextDouble();
        calculator obj = new calculator();
        obj.sum(num1 ,num2);
    }
}


