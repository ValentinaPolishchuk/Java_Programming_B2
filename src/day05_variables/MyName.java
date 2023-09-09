package day05_variables;

public class MyName {

    /*
    create a class MyName
    create a main method
    create multiple char variables, one for each letter of your name
    print your name
        print each letter in a different line
        print your name in the same line
*/

    public static void main(String[] args) {

        char first = 'V';
        char second = 'a';
        char three = 'l';
        char four = 'e';
        char five = 'n';
        char six = 't';
        char seven = 'i';
        char eight = 'n';
        char nine = 'a';

        System.out.println(first);
        System.out.println(second);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        System.out.println(seven);
        System.out.println(eight);
        System.out.println(nine);

        System.out.println(first + second + three + four + five + six + seven + eight + nine);
        System.out.println("My name is: " + first + second + three + four + five + six + seven + eight + nine);

        String myName = "" + first + second + three + four + five + six + seven + eight + nine;
        System.out.println("My name is: " + myName);


    }
}
