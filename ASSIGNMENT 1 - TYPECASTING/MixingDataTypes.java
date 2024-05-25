public class MixingDataTypes {
    public static void main(String[] args) {
        //Perform an addition between a short and a byte, store the result in an int variable, andprint the result.
        short a = 30000;
        byte b= 126;
        int result = (int) a + b;
        System.out.println("Sum Value : "+result);
        //Perform a multiplication between a float and a double, store the result in a double variable, and print the result.

        float f = 2.55f;
        double d =10.53;
        double mul = (double) f*d;
        System.out.println("multiplication : "+mul);
    }
}
