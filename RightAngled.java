import java.util.Scanner;

public class RightAngled {
    public static void main(String[] agr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of pattern : ");
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
