import java.util.Arrays;

public class secondLargest {
  public static int getSecondlargest (int number[]){
    int n =number.length;

    // sort the array in the ascending order
    Arrays.sort(number);
    
    for(int i=n-2; i>=0; i--){
        if(number[i]!=number[n-1]){
          return number[i];
        }
    }
    return -1;
  }
  public static void main(String[] args) {
    int number[] ={3,4,12,56,34,34,23};
    System.out.println(getSecondlargest(number));
    
  }
  

}
