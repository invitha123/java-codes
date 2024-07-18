import java.util.Scanner;
class serieseven{
    public static void main(String args[]){
        Scanner num=new Scanner(System.in);
       System.out.println("ENTER THE NUMBER FOR RANGE");
       int number=num.nextInt();
       
       for(int i=0;i<=number;i++){
        if(i%2==0){
            System.out.print(i + " ");
        }
       }
        
        }
}