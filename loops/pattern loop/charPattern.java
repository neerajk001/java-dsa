

public class charPattern {
    public static void main(String[] args) {
        int n =4;
        char ch ='A';
        // outer loop
        for(int i=1;i<=n;i++){
            // inner loop
            for(int chars=1;chars<=i;chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println(" ");
        }
    }
}
