import java.util.Scanner;
 class minimal{
    public static void main(String args[]){
        int min_total=(60*24*365);
        Scanner minu =new Scanner(System.in);
        System.out.println("ENTER THE mMIN VALUE:");
        int minute=minu.nextInt();
        long years=(minute/min_total);
        int days=(minute/60/24)%365;

        System.out.println((int) minute + " minutes is approximately " + years + " years and " + days + " days");
    }




    }
   


