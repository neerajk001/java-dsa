public class secondSmallest {
    public static void smallest(int number[]){
        int n = number.length;
        int smallestElem =Integer.MAX_VALUE;
        for(int i =0; i<n; i++){
            if(number[i]<smallestElem){
                smallestElem =number[i];
            }
        }
        System.out.println(smallestElem);

        int secondSmallestElem =Integer.MAX_VALUE;
        for(int i =0 ;i<n; i++){
            if(number[i]<secondSmallestElem && number[i]>smallestElem){
                secondSmallestElem =number[i];
            }
        }
        System.out.println(secondSmallestElem);
       
    }

    public static void main(String[] args) {
        int number[] ={12,34,56,34,78,90,4,3};
        smallest(number);
    }
}

