// package arrays;

public class reverseArray {
    public static void printReverse(int number[]){
        int first = 0;
        int last = number.length-1;
        while (first<last) {
             int temp =number[last];
            number [last] = number[first];
            number [first] =temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int number[] ={2,3,4,5,6,7,8,9,10};
       printReverse(number);
       for(int i =0;i<number.length;i++){
        System.out.println(number[i]);
       }
    }
}
