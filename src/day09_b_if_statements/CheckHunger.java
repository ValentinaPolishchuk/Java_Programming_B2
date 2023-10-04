package day09_b_if_statements;

import java.util.Scanner;

public class CheckHunger {
    /*
    Task:

    boolean variable isHungry

    if the person is hungry , print : You are hungry , so I will get some food for you

    if the person is not hungry , print: Great , then practice java
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Are you hungry ? If yes, enter - true , if not enter - false:");

        boolean isHungry = input.nextBoolean();

        if (isHungry){
            System.out.println("You are hungry , so I will get some food for you");
        } else {
            System.out.println("Great , then practice java");
        }

    }
}
