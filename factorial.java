import java.util.Scanner;

class fa {
    public static void main(String[] args) {
        Scanner fact=new Scanner(System.in);
        System.out.println("Enter the number to calculate factorial");
        int factor=fact.nextInt();

        long factorial=1;

        for (int i=1;i<=factor;i++){
            factorial *= i;
        }

        System.out.println(factorial);
    
    }
}
