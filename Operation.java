import java.util.*;
import java.util.Scanner;

import java.util.Scanner;

public class Operation <E extends Comparable<E>>
{
    E firstValue,secondValue,thirdValue;

    public Operation(E firstValue, E secondValue, E thirdValue)
    {
        super();
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    public static <E extends Comparable<E>> E testMaximum(E a,E b,E c)
    {
        E max = a;
        if(b.compareTo(max) > 0){
            max = b;
        }
        if(c.compareTo(max) > 0){
            max = c;
        }
        return max;
    }
    public static <E> void printMax(E a, E b, E c,E max)
    {
        System.out.println("Maximum of "+a+" , "+b+" , "+c+" is "+max);
    }
}
