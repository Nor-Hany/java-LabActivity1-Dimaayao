import java.util.Scanner;

class sentinel{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int amount;
        int total = 0;
        int count = 0;

        System.out.print("Enter an amount(0 to stop): ");
        amount = input.nextInt(); // first input

        while (amount != 0) {

            total += amount;
            count++;

            System.out.print("Enter an amount(0 to stop): ");
            amount = input.nextInt(); // next input
        }

        System.out.println("Total = " + total);
        System.out.println("Count = " + count);

        input.close();
    }
}