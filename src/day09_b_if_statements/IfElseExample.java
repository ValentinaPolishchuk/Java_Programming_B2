package day09_b_if_statements;

public class IfElseExample {
    /*

    int score = 60;
    if (score >= 75) {
    system.out.println ("You passed the exam!");
    }
    if (score < 75) {
    system.out.println ("You failed!");
    }

    */

    public static void main(String[] args) {

        int score = 50;
        if (score >= 75) { // check if this line is TRUE , execute the IF body
            System.out.println ("Passing!");
        } else {            // if the condition is line 19 is FALSE execute the ELSE body
            System.out.println ("Failing!");
        }

        /*
         System.out.println();
        int year = 2023;
        boolean isLockdown = year == 2020 || year == 2021;

        if (isLockdown) {
            System.out.println("Stay at home");
            System.out.println("Study Java");
            System.out.println("When you study put your mask on");
        }

        //any single IF statements does NOT depend on another statement
        if (!isLockdown) {
            System.out.println("Party!");
            System.out.println("This is not a normal party. It is a Java Party!");
            System.out.println("Travel");
        }
         */

        System.out.println();
        int year = 2023;
        boolean isLockdown = year == 2020 || year == 2021;

        if (isLockdown) {
            System.out.println("Stay at home");
            System.out.println("Study Java");
            System.out.println("When you study put your mask on");
        } else {
            System.out.println("Party!");
            System.out.println("This is not a normal party. It is a Java Party!");
            System.out.println("Travel");
        }

    }
}
