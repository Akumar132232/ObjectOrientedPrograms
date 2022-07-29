import java.util.Scanner;

public class MaximumProblem {

    public static void main(String[] args) {
        Integer Int1 = 10 , Int2 = 12, Int3 = 7;
        Float float1 = 2.7f , float2 = 19.3f, float3 = 7.5f;
        String xString = "Cherry" , yString = "Banana", zString = "Pineapple";

        Operation operation = new Operation(Int1,Int2,Int3);
        int intMax=operation.testMaximum(Int1,Int2,Int3);
        operation.printMax(Int1, Int2, Int3,intMax);

        Operation operation1 = new Operation(float1,float2,float3);
        Float floatMax =operation1.testMaximum(float1,float2,float3);
        operation.printMax(float1, float2, float3,floatMax);


        Operation operation2 = new Operation(xString,yString,zString);
        String stringMax =operation2.testMaximum(xString,yString,zString);
        operation.printMax(xString, yString, zString,stringMax);

    }
}
