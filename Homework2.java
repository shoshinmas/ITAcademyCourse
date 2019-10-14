import java.util.Scanner;

public class Homework2 {

    private static int discount;
    public static int Coupon(int a) {
        if (a > 65)
        {
            discount = 10;
        }
        else if (a < 18) {
            discount = 25;
        }
        else {
            discount = 0;
        }

        return discount;

    }

    public static void main(String[] args) {
        System.out.println("What is your age:");
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        Coupon(age);
        boolean regular = false;
        System.out.println("Is the customer new or regular?");
        String ifRegular = scanner.next();
            if (ifRegular == "regular") {
                regular = true;
            }
            else {
                regular = false;
            }
        if (regular = true) {
            int newDiscount = discount + 5;
            System.out.println("Rabat dla klienta to " + newDiscount+"%");
        }
        else {
            System.out.println("Rabat dla klienta to " + discount+"%");
        }

    }
}
