import java.util.Scanner;

public class MaximumProblem {

    public static void main(String[] args)
    {
        System.out.println("Find Maximum Problem using Generics");
        System.out.println("---------------------------------------");
        Operation operation = new Operation();
        operation.getInputForInteger();
        operation.testMaximumInteger(operation.firstNumber,operation.secondNumber,operation.thirdNumber);
        System.out.println(operation.max1+" is maximum amongst integer numbers");
        operation.getInputForFloat();
        operation.testMaximumFloat(operation.number1,operation.number2,operation.number3);
        System.out.println(operation.max2+" is maximum amongst float numbers");
        operation.getInputForString();
        operation.testMaximumString(operation.string1,operation.string2,operation.string3);
        System.out.println(operation.max3+" is maximum amongst strings");
        System.out.println("---------------------------------------");

    }
}
