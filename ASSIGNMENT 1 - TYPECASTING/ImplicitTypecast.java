class ImplicitTypecast{
    public static void main(String[] args) {
        //Assign an int value to a double variable and print both values.
        int Integervariable = 10;
        double Doublevariable = Integervariable;
        System.out.println("Integervariable : "+Integervariable);
        System.out.println("Doublevariable : "+Doublevariable);

        //Assign a char value to an int variable and print both values.
        // char Charvariable  = 'A';
        char Charvariable  = 'a';
        int  Intvariable = Charvariable;

        System.out.println("Charvariable : "+Charvariable);
        System.out.println("Intvariable : "+Intvariable);

    }
}