package day_06_a_arithmetic_operators;

public class CastingExample {

    public static void main(String[] args) {

        short num1 = 40;
        float num2 = num1; // short is smaller than float , so implicit casting happens.

        System.out.println(num1);
        System.out.println(num2);

        float num3 = 100.5F;
        short num4 = (short)num3; // float is bigger , so we must explicitly cast it. NARROWING CASTING.
        System.out.println(num3);
        System.out.println(num4);

        float num5 = 300;
        byte num6 = (byte)num5;
        short num7 =(short)num5;
        System.out.println(num5); //300.0
        System.out.println(num6); //range -128 --> 127
        System.out.println(num7); //range

        char letter = 'A';
        int letterInt = letter;
        System.out.println(letter);
        System.out.println(letterInt);

        System.out.println((int) letter);
        System.out.println((char) 66);





    }
}
