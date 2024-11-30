// package loops;

// public class Reverse {
//     public static void main(String[] args) {
//         int n = 10998;

//         // Using for loop
//         for (; n > 0; n /= 10) { // no initialization; condition is n > 0; update is n /= 10
//             int lastDigit = n % 10; // Get the last digit
//             System.out.print(lastDigit); // Print the last digit
//         }
//     }
// }




//----------------------------***************************************---------------------------------

// reverse the number 

public class reverse {

    public static void main(String[] args) {
        int n = 10899;
        int rev =0;
        
        while (n>0) {
           int  lastDigit =n%10;
            n =n/10;
            rev =(rev*10)+lastDigit;
            
           
        }
        System.out.println(rev);
       
    }
}