public class Hello {
    public static void main(String[] args) {

        System.out.println("Hello World");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("Yes,this is an alien!");
        }

        int topScore = 90;
        if (topScore == 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 80;

        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("You got the low score!");
        }

        if ((topScore > 90) || (topScore < 100)){
            System.out.println("Either or both of the condition is true ");
        }


        boolean isCar = false;
        if (!isCar) {
            System.out.println("It is not a car!");
        }

        String makeOfCar = "Vauxhall";
        boolean isDomestic = makeOfCar == "Vauxhall" ? false : true;
        if (isDomestic) {
            System.out.println("It is a domestic!");
        }


    }
}






















