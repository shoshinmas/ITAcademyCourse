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
        System.out.println("[DEBUG] input value : " + ifRegular);
        if ("regular".equals(ifRegular)) {
            System.out.println("[DEBUG] regular");
            regular = true;
        } else {
            System.out.println("[DEBUG] not regular");
            regular = false;
        }
        if (regular == true) {
            System.out.println("[DEBUG] regular " + regular);
            int newDiscount = discount + 5;
            System.out.println("Rabat dla klienta to " + newDiscount+"%");
        } else {
            System.out.println("Rabat dla klienta to " + discount+"%");
        }
    }
}