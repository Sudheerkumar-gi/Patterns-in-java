import java.util.Scanner;
public class ReverseNumberPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total numbers(like 15) : ");
        int n= sc.nextInt();
        int a=n/3;
        for(int i =a ; i>=1 ; i-- ){
            
            for(int j= n-i+1;j<=n ; j++){
                System.out.print(j +" ");
            }
            n=n-i;
            if(n<=0)
                break;
            System.out.println();
        }
        sc.close();
    }
}
