// package string;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // char [] ={'a' ,'b', 'c' ,'d'};
        // String str ='abcd';
        // String str2 = new String('xyz');

        // strings are immutable 
        // meaning the strings never changed 

        // Scanner sc = new Scanner(System.in);
        // String name;
        // // name =sc.next(); // took single word in input 
        // name =sc.nextLine();
        // System.out.println(name);

        //String fullname = "neeraj kushwaha"
        // in this length is not a property but a function 
        // System.out.println(fullname.length());


        String firstName ="neeraj";
        String LastName = "kushwaha";
        String fullName  = firstName + " " +LastName;
        System.out.println(fullName);
        // used to get the specified char from the word 
        System.out.println(fullName.charAt(5));
    }
}
