// import java.util.*;
// public class primefn {
//     public static boolean isPrime(int n){
//         boolean isPrime =true;
//         for(int i =2;i<=n-1;i++){
//             if(n%2==0){    // completely dividing 
//                 isPrime =false;
//             }
//         }
//         return isPrime;
//     }
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         System.out.println("enter your number");
//         int n =sc.nextInt();
//         System.out.println(isPrime(n));

//     }
  
// ----------------------*******************************-----------------------------

import java.util.*;
import java.util.Scanner;
public class primefn {
    public static boolean isPrime(int num){
        
        for(int i=2;i<=num-1;i++){
            if(num%2==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int n =sc.nextInt();
        int count = 0;
        int num =2;
        while (count<=n) {
            if(isPrime(num)){
                System.out.println("num"+num);
                count++;
            }
            num++;
        }
    }
}