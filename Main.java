import java.util.Scanner;
class sum{
public static void main(String args[]){

    Scanner num=new Scanner(System.in);
    System.out.println("Enter the number between 0 to 1000");
    int number=num.nextInt();
    
    int sum=0;
    int digit1=number%10;
    int remaining=number/10;
    
    int digit2=remaining%10;
    remaining=remaining/10;
   
    int digit3=remaining%10;
     remaining=remaining/10;
   
    int digit4=remaining%10;
    remaining=remaining/10;
    
    sum=(digit1+digit2+digit3+digit4);
    System.out.println(sum);
}
}