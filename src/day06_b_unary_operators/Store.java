package day06_b_unary_operators;

public class Store {

    public static void main(String[] args) {

        String store = "Target";
        int numOfTV = 100;

        System.out.println("Person comes into the store and they bought a TV");
        //numOfTV = numOfTV - 1;
        System.out.println("Number of TV now: " + --numOfTV);

        System.out.println("Another person came and bought 1 more TV");
        System.out.println("Number of TV: " + -- numOfTV);

        System.out.println("In report , it shows that we have total: " + numOfTV);

        System.out.println("First person has returned a TV");
        System.out.println("Number of TV now: " + ++numOfTV);
    }
}
