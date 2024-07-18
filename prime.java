import java.util.Scanner;

class Prime {
    public static void main(String args[]) {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = num.nextInt();
        boolean prime = true;

        if (number <= 1) {
            prime = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        System.out.println("Is the number prime? " + prime);
    }
}
