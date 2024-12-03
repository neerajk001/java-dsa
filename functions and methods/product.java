import java.util.Scanner;

public class product {
    public static int  numProduct(int a ,int b){
        int multiply =a*b;
        return multiply;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first number a");
        int a = sc.nextInt();
        System.out.println("enter your first number b");
        int b =sc.nextInt();
     int   multiply=    numProduct(a, b);
     System.out.println(multiply);

    }
}
