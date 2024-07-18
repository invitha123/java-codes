import java.util.Scanner;

public class nsum {
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        System.out.println("Enter the number to find sum");
        int result=0;
        int number=m.nextInt();
        result=( (number*(number+1)) / 2);
        System.out.println("The sum is 1" + result);
}
}
