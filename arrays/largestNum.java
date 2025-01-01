package arrays;
import java.util.*;

public class largestNum {
    public static int getLargest(int number[]){
        int largest =Integer.MIN_VALUE;
        for(int i =0;i<number.length;i++){
            if(largest<number[i]){
                largest =number[i];
            }
        }
        return largest;

    }
    public static void main(String[] args) {
        int number[] ={34,56,96,12,34,78};
        int  array=getLargest(number);
        System.out.println(array);
    }
}
