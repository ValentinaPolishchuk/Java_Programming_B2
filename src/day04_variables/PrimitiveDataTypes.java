package day04_variables;

public class PrimitiveDataTypes {

    public static void main (String [] args){

        byte age = 50; // I declared a variable called age which has int data type and number 50 is assigned to it.
        System.out.println("50"); // Hardcoded -- mean you have to change it manually

        System.out.println("age"); // here "age" is not a variable. It is just a word what we are printing.


        System.out.println(age); // Dynamic -- we are using age variable to make pur code dynamic.

        //byte age = 95; // in Java , we canNOT declare SAME variable name more than once.

        age = 100; // Since we are NOT DECLARATION it again, we can use the same variable name. Iy will REASSIGN the value.

        //byte age2 = 950; // primitive data type byte canNot hold 950 because it is out or the range that byte can hold

        short year; // In this line , we JUST DECLARED the variable
        year = 2023; // IN this line, we ASSIGNED a value to year variable;

        int addressNumber = 2345688;

        long bigNumber;
        bigNumber = 8475937534636463L;

        //long year; // Even if you have a DIFFERENT Data type, you can not use the SAME variable name more than ONCE in the same BLOCK OF CODE



    }
}
