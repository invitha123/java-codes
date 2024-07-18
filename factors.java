import java.util.Scanner;

public class factors {
     public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        System.out.println("Enter the number to find factors");
        int number=m.nextInt();

        for(int i=1;i<=number;i++){
            if(number % i==0){
            System.out.print(i + " ");
                    }
        }

     }
}
