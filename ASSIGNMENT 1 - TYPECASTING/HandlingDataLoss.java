public class HandlingDataLoss {
    public static void main(String[] args) {
        //Assign a large int value (greater than 127) to a byte variable using explicit typecasting and print the result.
        //int intvalue = 156;
        int intvalue = 186;
        byte bytevalue = (byte) intvalue;
         System.out.println("Int value :"+intvalue);
         System.out.println("Byte value :"+bytevalue);
        // Assign a floating-point number to an int variable using explicit typecasting and print the result.
        float floatvalue = 1.20f;
        int intvariable = (int) floatvalue;
        System.out.println("Float value : "+floatvalue);
        System.out.println("Int variable : "+intvariable);
    }
}
