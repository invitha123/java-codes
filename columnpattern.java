import java.util.Scanner;
class column{
    public static void main(String args[]){

        Scanner num=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int number=num.nextInt();

       for(int row=1;row<=number;row++){
             for(int col=1;col<=row;col++){
            System.out.print(col + " ");
        }

        System.out.println();
       }
       
    }
}