public class newClass {
    public static void main(String[] args) {

        double myDouble = 20.00d;

        double mySecondDouble = 80.00d;

        double myFirstResult = (myDouble + mySecondDouble) * 100.00d;

        System.out.print(myFirstResult);

        double checkRemainder = myFirstResult % 40.00d;

        System.out.print(checkRemainder);

        boolean isRemainder = checkRemainder == 0 ? true : false;
        System.out.print(isRemainder);

        if (!isRemainder) {
            System.out.println(" Got a remainder");
        }
    }
}