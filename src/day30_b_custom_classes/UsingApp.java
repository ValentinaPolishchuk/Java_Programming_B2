package day30_b_custom_classes;

public class UsingApp {
    public static void main(String[] args) {
        App appOne = new App();
        appOne.name = "Etsy";
        appOne.version = 5.7;
        appOne.isFree = true;

        appOne.run(); // Etsy is running...
        System.out.println(appOne.version);//5.7
        appOne.update();
        System.out.println(appOne.version);//6.7
        System.out.println(appOne.isFree);

        System.out.println(appOne); // this will show the memory location

        //making new object and calling the run method
        new App().run(); // null is running

        //System.out.println(5);
        //int a = 5;
        //System.out.println(a);

        // this is completely new object which is different that the one in line 22
        System.out.println(new App().name);// null

        System.out.println("--------------------------------------------------");


        App appTwo = new App();
        appTwo.run(); // null is running...
        System.out.println(appTwo.version);//00
    }
}
