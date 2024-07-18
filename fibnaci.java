import java.util.Scanner;
class fibinacci{
    public static void main(String args[]){

        Scanner fib=new Scanner(System.in);
        System.out.println("Enter the fibinacci series number");
        int fibbi=fib.nextInt();
        int t1=0,t2=1,sum=0;


        for(int i=0;i<fibbi;i++){
        System.out.print(t1+" ");
        sum=t1+t2;
        t1=t2;
        t2=sum;
        }
    
        
    }
}