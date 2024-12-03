
import java.util.*;

public class basicFunction {
    public static void calculalteSum(int a,int b ){
        int  sum =  a+b;
        System.out.println("the sum of the number is  "+sum);
    }
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("enter a number a ");
        int a = sc.nextInt();
        System.out.println("enter a number a ");
        int b =sc.nextInt();
        
        calculalteSum(a, b);
        
    }
    
}
