import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerInt=new Scanner(System.in);
        int a=scannerInt.nextInt();
        int b,c=0,m=1;
        while (a!=0){
            b=a%10;
            c+=b;
            a/=10;
        }
        while (a!=0){
            m=m*(a%10);
            a=a/10;
        }

        System.out.println(m);
        System.out.println(c);









    }
}