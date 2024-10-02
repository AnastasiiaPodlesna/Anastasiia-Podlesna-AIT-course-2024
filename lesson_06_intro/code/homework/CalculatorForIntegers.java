package homework;

//Написать приложение - калькулятор для работы с целыми числами:
// oper 1 => + ;  oper 2 => -; oper 3 => *; oper 4 => /; oper 5 => % , other print "Wrong operation".
//Числа и требуемая операция вводятся с клавиатуры.


import java.util.Scanner;

public class CalculatorForIntegers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the 1st integer: ");
        int integer1 = in.nextInt();
        System.out.println("Input the 2nd integer: ");
        int integer2 = in.nextInt();
        System.out.println("what is the necessary operation on integers (+, -, *, /, %): ");
        String operation = in.next();

        double result = calculatorForIntegers(integer1, integer2, operation);

        if (result != 0)
        System.out.println("So, integer1 " + operation + " integer2 = " + result);
        else System.out.println("Incorrect data input...");
    }

    public static double calculatorForIntegers(int integer1, int integer2, String operation) {

        switch (operation) {
            case "+" ->
            {
                return integer1 + integer2;
            }
            case "-" ->
            {
                return integer1 - integer2;
            }
            case "*" ->
            {
                return integer1 * integer2;
            }
            case "/" ->
            {
                return (double) integer1 / integer2;
            }
            case "%" ->
            {
                return (double) integer1 % integer2;
            }

            default ->
            {
                return 0;
            }

        }
    }
}



