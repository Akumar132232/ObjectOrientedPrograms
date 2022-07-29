package generics;
import java.util.*;
import java.util.Scanner;

import java.util.Scanner;

public class Operation <E>
{
    public static Integer firstNumber,secondNumber,thirdNumber;
    public static Float number1=0.0f,number2=0.0f,number3=0.0f,max2=0.0f;
    public static String string1,string2,string3,max3;

    static Scanner sc = new Scanner(System.in);

    public static void getInputForInteger()
    {
        System.out.println("Enter first integer Number");
        firstNumber = sc.nextInt();
        System.out.println("Enter second integer Number");
        secondNumber = sc.nextInt();
        System.out.println("Enter third integer Number");
        thirdNumber = sc.nextInt();
    }
    public static void getInputForFloat()
    {
        System.out.println("Enter first float Number");
        number1 = sc.nextFloat();
        System.out.println("Enter second float Number");
        number2 = sc.nextFloat();
        System.out.println("Enter third float Number");
        number1 = sc.nextFloat();
    }
    public static void getInputForString()
    {
        System.out.println("Enter first string");
        string1 = sc.next();
        System.out.println("Enter second string");
        string2 = sc.next();
        System.out.println("Enter third string");
        string3 = sc.next();
    }

    public static <E extends Comparable<E>> E testMaximum(E a,E b,E c)
    {
        E max= a;
        if(b.compareTo(max) > 0){
            max = b;
        }
        if(c.compareTo(max) > 0){
            max = c;
        }
        return max;
    }
}
