// package arrays;

public class linearSearch {
    public static int printLinear(int number[] ,int key){
        for(int i=0;i<number.length;i++){
            if(number[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] ={1,2,3,45,7,8,12,56};
        int key =12;
        int index =printLinear(number, key);
        if(index == -1){
            System.out.println("the number not found");
        }else{
            System.out.println("the number at index " + index );
        }

    }
}
