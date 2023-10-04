package day09_b_if_statements;

import java.util.Scanner;

public class Temperature {

    /*
    Task:
    ask the user to enter the temperature

    if the temperature is above or equal to 70 ---> ">="
    print: Its a nice day ! Go outside , but with your laptop to code java

    if the temperature less than 70
    print: Its too cold outside ! Code more java!
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature:");
        int temperature = input.nextInt(); // here we are dynamically getting the value from user each time
        // int temp = 50: // here we are manually changing the value. It is kind of HARD CODED

        if (temperature >= 70){  //or we can also use boolean result = temperature >= 70;
            System.out.println("Its a nice day ! Go outside , but with your laptop to code java!");
        } else {
            System.out.println("Its too cold outside ! Code more java!");
        }


    }
}
