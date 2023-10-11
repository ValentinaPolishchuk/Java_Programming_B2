package day11_if_statements;

import java.util.Scanner;

public class ChooseLanguage {
    /*
        ask the user to enter a number based on the language they wanted to use.
        1 - English
        2 - Spanish
        3 - Turkish
        4 - Russian
        5 - French
        6 - Azerbaijan

        based on the number they picked print a message:

        1 : "hello, thanks for your call"
        2 : "hola, gracias para llamar"
        3 : "merhaba, aradiginiz icin tesekkurler"
        4 : "privet, spasibo za vash zvonok"
        5 : "Merci ,pour votre appel"
        6 : "salam, zeng ettiginiz ucun mennatdariq"
        any other number: "We will use English by default"
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please choose option below: \n\t\t1 - English\n" +
                "        2 - Spanish\n" +
                "        3 - Turkish\n" +
                "        4 - Russian\n" +
                "        5 - French\n" +
                "        6 - Azerbaijan\n\n\tYour choice: ");
        int userOption = input.nextInt();

        String message;

        if (userOption == 1){
            message = "hello, thanks for your call";
        } else if (userOption == 2) {
            message = "hola, gracias para llamar";
        } else if (userOption == 3) {
            message = "merhaba, aradiginiz icin tesekkurler";
        } else if (userOption == 4) {
            message = "privet, spasibo za vash zvonok";
        } else if (userOption == 5) {
            message = "Merci ,pour votre appel";
        } else if (userOption == 6) {
            message = "salam, zeng ettiginiz ucun mennatdariq";
        } else  {
            message = "No valid opton";
        }

        System.out.println("\n\t" + message);
    }

}
