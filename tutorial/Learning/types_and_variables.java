public class types_and_variables {
    public static void main(String[] args) {
        String name = "Dax";
        char last_initial = 'M';
        byte age = 18;
        boolean Verified = true;
        System.out.println(name + " " + last_initial + ", " + age + "\nIs this true?: " + Verified);
        
        /*
        Unused data types:
        short x = -32,768 to 32,767 (0 is counted);
        long y = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (0 is counted);
        float X = Stores 6 to 7 decimal digits (0.0000001);
        double Y = Stores 15 decimal digits (0.000000000000001);

        NOTE: Instead of arithmetic numbers (0, 1, 2), it can do scientific numbers (12E4d (double), 35e3f (float))

        - Non-primitive data types are programmer created
        - Types can be casted narrowly (double -> int (<-- BE CAREFUL WITH THIS ONE, CAN OVERFLOW)) or widely (int -> double)
        */
    }
}