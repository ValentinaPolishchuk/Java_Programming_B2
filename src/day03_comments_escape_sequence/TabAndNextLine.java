package day03_comments_escape_sequence;

public class TabAndNextLine {

    public static void main (String [] args){

        System.out.println("This is not tabbed");
        System.out.println("\tThis is tabbet 1 time");  //this is tabbet 1 time
        System.out.println("    This is not tabbet");   // 4 space is equal 1 tab
        System.out.println("\t\tThis is tabbet 2 times");  //this is tabbet 2 times
        System.out.println();


        // The followings are about \n - new line
        System.out.println("1) Go to store");
        System.out.println("2) grab milk");
        System.out.println("3) pay cashier");

        System.out.println("\n1) Go to store\n2) grab milk\n3) pay cashier");

    }

}
