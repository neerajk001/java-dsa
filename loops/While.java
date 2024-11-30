package loops;

import java.util.Scanner;

// public class While {

//   public static void main(String[] args) {
//     System.out.println("enter your number");
//     Scanner sc = new Scanner(System.in);
//     int n  =sc.nextInt();

//     int num =1;
//     while (num<=n) {
//       System.out.println(num);
//       num++;
//     }
//   }
// }


// sum of n natural number 

public class While {

  public static void main(String[] args) {
    System.out.println("enter your number");
    Scanner sc = new Scanner(System.in);
    int num =sc.nextInt();

     int n =num ;
     int i =1;
     int sum =0;
     while (i<num) {
      sum +=i;
      
      i++;
      
     }
     System.out.println(sum);
  }
}

