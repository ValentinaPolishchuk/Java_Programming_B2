package day05_variables;

public class CharExample {

    public static void main(String[] args) {
        // assign characters to the char data type

        char letterOne = 'a';
        char letterTwo = 'Z';
        char numberOne = '9';
        char specialOne = '$';

        //sout

        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(numberOne);
        System.out.println(specialOne);

        System.out.println(letterOne + letterTwo);  // 97+90 ---> 187


        char letterThree = 65;
        System.out.println(letterThree);

        // char letterFour = '65'; // we canNOT do this '' because can only hold a single character. This is invalid because there are two characters

        System.out.println(letterOne + letterTwo + letterThree + numberOne + specialOne);  // 97 + 90 + 65 + 57 + 36 (ACII)


        // Concatenation
        System.out.println(letterOne + " " + letterTwo + " " + letterThree + " " + numberOne + " " + specialOne);

        //RULE: Concatenation starts from FIRS STRING. Anything after  FIRST String is concatenated
        System.out.println("chars: " + letterOne + letterTwo + letterThree + numberOne + specialOne);

        // Concatenation
        System.out.println(letterOne + " chars: " + letterTwo + letterThree + " chars:" + numberOne + specialOne);


    }
}
