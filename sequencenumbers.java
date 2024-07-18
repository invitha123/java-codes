import java.util.Scanner;
class sequencenumbers{
    public static void main(String args[]){

        Scanner num=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int number=num.nextInt();
        int count=1;

       for(int row=1;row<=number;row++){
             for(int col=1;col<=row;col++){
            System.out.print(count + " ");
            count++;
        }

        System.out.println();
       }
       
    }
}