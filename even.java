import java.util.Scanner;
class even{
    public static void main(String args[]){

        Scanner num=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=num.nextInt();

        if(number%2==0){
            System.out.println(number + "is even number");
        }
        else{
            System.out.println(number + "is not even number");
        }
    }
}