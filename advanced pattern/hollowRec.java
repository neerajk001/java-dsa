// package advanced pattern;

public class hollowRec {
    public static void  printHollow(int totRows ,int totCol){
        // outer loop
        for(int i =1; i<=totRows; i++){
            // inner loop
            for(int j=1; j<=totCol; j++){
                if(i == 1 || i == totRows || j== totCol || j == 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
public static void main(String[] args) {
    printHollow(4,5);
}}
