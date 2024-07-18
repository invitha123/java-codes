import java.util.Scanner;
class colseq{
    public static void main(String args[]){

        Scanner num=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int number=num.nextInt();


       for(int row=1;row<=number;row++){
             for(int col=row;col>=1;col--){
            System.out.print(col + " ");
        }

        System.out.println();
       }
       
    }
}