public class ASCIIValues {
    public static void main(String[] args) {
        //Assign a char value (e.g., &#39;A&#39;) to an int variable using explicit typecasting and print the ASCII value.
        char c= 'A';
        int a = (int) c;
        System.out.println("ASCLL value for A : "+a);
        //Convert an int value representing an ASCII code back to a char and print the character.
        int b= 66;
        char char_value = (char) b;
        System.out.println("Charecter  value for 66 : "+char_value);
    }
}
